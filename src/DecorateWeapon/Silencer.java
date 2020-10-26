/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateWeapon;

public class Silencer extends WeaponAttachment {

    Weapon weapon;

    public Silencer(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription()+", Silencer attached";
    }

    @Override
    public double cost() {
        return 1.2+weapon.cost();
    }

}
