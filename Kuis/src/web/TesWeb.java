/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import kuis.Pembobotan;
import kuis.Peserta;

/**
 *
 * @author Asus
 */
public class TesWeb extends Peserta implements Pembobotan{
    
    public TesWeb(String nik, String nama, double testulis, double tescoding, double teswawancara) {
        super(nik, nama, testulis, tescoding, teswawancara);
    }
    
    @Override
    public double hitungTulis() {
        return(testulis*0.4);
    }

    @Override
    public double hitungCoding() {
        return(tescoding*0.35);
    }

    @Override
    public double hitungWawancara() {
        return(teswawancara*0.25);
    }
    
}
