/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2.bidang;

/**
 *
 * @author Asus
 */
public class Lingkaran implements HitungBidang{

    public static double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double hitungluas() {
        return(Math.PI*jari*jari);
    }
    
    //Overloading
    public static double hitungluas(double jari) {
        return(Math.PI*jari*jari);
    }

    @Override
    public double hitungkeliling() {
        return(2*Math.PI*jari);
    }
 
}
