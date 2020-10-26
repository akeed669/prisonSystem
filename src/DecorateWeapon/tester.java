/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DecorateWeapon;


public class tester {
    public static void main(String[]args){
        Weapon weapon1=new AssaultRifle();
        System.out.println(weapon1.getDescription()+" $"+weapon1.cost());
        
        weapon1=new Silencer(weapon1);
        System.out.println(weapon1.getDescription()+" $"+weapon1.cost());
    }

}
