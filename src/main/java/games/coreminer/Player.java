/**
 * A player in this game. Every AI controls one player.
 */

// DO NOT MODIFY THIS FILE
// Never try to directly create an instance of this class, or modify its member variables.
// Instead, you should only be reading its variables and calling its functions.

package games.coreminer;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import org.json.JSONObject;
import joueur.Client;
import joueur.BaseGame;
import joueur.BaseGameObject;

// <<-- Creer-Merge: imports -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
// you can add additional import(s) here
// <<-- /Creer-Merge: imports -->>

/**
 * A player in this game. Every AI controls one player.
 */
public class Player extends GameObject {
    /**
     * The Tile this Player's base is on.
     */
    public Tile baseTile;

    /**
     * The bombs stored in the Player's supply.
     */
    public int bombs;

    /**
     * What type of client this is, e.g. 'Python', 'JavaScript', or some other language. For potential data mining purposes.
     */
    public String clientType;

    /**
     * The Tiles this Player's hoppers are on.
     */
    public List<Tile> hopperTiles;

    /**
     * If the player lost the game or not.
     */
    public boolean lost;

    /**
     * The amount of money this Player currently has.
     */
    public int money;

    /**
     * The name of the player.
     */
    public String name;

    /**
     * This player's opponent in the game.
     */
    public Player opponent;

    /**
     * The reason why the player lost the game.
     */
    public String reasonLost;

    /**
     * The reason why the player won the game.
     */
    public String reasonWon;

    /**
     * The Tiles on this Player's side of the map.
     */
    public List<Tile> side;

    /**
     * The Tiles this Player may spawn Units on.
     */
    public List<Tile> spawnTiles;

    /**
     * The amount of time (in ns) remaining for this AI to send commands.
     */
    public double timeRemaining;

    /**
     * Every Unit owned by this Player.
     */
    public List<Unit> units;

    /**
     * The amount of value (victory points) this Player has gained.
     */
    public int value;

    /**
     * If the player won the game or not.
     */
    public boolean won;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Player. Used during game initialization, do not call directly.
     */
    protected Player() {
        super();
        this.hopperTiles = new ArrayList<Tile>();
        this.side = new ArrayList<Tile>();
        this.spawnTiles = new ArrayList<Tile>();
        this.units = new ArrayList<Unit>();
    }


    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
