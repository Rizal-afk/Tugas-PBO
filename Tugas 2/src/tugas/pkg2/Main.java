/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkg2;

import java.util.Scanner;
import tugas2.bidang.Lingkaran;
import tugas2.bidang.PersegiPanjang;
import tugas2.ruang.Balok;
import tugas2.ruang.Kerucut;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double panjang,lebar,tinggi,jari;
        int pilih;
        do{
        System.out.println("Menu : ");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Exit");
        System.out.print("Pilih : ");
        pilih=input.nextInt();
        switch(pilih){
            case 1:
                System.out.print("Panjang : ");
                panjang=input.nextDouble();
                System.out.print("Lebar : ");
                lebar=input.nextDouble();
                System.out.print("Tinggi : ");
                tinggi=input.nextDouble();
                PersegiPanjang persegi = new PersegiPanjang(panjang,lebar);
                Balok balok = new Balok(panjang,lebar);
                System.out.println("Luas Persegi Panjang : "+ persegi.hitungluas());
                System.out.println("Keliling Persegi Panjang : "+ persegi.hitungkeliling());
                System.out.println("Volume Balok : "+ balok.hitungvolume(tinggi));
                System.out.println("Luas Permukaan Balok : "+ balok.hitungluasPermukaan(tinggi));
                break;
            
            case 2:
                System.out.print("Jari-jari: ");
                jari=input.nextDouble();
                System.out.print("Tinggi: ");
                tinggi=input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jari);
                Kerucut kerucut = new Kerucut(jari);
                System.out.println("Luas Lingkaran : "+ lingkaran.hitungluas());
                System.out.println("Keliling Lingkaran : "+ lingkaran.hitungkeliling());
                System.out.println("Volume Kerucut : "+ kerucut.hitungvolume(tinggi));
                System.out.println("Luas Permukaan Kerucut : "+ kerucut.hitungluasPermukaan(tinggi));
                break;
            
            default:
                System.out.println("Program Selesai");
                break;
        }
        }while(pilih!=3);
        
    }
    
}
