/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooae2test1;


public class GuardMessage {
    
    private int messageID;
    private String username;
    private String description;
    private String dateForDB;

    public GuardMessage(String username, String description, String dateForDB) {
        this.username = username;
        this.description = description;
        this.dateForDB = dateForDB;
    }

    public GuardMessage(String description, String dateForDB) {
        this.description = description;
        this.dateForDB = dateForDB;
    }           

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateForDB() {
        return dateForDB;
    }

    public void setDateForDB(String dateForDB) {
        this.dateForDB = dateForDB;
    }

    
    

    

    
    
    
   
}
