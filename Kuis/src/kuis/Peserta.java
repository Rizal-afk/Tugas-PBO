/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author Asus
 */
public class Peserta {
    public String nik,nama;
    public double testulis, tescoding, teswawancara;

    public Peserta(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        this.nik = nik;
        this.nama = nama;
        this.testulis = testulis;
        this.tescoding = tescoding;
        this.teswawancara = teswawancara;
    }
    
}
