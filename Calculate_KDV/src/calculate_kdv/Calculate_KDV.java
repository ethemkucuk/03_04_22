/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate_kdv;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Calculate_KDV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ürünün KDV'siz fiyatını giriniz: ");
        int fiyat = scan.nextInt();
        
        double yeni_fiyat = fiyat + (fiyat * 0.18);
        
        System.out.println("KDV'li fiyat = " + yeni_fiyat);
        // TODO code application logic here
    }
    
}
