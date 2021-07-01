/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author Asus
 */
import javax.swing.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

public class ViewData extends JFrame implements ActionListener, ListenerData, MouseListener{
    ControllerData cd = new ControllerData();
    ModelData md = new ModelData();
    String nama;
    int jmlData = cd.banyakData();
    String data[][] = new String[jmlData][5];
    
    //DEKLARASI KOMPONEN
    JTable tabel;
    DefaultTableModel tableModel; //otomatis dibuat kalo buat JTable
    JScrollPane scrollPane;
    Object namaKolom[] = {"Judul","Alur","Penokohan","Akting","Nilai"}; //membuat kolom dgn array tipe object;
    final JTextField fjudul = new JTextField(50);
    final JTextField falur = new JTextField(10);
    final JTextField fpenokohan = new JTextField(10);
    final JTextField fnilai = new JTextField(10);
    final JTextField fakting = new JTextField(10);
    JLabel ljudul= new JLabel("Judul");
    JLabel lalur = new JLabel("Alur");
    JLabel lpenokohan = new JLabel("Penokohan");
    JLabel lakting = new JLabel("Akting");
    JButton btnTambah = new JButton("Tambah");
    JButton btnUpdate = new JButton("Update");
    JButton btnDelete = new JButton("Delete");
    JButton btnClear = new JButton("Clear");
    
    public ViewData(){
        setLayout(null);
        setSize(1000,1000);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Responsi PBO");
        setDefaultCloseOperation(3);

        data = cd.ambilData();
        tabel = new JTable(data,namaKolom);//tabel merupakan variabel untuk tabelnya dengan isi tablemodel
        scrollPane = new JScrollPane(tabel);
        add(scrollPane);
        add(ljudul);
        add(fjudul);
        add(lalur);
        add(falur);
        add(lpenokohan);
        add(fpenokohan);
        add(lakting);
        add(fakting);
        add(btnTambah);
        add(btnUpdate);
        add(btnDelete);
        add(btnClear);

        scrollPane.setBounds(20, 35, 500, 345);
        
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
        ljudul.setBounds(550, 35, 120, 20);
        fjudul.setBounds(550, 60, 170, 20);
        lalur.setBounds(550, 90, 120, 20);
        falur.setBounds(550, 115, 170, 20);
        lpenokohan.setBounds(550, 145, 120, 20);
        fpenokohan.setBounds(550, 170, 170, 20);
        lakting.setBounds(550, 200, 120, 20);
        fakting.setBounds(550, 225, 170, 20);
        btnTambah.setBounds(550, 255, 80, 20);
        btnUpdate.setBounds(550, 285, 80, 20);
        btnDelete.setBounds(550, 315, 80, 20);
        btnClear.setBounds(550, 345, 80, 20);
        
        btnTambah.addActionListener(this);
        btnUpdate.addActionListener(this);
        btnDelete.addActionListener(this);
        btnClear.addActionListener(this); 
        tabel.addMouseListener(this);
        
        md.setDataListener(this);
        cd.setMd(md);
        if(jmlData==0)
                JOptionPane.showMessageDialog(null,"Data Tidak Ada!!");
    }
    
     public JTextField getFjudul() {
        return fjudul;
    }

    public JTextField getFalur() {
        return falur;
    }

    public JTextField getFpenokohan() {
        return fpenokohan;
    }
    
    public JTextField getFakting() {
        return fakting;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClear) {
            cd.resetData(this);
        }
        if (e.getSource() == btnTambah) {
            cd.tambahData(this);
        }
        if (e.getSource() == btnDelete) {
            cd.deleteData(this);
        }
        if (e.getSource() == btnUpdate) {
            cd.updateData(this);
        }
    }
    
    @Override
    public void onChange(ModelData modelData) {
        fjudul.setText(modelData.getJudul());
        falur.setText(modelData.getAlur());
        fpenokohan.setText(modelData.getPenokohan());
        fakting.setText(modelData.getAkting());
    }
    
    @Override //Memindahkan klik tabel ke textfield
    public void mouseClicked(MouseEvent e) {
    int baris = tabel.getSelectedRow();
    fjudul.setText(tabel.getValueAt(baris, 0).toString());
    falur.setText(tabel.getValueAt(baris, 1).toString());
    fpenokohan.setText( tabel.getValueAt(baris, 2).toString());
    fakting.setText(tabel.getValueAt(baris, 3).toString());
    nama=tabel.getValueAt(baris, 0).toString();
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    
}

