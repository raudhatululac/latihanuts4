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
public class SystemAnalyst extends Employee {

    public int bonus;

    public void BonusSystemAnalyst(int bonus) {
        this.bonus = bonus;
        this.bonus = 90000;
        System.out.println("Salary Employee System Analyst=" + salary);
        System.out.println("Bonus System Analyst =" + bonus);
    }
}
