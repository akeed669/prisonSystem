/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RemovalStrategy;

import ooae2test1.FormInmateManager;

public class UsingStrategy {

    private RemovePrisoner remove;

    public UsingStrategy(RemovePrisoner remove) {
        this.remove = remove;
    }

    public void performStrategy(String uN, String date, FormInmateManager fim) {
        remove.expel(uN, date, fim);
    }

}
