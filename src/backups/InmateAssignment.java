/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ooae2test1;


public class InmateAssignment {
    private int jobID;
    private String jobCategory;
    private String jobDescription;        
    private String dateForDB;
    private String username;

    public InmateAssignment(String jobCategory, String jobDescription, String dateForDB, String username) {
        this.jobCategory = jobCategory;
        this.jobDescription = jobDescription;
        this.dateForDB = dateForDB;
        this.username = username;
    }

    public InmateAssignment(String jobCategory, String jobDescription, String dateForDB) {
        this.jobCategory = jobCategory;
        this.jobDescription = jobDescription;
        this.dateForDB = dateForDB;
        //for populating individual inmate tasks table
    }
    
    

    public int getJobID() {
        return jobID;
    }

    public void setJobID(int jobID) {
        this.jobID = jobID;
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getDateForDB() {
        return dateForDB;
    }

    public void setDateForDB(String dateForDB) {
        this.dateForDB = dateForDB;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
