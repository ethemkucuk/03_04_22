/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package girilen_iki_sayının_değerlerini_değiştirme;

import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Girilen_İki_Sayının_Değerlerini_Değiştirme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sayi1,sayi2;
        int gecici;
        
        System.out.print("1. Sayiyi giriniz: ");
        sayi1 = scan.nextInt();
        System.out.print("2. Sayiyi giriniz: ");
        sayi2 = scan.nextInt();
        
        System.out.println("Degerler degistiriliyor...");
        
        gecici = sayi1;
        sayi1=sayi2;
        sayi2=gecici;
        
        System.out.println("1. Sayi = " + sayi1);
        System.out.println("2. Sayi = " + sayi2);
        // TODO code application logic here
    }
    
}
