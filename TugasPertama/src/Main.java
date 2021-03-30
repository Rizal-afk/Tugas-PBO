
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Main {
    
    public static void main(String[] args) {
        
        String nama,nim;
        int usia;
        float nilaiUts,nilaiUas;
        Scanner input = new Scanner(System.in);
        System.out.println("Input Data ====");
        System.out.print("Nama = ");
        nama = input.nextLine();
        
        System.out.print("NIM = ");
        nim = input.nextLine();
        
        System.out.print("Usia = ");
        usia = input.nextInt();
        
        System.out.print("UTS = ");
        nilaiUts = input.nextFloat();
        
        System.out.print("UAS = ");
        nilaiUas = input.nextFloat();
        System.out.println("");
        
        Mahasiswa mhs = new Mahasiswa(nama,nim,usia,nilaiUts,nilaiUas);
        int pilih;
        do{
        System.out.println("Opsi ====");
        System.out.println("1. Tampilkan data");
        System.out.println("2. Edit data");
        System.out.println("3. Exit");
        System.out.print("Pilih = ");
        pilih = input.nextInt();
        
        switch(pilih){
            case 1 :
                mhs.tampil();
                break;
            case 2 :
                mhs.edit();
                break;
            default :
                System.out.println("Program Selesai");
                break;
        }
        }while(pilih!=3);
        
        
    }
    
    
}
