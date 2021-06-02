/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android;

import kuis.Pembobotan;
import kuis.Peserta;

/**
 *
 * @author Asus
 */
public class TesAndroid extends Peserta implements Pembobotan{
    
    public TesAndroid(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        super(nik, nama, testulis, tescoding, teswawancara);
    }
    
    @Override
    public double hitungTulis() {
        return(testulis*0.2);
    }

    @Override
    public double hitungCoding() {
        return(tescoding*0.5);
    }

    @Override
    public double hitungWawancara() {
       return(teswawancara*0.3);
    }              
    
}
