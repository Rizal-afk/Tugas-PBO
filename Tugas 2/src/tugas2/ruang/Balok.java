/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

import tugas2.bidang.PersegiPanjang;

/**
 *
 * @author Asus
 */
public class Balok extends PersegiPanjang implements HitungRuang{

    public Balok(double panjang, double lebar) {
        super(panjang, lebar);
    }
    
    @Override
    public double hitungvolume(double tinggi) {
        return(PersegiPanjang.hitungluas(panjang,lebar)*tinggi);
    }

    @Override
    public double hitungluasPermukaan(double tinggi) {
        return(2*(panjang*lebar+panjang*tinggi+lebar*tinggi));
    }
    
}
