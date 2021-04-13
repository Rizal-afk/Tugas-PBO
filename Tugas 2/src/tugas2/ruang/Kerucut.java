/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.ruang;

import tugas2.bidang.Lingkaran;

/**
 *
 * @author Asus
 */
public class Kerucut extends Lingkaran implements HitungRuang{

    public Kerucut(double jari) {
        super(jari);
    }
    
    @Override
    public double hitungvolume(double tinggi) {
      return((Lingkaran.hitungluas(jari)*tinggi)/3);
    }
    
    
    @Override
    public double hitungluasPermukaan(double tinggi) {
        return(Math.PI*jari*(jari+Math.sqrt(jari*jari+tinggi*tinggi)));
    }

}
