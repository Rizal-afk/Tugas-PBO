/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Asus
 */
public class Persegi implements HitungBidang{
    public double panjang,lebar;

    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    @Override
    public double hitungLuas() {
        return(panjang*lebar);
    }

    @Override
    public double hitungKeliling() {
        return(2*(panjang+lebar));
    }
    
}
