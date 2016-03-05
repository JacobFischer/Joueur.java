/**
 * Generated by Creer at 12:33AM on March 01, 2016 UTC, git hash: 'f67dd2eb994fc0ce12bba97b92a5c185ebfa7a5d'
 * An object in the game. The most basic class that all game classes should inherit from automatically.
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

/**
 * An object in the game. The most basic class that all game classes should inherit from automatically.
 */
public class GameObject extends BaseGameObject {
    /**
     * String representing the top level Class that this game object is an instance of. Used for reflection to create new instances on clients, but exposed for convenience should AIs want this data.
     */
    public String gameObjectName;

    /**
     * Any strings logged will be stored here when this game object logs the strings. Intended for debugging.
     */
    public List<String> logs;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a GameObject. Used during game initialization, do not call directly.
     */
    public GameObject() {
        super();
        this.logs = new ArrayList<String>();
    }

    /**
     * Adds a message to this GameObject's logs. Intended for your own debugging purposes, as strings stored here are saved in the gamelog.
     *
     * @param   message  A string to add to this GameObject's log. Intended for debugging.
     */
    public void log(String message) {
        JSONObject args = new JSONObject();
        args.put("message", Client.getInstance().gameManager.serializeSafe(message));
        this.runOnServer("log", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
