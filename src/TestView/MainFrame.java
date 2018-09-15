/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Rosa
 */
public class MainFrame extends JDialog {

    JPanel panel;
    JLabel label_nama, label_judul, label_alamat, label_norekammedis ;
    JTextField tf_nama, tf_alamat, tf_norekammedis ;
    JButton button_simpan;

    public MainFrame () {

        panel = new JPanel();
        panel.setLayout(null);

        label_judul = new JLabel("DAFTAR PASIEN");
        label_judul.setBounds(100, 10, 100, 25);

        label_nama = new JLabel(" Nama ");
        label_nama.setBounds(10, 50, 50, 25);

        tf_nama = new JTextField();
        tf_nama.setBounds(70, 50, 200, 25);

        label_alamat = new JLabel(" alamat ");
        label_alamat.setBounds(10, 85, 50, 25);

        tf_alamat = new JTextField();
        tf_alamat.setBounds(70, 85, 200, 25);

        label_norekammedis = new JLabel("no.RM");
        label_norekammedis.setBounds(10, 120, 50, 25);

        tf_norekammedis = new JTextField();
        tf_norekammedis.setBounds(70, 120, 200, 25);
     
        button_simpan = new JButton(" simpan");
        button_simpan.setBounds(80, 160, 85, 25);

        panel.add(label_judul);
        panel.add(label_nama);
        panel.add(tf_nama);
        panel.add(label_alamat);
        panel.add(tf_alamat);
        panel.add(button_simpan);
        panel.add(label_norekammedis);
        panel.add(tf_norekammedis);
        this.add(panel);

        this.setVisible(true);

    }
    

    }


    

