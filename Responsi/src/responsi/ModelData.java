/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author Asus
 */
public class ModelData {
    public String judul,alur,penokohan,akting;
    Connector connector = new Connector(); 
    private ListenerData listenerData; 

    protected void fireOnChange() {
        if (listenerData != null) {
            listenerData.onChange(this);
        }
    }

    public ListenerData getDataListener() {
        return listenerData;
    }

    public void setDataListener(ListenerData listenerData) {
        this.listenerData = listenerData;
    }
 
    public int banyakData(){
        int jmlData=0;
        try{
            String query = "Select * from `movie"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return jmlData;
    }
    
    public String[][] ambilData(){
        String data[][] = new String[banyakData()][5];
        try{
            int jmlData = 0; //menampung jumlah data sebanyak jumlah data yang ada, defaultnya 0
            //menampung array. barisnya isinya di getBanyakData,kolomnya itu atribut
            String query = "Select * from movie"; //proses pengambilan data
            connector.statement = connector.koneksi.createStatement();
            ResultSet resultSet = connector.statement.executeQuery(query); //result isinya tabel belum berupa string
            while(resultSet.next()){ //konversi tabel ke string    
                data[jmlData][0] = resultSet.getString("judul"); 
                data[jmlData][1] = resultSet.getString("alur"); 
                data[jmlData][2] = resultSet.getString("penokohan");
                data[jmlData][3] = resultSet.getString("akting");
                data[jmlData][4] = resultSet.getString("nilai");
                jmlData++; 
            }
            connector.statement.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
        }
        return data;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
        fireOnChange();
    }

    public String getAlur() {
        return alur;
    }
    
    public void setAlur(String alur) {
        this.alur = alur;
        fireOnChange();
    }

    public String getPenokohan() {
        return penokohan;
    }
    
     public void setPenokohan(String penokohan) {
        this.penokohan = penokohan;
        fireOnChange();
    }

    public String getAkting() {
        return akting;
    }
    
     public void setAkting(String akting) {
        this.akting = akting;
        fireOnChange();
    }
    
    public void resetData() {
        setJudul("");
        setAlur("");
        setPenokohan("");
        setAkting("");
    }
    
    public double hitungNilai(ViewData viewOrang){
        double dAlur = Double.valueOf(viewOrang.getFalur().getText());
        double dPenokohan = Double.valueOf(viewOrang.getFpenokohan().getText());
        double dAkting = Double.valueOf(viewOrang.getFakting().getText());
        double nilai = (dAlur+dPenokohan+dAkting)/3;
        return nilai;
    }
    
    public void tambahData(ViewData viewOrang){
        String sJudul = viewOrang.getFjudul().getText();
        double dAlur = Double.valueOf(viewOrang.getFalur().getText());
        double dPenokohan = Double.valueOf(viewOrang.getFpenokohan().getText());
        double dAkting = Double.valueOf(viewOrang.getFakting().getText());
        double dNilai = hitungNilai(viewOrang);
            
        try {
            String query = "INSERT INTO movie VALUES ('"+sJudul+"','"+dAlur+"','"+dPenokohan+"','"+dAkting+"','"+dNilai+"')";  
            connector.statement = connector.koneksi.createStatement();
            connector.statement.executeUpdate(query);

            JOptionPane.showMessageDialog(null,"Insert Berhasil !!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Data Sudah Ada !!");
        }
    }
    
    public void updateData(ViewData viewOrang){
        String nama = viewOrang.nama;
        String sJudul = viewOrang.getFjudul().getText();
        double dAlur = Double.valueOf(viewOrang.getFalur().getText());
        double dPenokohan = Double.valueOf(viewOrang.getFpenokohan().getText());
        double dAkting = Double.valueOf(viewOrang.getFakting().getText());
        double dNilai = hitungNilai(viewOrang);
            
        try {
            String query = "update movie set judul=?, alur=?, penokohan=?, akting=?, nilai=? where judul=?";
            PreparedStatement preparedStmt = connector.koneksi.prepareStatement(query);
            preparedStmt.setString(1, sJudul);
            preparedStmt.setDouble(2, dAlur);
            preparedStmt.setDouble(3, dPenokohan);
            preparedStmt.setDouble(4, dAkting);
            preparedStmt.setDouble(5, dNilai);
            preparedStmt.setString(6, sJudul);
            preparedStmt.execute();
            
            if(nama.compareTo(sJudul)==0)
            JOptionPane.showMessageDialog(null,"Update Berhasil !!");
            else
                JOptionPane.showMessageDialog(null,"Data Tidak Ada!!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
        }
    }
    
    public void deleteData(ViewData viewOrang){
        String sJudul = viewOrang.getFjudul().getText();
        try {
            String query = "delete from movie where judul = ?";
            PreparedStatement preparedStmt = connector.koneksi.prepareStatement(query);
            preparedStmt.setString(1, sJudul);
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null,"Delete Berhasil !!");
        } catch (SQLException ex){
            System.err.println(ex.getMessage());
            JOptionPane.showMessageDialog(null,"Delete Gagal !!");
        }
    }

}
