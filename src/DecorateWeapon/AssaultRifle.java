/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateWeapon;

public class AssaultRifle extends Weapon {

    public AssaultRifle() {
        description = "Assault Rifle";
    }

    @Override
    public double cost() {
        return 6.5;
    }

}
