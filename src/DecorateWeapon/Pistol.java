/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateWeapon;

public class Pistol extends Weapon {

    public Pistol() {
        description = "Pistol";
    }

    @Override
    public double cost() {
        return 2.5;
    }

}
