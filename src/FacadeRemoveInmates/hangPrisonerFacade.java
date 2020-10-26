/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeRemoveInmates;

import AbstractTaskFactory.assignmentFactory;
import AbstractTaskFactory.assignmentFactoryProducer;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.Date;
import ooae2test1.*;


public class hangPrisonerFacade {

    prisonInmate hangMe;
    prisonGuard hangMan;
    wardenMethods theExecution;
    
    assignmentFactory gFactory=assignmentFactoryProducer.getFactory(true);

    Date theDate;
    String killDate;

    public hangPrisonerFacade(String date_to_store) throws SQLException, ParseException {

        killDate=date_to_store;
        hangMe = new prisonInmate();
        hangMan = new prisonGuard();
        theExecution = new wardenMethods();

    }

    public void hangPrisoner(String username, FormInmateManager fim) {
        hangMe.removeInmateTasks(username);
        hangMe.removeInmateNotes(username);
        hangMe.removeInmatePunishments(username);
        hangMe.removeInmate(username,fim);
//        hangMan.addNewGuardTask(new GuardAssignment("smith1", "Execution", "Hang Prisoner", killDate));
        hangMan.addNewGuardTask(gFactory.getAssignment("smith1", "Execution", "Hang Prisoner", killDate));
        theExecution.prisonerHanged(username, killDate);
    }
}
