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
public class PBO12_10116598_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Employee ME = new Employee();
        Designer MD = new Designer();
        Programmer MP = new Programmer();
        SystemAnalyst MS = new SystemAnalyst();
        MD.BonusDesigner(50000);
        MP.BonusProgramer(60000);
        MS.BonusSystemAnalyst(90000);
    }

}
