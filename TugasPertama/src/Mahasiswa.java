
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
public class Mahasiswa {
    String nama,nim;
    int usia;
    float nilaiUts,nilaiUas;
    
    public Mahasiswa(String nama, String nim, int usia, float nilaiUts, float nilaiUas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    
    void edit(){
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
    }
    
    void tampil(){
        System.out.println("Perkenalkan nama saya " + nama + ", nim " + nim + ",");
        System.out.println("Usia    : " + usia);
        System.out.println("Nilai Akhir   : " + hitungNilai(nilaiUts,nilaiUas));
        System.out.println("");
    }
    
    
    float hitungNilai(float nilaiUts,float  nilaiUas){
        return (nilaiUts + nilaiUas) / 2 ;
    }
}
