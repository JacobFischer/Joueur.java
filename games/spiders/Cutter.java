/**
 * Generated by Creer at 11:41PM on April 07, 2016 UTC, git hash: 'e7ec4e35c89d7556b9e07d4331ac34052ac011bd'
 * A Spiderling that can cut existing Webs.
 */
package games.spiders;

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
 * A Spiderling that can cut existing Webs.
 */
public class Cutter extends Spiderling {
    /**
     * The Web that this Cutter is trying to cut. Null if not cutting.
     */
    public Nest cuttingWeb;


    // <<-- Creer-Merge: fields -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional field(s) here. None of them will be tracked or updated by the server.
    // <<-- /Creer-Merge: fields -->>


    /**
     * Creates a new instance of a Cutter. Used during game initialization, do not call directly.
     */
    public Cutter() {
        super();
    }

    /**
     * Cuts a web, destroying it, and any Spiderlings on it.
     *
     * @param   web  The web you want to Cut. Must be connected to the Nest this Cutter is currently on.
     * @return True if the cut was successfully started, false otherwise.
     */
    public boolean cut(Web web) {
        JSONObject args = new JSONObject();
        args.put("web", Client.getInstance().gameManager.serializeSafe(web));
        return (boolean)this.runOnServer("cut", args);
    }

    // <<-- Creer-Merge: methods -->> - Code you add between this comment and the end comment will be preserved between Creer re-runs.
    // you can add addtional method(s) here.
    // <<-- /Creer-Merge: methods -->>
}
