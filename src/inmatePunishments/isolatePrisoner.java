/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmatePunishments;

import ooae2test1.popupMessage;

public class isolatePrisoner extends InmatePunishmentK {

    public isolatePrisoner(String username, String punishmentType, String dateForDB, String severity) {
        super(username, punishmentType, dateForDB, severity);
    }

    @Override
    public void assignPunishment(String uName, String dateForPunishment, String severity) {
        String days;
        
        switch (severity) {
            case "Soft":
                days = "1";
                break;

            case "Medium":
                days = "3";
                break;

            case "Hard":
                days = "5";
                break;
                
            default:days="0";
        }
        popupMessage.infoBox("The prisoner with the username " + "\"" + uName + "\"" +
                " will be put in solitary confinement for " + days+" days starting on " + dateForPunishment, "Information");
    }

}
