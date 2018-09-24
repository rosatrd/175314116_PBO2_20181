/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.PopupMenu;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Rosa
 */
public class MainPasienBaru extends JDialog {

    JPanel panel;
    JLabel label_nama, label_alamat, label_tempat, label_tanggal, label_bulan, label_tahun, label_judul, label_gender , label_noRM;
    JTextField tf_nama, tf_alamat, tf_tempat;
    JComboBox cb_tanggal, cb_bulan, cb_tahun;
    JRadioButton rb_wanita, rb_pria;
    JButton button_simpan;

    public MainPasienBaru() {
        this.setTitle(" Daftar Pasien Baru");
        this.setSize(400, 350);
        this.setLocation(250, 250);

        panel = new JPanel();
        panel.setLayout(null);

        label_judul = new JLabel(" Pasien Baru ");
        label_judul.setBounds(100, 10, 100, 25);

        label_nama = new JLabel("Nama");
        label_nama.setBounds(10, 50, 50, 25);

        tf_nama = new JTextField();
        tf_nama.setBounds(70, 50, 200, 25);

        label_alamat = new JLabel("alamat");
        label_alamat.setBounds(10, 85, 50, 25);

        tf_alamat = new JTextField();
        tf_alamat.setBounds(70, 85, 200, 25);

        label_tempat = new JLabel("tempat");
        label_tempat.setBounds(10, 120, 50, 25);

        tf_tempat = new JTextField();
        tf_tempat.setBounds(70, 120, 200, 25);

        label_tanggal = new JLabel("tanggal");
        label_tanggal.setBounds(10, 155, 150, 25);

        cb_tanggal = new JComboBox();
        cb_tanggal.addItem(1);
        cb_tanggal.addItem(2);
        cb_tanggal.addItem(3);
        cb_tanggal.addItem(4);
        cb_tanggal.addItem(5);
        cb_tanggal.addItem(6);
        cb_tanggal.addItem(7);
        cb_tanggal.addItem(8);
        cb_tanggal.addItem(9);
        cb_tanggal.addItem(10);
        cb_tanggal.addItem(11);
        cb_tanggal.addItem(12);
        cb_tanggal.addItem(13);
        cb_tanggal.addItem(14);
        cb_tanggal.addItem(15);
        cb_tanggal.addItem(16);
        cb_tanggal.addItem(17);
        cb_tanggal.addItem(18);
        cb_tanggal.addItem(19);
        cb_tanggal.addItem(20);
        cb_tanggal.addItem(21);
        cb_tanggal.addItem(22);
        cb_tanggal.addItem(23);
        cb_tanggal.addItem(24);
        cb_tanggal.addItem(25);
        cb_tanggal.addItem(26);
        cb_tanggal.addItem(27);
        cb_tanggal.addItem(28);
        cb_tanggal.addItem(29);
        cb_tanggal.addItem(30);
        cb_tanggal.addItem(31);
        cb_tanggal.setBounds(70, 155, 50, 25);

//          label_bulan = new JLabel ("bulan");
//        label_bulan.setBounds(130, 155, 50, 25);
        cb_bulan = new JComboBox();
        cb_bulan.addItem("januari");
        cb_bulan.addItem("february");
        cb_bulan.addItem("maret");
        cb_bulan.addItem("april");
        cb_bulan.addItem("mei");
        cb_bulan.addItem("juni");
        cb_bulan.addItem("juli");
        cb_bulan.addItem("agustus");
        cb_bulan.addItem("september");
        cb_bulan.addItem("oktober");
        cb_bulan.addItem("november");
        cb_bulan.addItem("desember");
        cb_bulan.setBounds(130, 155, 80, 25);

//        label_tahun = new JLabel ("tahun");
//        label_tahun.setBounds(280, 155, 80, 25);
        cb_tahun = new JComboBox();
        cb_tahun.addItem(1991);
        cb_tahun.addItem(1992);
        cb_tahun.addItem(1993);
        cb_tahun.addItem(1994);
        cb_tahun.addItem(1995);
        cb_tahun.addItem(1996);
        cb_tahun.addItem(1997);
        cb_tahun.addItem(1998);
        cb_tahun.addItem(1999);
        cb_tahun.addItem(2000);
        cb_tahun.addItem(2001);
        cb_tahun.addItem(2002);
        cb_tahun.setBounds(220, 155, 80, 25);

        label_gender = new JLabel("Gender");
        label_gender.setBounds(10, 190, 50, 25);

        rb_wanita = new JRadioButton("Wanita");
        rb_wanita.setBounds(70, 190, 80, 25);

        rb_pria = new JRadioButton("Pria");
        rb_pria.setBounds(160, 190, 50, 25);

        ButtonGroup ButtonGender = new ButtonGroup();
        ButtonGender.add(rb_wanita);
        ButtonGender.add(rb_pria);

        button_simpan = new JButton("simpan");
        button_simpan.setBounds(100, 250, 85, 25);

        panel.add(label_judul);
        panel.add(label_nama);
        panel.add(tf_nama);
        panel.add(label_alamat);
        panel.add(tf_alamat);
        panel.add(label_tempat);
        panel.add(tf_tempat);
        panel.add(label_tanggal);
        panel.add(cb_tanggal);
//        panel.add(label_bulan);
        panel.add(cb_bulan);
//        panel.add(label_tahun);
        panel.add(cb_tahun);
        panel.add(label_gender);
        panel.add(rb_wanita);
        panel.add(rb_pria);
        panel.add(button_simpan);

        this.add(panel);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        MainPasienBaru test = new MainPasienBaru();
        test.setSize(400, 350);
        test.setVisible(true);
        test.setTitle("Daftar Pasien Baru");
    }

    MainPasienBaru(String dialog_baru) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
