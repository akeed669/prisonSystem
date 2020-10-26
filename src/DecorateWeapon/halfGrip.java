/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateWeapon;

public class halfGrip extends WeaponAttachment {

    Weapon weapon;

    public halfGrip(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription()+", half Grip attached";
    }

    @Override
    public double cost() {
        return 0.8+weapon.cost();
    }

}
