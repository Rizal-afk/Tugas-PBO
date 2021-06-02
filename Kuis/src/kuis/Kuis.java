/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

import android.TesAndroid;
import java.util.Scanner;
import web.TesWeb;

/**
 *
 * @author Asus
 */
public class Kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nik,nama;
        double testulis,tescoding,teswawancara;
        int pilih;
        System.out.println("FORM PENDAFTARAN ");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Pilih Jenis Form : ");
        pilih=input.nextInt();
        switch(pilih){
            case 1:
                System.out.println("");
                System.out.println("FORM PENDAFTARAN ");
                System.out.println("");
                
                input.nextLine();
                System.out.print("Input NIK : ");
                nik = input.nextLine();
                
                System.out.print("Input Nama : ");
                nama = input.nextLine();
                
                System.out.print("Input Nilai Tes Tulis : ");
                testulis = input.nextDouble();
                
                System.out.print("Input Nilai Tes Coding : ");
                tescoding = input.nextDouble();
                
                System.out.print("Input Nilai Tes Wawancara : ");
                teswawancara = input.nextDouble();
                
                TesAndroid tesandroid = new TesAndroid(nik,nama,testulis,tescoding,teswawancara);
                do{
                System.out.println("Menu ");
                System.out.println("1. Edit ");
                System.out.println("2. Tampil ");
                System.out.println("3. Exit ");
                System.out.print("Pilih : ");
                pilih=input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.print("Input Nilai Tes Tulis : ");
                        testulis = input.nextDouble();
                
                        System.out.print("Input Nilai Tes Coding : ");
                        tescoding = input.nextDouble();
                
                        System.out.print("Input Nilai Tes Wawancara : ");
                        teswawancara = input.nextDouble();
                        
                        tesandroid.testulis=testulis;
                        tesandroid.tescoding=tescoding;
                        tesandroid.teswawancara=teswawancara;
                        break;
                    case 2 :
                        double tulis,coding,wawancara,nilaiakhir;
                        tulis = tesandroid.hitungTulis();
                        coding = tesandroid.hitungCoding();
                        wawancara = tesandroid.hitungWawancara();
                        nilaiakhir = tulis + coding + wawancara;
                        
                        String keterangan;
                        
                        if(nilaiakhir >= 85){
                            keterangan = "LOLOS";
                            System.out.println("Nilai Akhir = "+nilaiakhir);
                            System.out.println("Keterangan = "+keterangan);
                            System.out.println("Selamat kepada "+tesandroid.nama+" telah diterima sebagai Android");
                        }
                        else{
                            keterangan = "GAGAL";
                            System.out.println("Nilai Akhir = "+nilaiakhir);
                            System.out.println("Keterangan = "+keterangan);
                            System.out.println("Mohon maaf kepada "+tesandroid.nama+" telah ditolak sebagai Android");
                        }
                        break;
                    default :
                        break;
                }
                }while(pilih!=3);
                
                break;
            
            case 2:
                System.out.println("");
                System.out.println("FORM PENDAFTARAN ");
                System.out.println("");
                
                input.nextLine();
                System.out.print("Input NIK : ");
                nik = input.nextLine();
                
                System.out.print("Input Nama : ");
                nama = input.nextLine();
                
                System.out.print("Input Nilai Tes Tulis : ");
                testulis = input.nextDouble();
                
                System.out.print("Input Nilai Tes Coding : ");
                tescoding = input.nextDouble();
                
                System.out.print("Input Nilai Tes Wawancara : ");
                teswawancara = input.nextDouble();
                
                TesWeb tesweb = new TesWeb(nik,nama,testulis,tescoding,teswawancara);
                do{
                System.out.println("Menu ");
                System.out.println("1. Edit ");
                System.out.println("2. Tampil ");
                System.out.println("3. Exit ");
                System.out.print("Pilih : ");
                pilih=input.nextInt();
                switch(pilih){
                    case 1 : 
                        System.out.print("Input Nilai Tes Tulis : ");
                        testulis = input.nextDouble();
                
                        System.out.print("Input Nilai Tes Coding : ");
                        tescoding = input.nextDouble();
                
                        System.out.print("Input Nilai Tes Wawancara : ");
                        teswawancara = input.nextDouble();
                        
                        tesweb.testulis=testulis;
                        tesweb.tescoding=tescoding;
                        tesweb.teswawancara=teswawancara;
                        break;
                    case 2 :
                        double tulis,coding,wawancara,nilaiakhir;
                        tulis = tesweb.hitungTulis();
                        coding = tesweb.hitungCoding();
                        wawancara = tesweb.hitungWawancara();
                        nilaiakhir = tulis + coding + wawancara;
                        
                        String keterangan;
                        
                        if(nilaiakhir >= 85){
                            keterangan = "LOLOS";
                            System.out.println("Nilai Akhir = "+nilaiakhir);
                            System.out.println("Keterangan = "+keterangan);
                            System.out.println("Selamat kepada "+tesweb.nama+" telah diterima sebagai Web");
                        }
                        else{
                            keterangan = "GAGAL";
                            System.out.println("Nilai Akhir = "+nilaiakhir);
                            System.out.println("Keterangan = "+keterangan);
                            System.out.println("Mohon maaf kepada "+tesweb.nama+" telah ditolak sebagai Web");
                        }
                        break;
                    default :
                        break;
                }
                }while(pilih!=3);
                
                break;
            
            default:
                break;
        }
    }
    
}
