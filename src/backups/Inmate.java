/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inmateDuty;

//import java.text.SimpleDateFormat;
import java.time.LocalDate;


public abstract class Inmate {
    
    int inmateID;
    String firstName;
    String lastName;
    char gender;
    String description;
    String conviction;
//    String datePattern;
//    SimpleDateFormat admissionDate;
    LocalDate admissionDate;
    
    public abstract void assignDuty();
    
    public abstract void givePunishment();

}
