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
public class Programmer extends Employee {

    public int bonus;

    public void BonusProgramer(int bonus) {
        this.bonus = bonus;
        this.bonus = 60000;
        System.out.println("Salary Employee Programmer  =" + salary);
        System.out.println("Bonus Programmer  =" + bonus);
    }
}
