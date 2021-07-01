/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class ControllerData {
    int a;
    private ModelData md = new ModelData();
    public void setMd(ModelData md) {
        this.md = md;
    }

    public int banyakData(){
        a=md.banyakData();
        return(a);
    }
    
    public String[][] ambilData(){
        String data[][] = new String [a][5]; 
        data=md.ambilData();
        return(data);
    }
    
   public void resetData(ViewData viewData) {
        String judul = viewData.getFjudul().getText();
        String alur = viewData.getFalur().getText();
        String penokohan = viewData.getFpenokohan().getText();
        String akting = viewData.getFakting().getText();
        if (judul.equals("") && alur.equals("") && penokohan.equals("") && akting.equals("")) {
        } 
        else {
            md.resetData();
        }
    }
   
    public void tambahData(ViewData viewData) {
        String judul = viewData.getFjudul().getText();
        String alur = viewData.getFalur().getText();
        String penokohan = viewData.getFpenokohan().getText();
        String akting = viewData.getFakting().getText();
        if (judul.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (alur.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (penokohan.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        }else if (akting.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else {
            md.tambahData(viewData);
            viewData.dispose();
            new ViewData();
        }
    }
    
    public void updateData(ViewData viewData) {
        String judul = viewData.getFjudul().getText();
        String alur = viewData.getFalur().getText();
        String penokohan = viewData.getFpenokohan().getText();
        String akting = viewData.getFakting().getText();
        if (judul.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (alur.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (penokohan.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        }else if (akting.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else {
            md.updateData(viewData);
            viewData.dispose();
            new ViewData();
        }
    }
    
    public void deleteData(ViewData viewData) {
        String judul = viewData.getFjudul().getText();
        String alur = viewData.getFalur().getText();
        String penokohan = viewData.getFpenokohan().getText();
        String akting = viewData.getFakting().getText();
        if (judul.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (alur.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else if (penokohan.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        }else if (akting.equals("")) {
            JOptionPane.showMessageDialog(viewData, "Isi Kolom Kosong Terlebih Dahulu !");
        } else {
            md.deleteData(viewData);
            viewData.dispose();
            new ViewData();
        }
    }

}
