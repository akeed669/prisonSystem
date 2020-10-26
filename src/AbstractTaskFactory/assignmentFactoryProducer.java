/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AbstractTaskFactory;

public class assignmentFactoryProducer {
     public static assignmentFactory getFactory(boolean forGuard){   
      if(forGuard){
         return new guardAssignmentFactory();         
      }else{
         return new inmateAssignmentFactory();
      }
   }
}
