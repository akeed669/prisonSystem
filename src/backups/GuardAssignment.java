/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooae2test1;


public class GuardAssignment {
    
    private int assignmentID;
    private String username;
    private String taskType;
    private String description;
    private String dateForDB;

    public GuardAssignment(String username, String taskType, String description, String dateForDB) {
        this.username = username;
        this.taskType = taskType;
        this.description = description;
        this.dateForDB = dateForDB;
    }

    public GuardAssignment(String taskType, String description, String dateForDB) {
        this.taskType = taskType;
        this.description = description;
        this.dateForDB = dateForDB;
        //for populating individual guards tasks table
    }
    
    

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTaskType() {
        return taskType;
    }

    public void setTaskType(String taskType) {
        this.taskType = taskType;
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
