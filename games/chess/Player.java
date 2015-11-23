/** 
 * Generated by Creer at 09:34PM on November 23, 2015 UTC, git hash: '1b69e788060071d644dd7b8745dca107577844e1'
 * A player in this game. Every AI controls one player.
 */
package games.chess;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;

import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;
// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add addtional import(s) here
// <<-- /Creer-Merge: imports -->>
@SuppressWarnings("unused")

/**
 * A player in this game. Every AI controls one player.
 */
public class Player extends GameObject {
    /**
     * What type of client this is, e.g. 'Python', 'JavaScript', or some other language. For potential data mining purposes.
     */
    public String clientType;

    /**
     * The direction your checkers must go along the file (y) axis until they reach the other side.
     */
    public int fileDirection;

    /**
     * if the player lost the game or not
     */
    public boolean lost;

    /**
     * If the Player has made thier move for the turn. true means they can no longer move a piece this turn.
     */
    public boolean madeMove;

    /**
     * The name of the player
     */
    public String name;

    /**
     * this player's opponent in the game.
     */
    public Player otherPlayer;

    /**
     * All the chess pieces owned by this player.
     */
    public List<Piece> pieces;

    /**
     * the reason why the player lost the game
     */
    public String reasonLost;

    /**
     * the reason why the player won the game
     */
    public String reasonWon;

    /**
     * The amount of time (in ns) remaining for this AI to send commands.
     */
    public float timeRemaining;

    /**
     * if the player won the game or not
     */
    public boolean won;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of Player. Used during game initialization, do not call directly.
     */
    public Player() {
        super();
        this.pieces = new ArrayList<Piece>();
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
