/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inmatePunishments;

public abstract class InmatePunishmentK {

    private int punishmentID;
    private String username;
    private String punishmentType;
    private String dateForDB;
    private String severity;
//    private punishmentLevel pLevel;

    public InmatePunishmentK(String username, String punishmentType, String dateForDB, String severity) {
        this.username = username;
        this.punishmentType = punishmentType;
        this.dateForDB = dateForDB;
        this.severity = severity;
    }

    public int getPunishmentID() {
        return punishmentID;
    }

    public void setPunishmentID(int punishmentID) {
        this.punishmentID = punishmentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPunishmentType() {
        return punishmentType;
    }

    public void setPunishmentType(String punishmentType) {
        this.punishmentType = punishmentType;
    }

    public String getDateForDB() {
        return dateForDB;
    }

    public void setDateForDB(String dateForDB) {
        this.dateForDB = dateForDB;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public abstract void assignPunishment(String uName, String dateForPunishment, String severity);

}
