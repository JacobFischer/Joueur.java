/**
 * This is where you build your AI for the Chess game.
 */
package games.chess;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import joueur.BaseAI;

/**
 * This is where you build your AI for the Chess game.
 */
public class AI extends BaseAI {
    /**
     * This is the Game object itself, it contains all the information about the current game
     */
    public Game game;

    /**
     * This is your AI's player. This AI class is not a player, but it should command this Player.
     */
    public Player player;

    /**
     * This returns your AI's name to the game server. Just replace the string.
     * @return string of you AI's name
     */
    public String getName() {
        return "Chess Java Player"; // REPLACE THIS WITH YOUR TEAM NAME!
    }

    /**
     * This is automatically called when the game first starts, once the Game object and all GameObjects have been initialized, but before any players do anything.
     * This is a good place to initialize any variables you add to your AI, or start tracking game objects.
     */
    public void start() {
        super.start();
    }

    /**
     * This is automatically called every time the game (or anything in it) updates.
     * If a function you call triggers an update this will be called before that function returns.
     */
    public void gameUpdated() {
        super.gameUpdated();
    }

    /**
     * This is automatically called when the game ends.
     * You can do any cleanup of you AI here, or do custom logging. After this function returns the application will close.
     * @param  won  true if your player won, false otherwise
     * @param  name  reason">a string explaining why you won or lost
     */
    public void ended(boolean won, String reason) {
        super.ended(won, reason);
    }


    /**
     * This is called every time the AI is asked to respond with a command during their turn
     *
     * @return represents if you want to end your turn. true means end the turn, false means to keep your turn going and re-call runTurn()
     */
    public boolean runTurn() {
        // Here is where you'll want to code your AI.

        // We've provided sample code that:
        //    1) prints the board to the console
        //    2) prints the opponent's last move to the console
        //    3) prints how much time remaining this AI has to calculate moves
        //    4) makes a random (and probably invalid) move.

        // 1) print the board to the console
        for(int file = 9; file >= -1; file--) {
            String str = "";
            if(file == 9 || file == 0) { // then the top or bottom of the board
                str = "   +------------------------+";
            }
            else if(file == -1) { // then show the ranks
                str = "     a  b  c  d  e  f  g  h";
            }
            else { // board
                str += " " + file + " |";
                // fill in all the ranks with pieces at the current rank
                for(int rankOffset = 0; rankOffset < 8; rankOffset++) {
                    String rank = "" + (char)(((int)"a".charAt(0)) + rankOffset); // start at a, with with rank offset increasing the char;
                    Piece currentPiece = null;
                    for(int i = 0; i < this.game.pieces.size(); i++) {
                        Piece piece = this.game.pieces.get(i);
                        if(piece.rank.equals(rank) && piece.file == file) { // then we found the piece at (rank, file)
                            currentPiece = piece;
                            break;
                        }
                    }

                    char code = '.'; // default "no piece";
                    if(currentPiece != null) {
                        code = currentPiece.type.charAt(0);

                        if(currentPiece.type == "Knight") { // 'K' is for "King", we use 'N' for "Knights"
                            code = 'N';
                        }

                        if(currentPiece.owner.id == "1") { // the second player (black) is lower case. Otherwise it's upppercase already
                            code = Character.toLowerCase(code);
                        }
                    }

                    str += " " + code + " ";
                }

                str += "|";
            }

            System.out.println(str);
        }

        // 2) print the opponent's last move to the console
        if(this.game.moves.size() > 0) {
            System.out.println("Opponent's Last Move: '" + this.game.moves.get(this.game.moves.size() - 1) + "'");
        }

        // 3) print how much time remaining this AI has to calculate moves
        System.out.println("Time Remaining: " + this.player.timeRemaining + " ns");

        // 4) make a random (and probably invalid) move.
        java.util.Random rand = new java.util.Random();
        Piece randomPiece = this.player.pieces.get(rand.nextInt(this.player.pieces.size()));
        String randomRank = "" + (char)(((int)"a".charAt(0)) + rand.nextInt(8));
        int randomFile = rand.nextInt(8) + 1;
        randomPiece.move(randomRank, randomFile);

        return true; // to signify we are done with our turn.
    }
}
