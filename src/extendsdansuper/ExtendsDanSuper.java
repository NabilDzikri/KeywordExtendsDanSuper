/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendsdansuper;

/**
 *
 * @author ASUS
 */
public class ExtendsDanSuper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toko input = new Toko();
        Kulkas input2 = new Kulkas();
        Meja input3 = new Meja();
        
        input.admin();
        System.out.println("===============================================");
        input3.Meja();
        System.out.println("===============================================");
        input2.Kulkas();
        System.out.println("===============================================");
    }
    
}
