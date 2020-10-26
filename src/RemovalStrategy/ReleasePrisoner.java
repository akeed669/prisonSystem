/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemovalStrategy;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ooae2test1.FormInmateManager;
import FacadeRemoveInmates.releasePrisonerFacade;

public class ReleasePrisoner implements RemovePrisoner {

    @Override
    public void expel(String uN, String date,FormInmateManager fim) {
        try {
            releasePrisonerFacade releaseProcess = new releasePrisonerFacade(date);
            releaseProcess.releasePrisoner(uN,fim);
        } catch (SQLException | ParseException ex) {
            Logger.getLogger(ReleasePrisoner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
