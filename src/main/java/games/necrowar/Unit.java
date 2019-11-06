/**
 * A unit in the game. May be a worker, zombie, ghoul, hound, abomination, wraith or horseman.
 */

// DO NOT MODIFY THIS FILE
// Never try to directly create an instance of this class, or modify its member variables.
// Instead, you should only be reading its variables and calling its functions.

package games.necrowar;

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
 * A unit in the game. May be a worker, zombie, ghoul, hound, abomination, wraith or horseman.
 */
public class Unit extends GameObject {
    /**
     * Whether or not this Unit has attacked this turn or not.
     */
    public boolean attacked;

    /**
     * Whether or not this Unit has built a tower (workers only) this turn or not.
     */
    public boolean built;

    /**
     * The remaining health of a unit.
     */
    public int health;

    /**
     * Whether or not this Unit has moved yet this turn.
     */
    public boolean moved;

    /**
     * The number of moves this unit has left this turn.
     */
    public int moves;

    /**
     * The Player that owns and can control this Unit.
     */
    public Player owner;

    /**
     * The Tile this Unit is on.
     */
    public Tile tile;

    /**
     * The type of unit this is.
     */
    public uJob uJob;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Unit. Used during game initialization, do not call directly.
     */
    protected Unit() {
        super();
    }

    /**
     * Attacks an enemy tower on an adjacent tile.
     *
     * @param   tile  The Tile to attack.
     * @return True if successfully attacked, false otherwise.
     */
    public boolean attack(Tile tile) {
        JSONObject args = new JSONObject();
        args.put("tile", Client.getInstance().gameManager.serializeSafe(tile));
        return (boolean)this.runOnServer("attack", args);
    }

    /**
     * Unit, if it is a worker, builds a tower on the tile it is on, only workers can do this.
     *
     * @param   tile  The tile the unit is on/builds on.
     * @param   tJob  The type of tower that is being built. 'arrow', 'aoe', 'ballista', or 'cleansing'.
     * @return True if successfully built, false otherwise.
     */
    public boolean build(Tile tile, tJob tJob) {
        JSONObject args = new JSONObject();
        args.put("tile", Client.getInstance().gameManager.serializeSafe(tile));
        args.put("tJob", Client.getInstance().gameManager.serializeSafe(tJob));
        return (boolean)this.runOnServer("build", args);
    }

    /**
     * Stops adjacent to a river tile and begins fishing for mana.
     *
     * @param   tile  The tile the unit will stand on as it fishes.
     * @return True if successfully began fishing for mana, false otherwise.
     */
    public boolean fish(Tile tile) {
        JSONObject args = new JSONObject();
        args.put("tile", Client.getInstance().gameManager.serializeSafe(tile));
        return (boolean)this.runOnServer("fish", args);
    }

    /**
     * Enters an empty mine tile and is put to work gathering resources.
     *
     * @param   tile  The tile the mine is located on.
     * @return True if successfully entered mine and began mining, false otherwise.
     */
    public boolean mine(Tile tile) {
        JSONObject args = new JSONObject();
        args.put("tile", Client.getInstance().gameManager.serializeSafe(tile));
        return (boolean)this.runOnServer("mine", args);
    }

    /**
     * Moves this Unit from its current Tile to an adjacent Tile.
     *
     * @param   tile  The Tile this Unit should move to.
     * @return True if it moved, false otherwise.
     */
    public boolean move(Tile tile) {
        JSONObject args = new JSONObject();
        args.put("tile", Client.getInstance().gameManager.serializeSafe(tile));
        return (boolean)this.runOnServer("move", args);
    }


    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add additional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
