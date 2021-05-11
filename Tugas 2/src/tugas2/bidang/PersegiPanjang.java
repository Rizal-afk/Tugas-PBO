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
public class PersegiPanjang implements HitungBidang{

    public static double panjang;
    public static double lebar;
    public static double luas;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungluas() {
        luas=panjang*lebar;
        return(panjang*lebar);
    }
    
    //Overloading
    public static double hitungluas(double panjang,double lebar) {
        luas=panjang*lebar;
        return(luas);
    }

    @Override
    public double hitungkeliling() {
        return(2*(panjang+lebar));
    }

}
