/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;


/**
 *
 * @author Asus
 */
public class Balok extends Persegi implements HitungRuang{
    double tinggi;

    public Balok(double tinggi, double panjang, double lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
       return(panjang*lebar*tinggi);
    }

    @Override
    public double hitungLuaspermukaan() {
        return(2*(panjang*lebar+panjang*tinggi+lebar*tinggi));
    }
    
}
