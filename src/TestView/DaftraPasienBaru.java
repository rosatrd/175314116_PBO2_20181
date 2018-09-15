/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import View.MainPasienBaru;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rosa
 */
public class DaftraPasienBaru extends JDialog{
    
    JPanel panel ;
    JLabel label_nama , label_alamat , label_TTL ,label_tanggal , label_bulan , label_tahun , label_judul ;
    JTextField tf_nama , tf_alamat , tf_tanggal , tf_bulan , tf_tahun , tf_TTL  ;
    JButton button_simpan ;
    
    
    public TambahPasienBaru(){
        this.setTitle(" Pasien Baru");
        this.setSize(300, 250);
        this.setLocation(250, 250);
        
        panel = new JPanel();
        panel.setLayout(null);
        
       label_judul = new JLabel(" Pasien Baru ");
       label_judul.setBounds(100, 10, 100, 25);
       
       label_nama = new JLabel("Nama");
       label_nama.setBounds(10, 50, 50, 25);
       
       tf_nama = new JTextField();
       tf_nama.setBounds(70, 50,200, 25);
       
       label_alamat = new JLabel("alamat");
       label_alamat.setBounds(10, 85, 50, 25);
       
       tf_alamat = new JTextField ();
       tf_alamat.setBounds(70, 85, 200, 25);
       
//       label_TTL= new JLabel ("TTL");
//       label_TTL.setBounds(10, 120, 50, 25);
//       
//       tf_TTL = new JTextField ();
//       tf_TTL.setBounds(70, 120, 200, 25);
        
        

//        ButtonGroup TTLButtonGroup = new ButtonGroup ();
//        TTLButtonGroup = new ButtonGroup("tanggal");
//        TTLButtonGroup.add(button_simpan);
        
            panel.add(label_judul);
            panel.add(label_nama);
            panel.add(tf_nama);
            panel.add(label_alamat);
            panel.add(tf_alamat);
            
            this.add(panel);
            this.setVisible(true);
            
            
       
    }
    public static void main(String[] args) {
       MainPasienBaru TambahPasienBaru = new MainPasienBaru();
       
        
    }
{
    
}
