/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecorateWeapon;

public class nightVision extends WeaponAttachment {

    Weapon weapon;

    public nightVision(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public String getDescription() {
        return weapon.getDescription() + ", night Vision lens attached";
    }

    @Override
    public double cost() {
        return 3.5 + weapon.cost();
    }

}
