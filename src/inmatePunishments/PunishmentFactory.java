/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inmatePunishments;


public class PunishmentFactory {
    public InmatePunishmentK getPunishment(String uN,String taskType,String dateOf,String sT){
        
        if(taskType.equalsIgnoreCase("Isolation")){
            return new isolatePrisoner(uN, taskType, dateOf, sT);
        }
        
        else if(taskType.equalsIgnoreCase("Starvation")){
            return new starvePrisoner(uN, taskType, dateOf, sT);
        }
        
        return null;
    }
}
