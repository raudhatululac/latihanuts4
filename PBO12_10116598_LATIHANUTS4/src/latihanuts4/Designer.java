/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuts4;

/**
 *
 * @author Raudhatul Ula Camalia (10116598) PBO-12
 */
public class Designer extends Employee {

    public int bonus;

    public void BonusDesigner(int bonus) {
        this.bonus = bonus;

        System.out.println("Salary Employee Designer  =" + salary);
        System.out.println("Bonus Designer  =" + bonus);
    }
}
