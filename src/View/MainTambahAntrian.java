/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Pasien;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Rosa
 */
public class MainTambahAntrian extends JDialog implements ActionListener {
   



    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JLabel judulLabel;
    private JLabel namaLabel;
    private JLabel noRekamMedis;
    private JLabel alamat;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField noRekamText;
    private JButton tambahButton;

    public MainTambahAntrian(String latihan_Dialog) {
        init();
    }

    public void init() {
        this.setLayout(null);
        judulLabel = new JLabel("Formulir Daftar Antrian");
        judulLabel.setBounds(100, 25, 150, 25);
        this.add(judulLabel);

        noRekamMedis = new JLabel("No RM");
        noRekamMedis.setBounds(20, 70, 50, 20);
        this.add(noRekamMedis);

        noRekamText = new JTextField();
        noRekamText.setBounds(115, 72, 150, 20);
        this.add(noRekamText);
        noRekamText.addActionListener(this);

        namaLabel = new JLabel("Nama");
        namaLabel.setBounds(20, 120, 50, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(115, 120, 150, 20);
        this.add(namaText);
        namaText.addActionListener(this);

        alamat = new JLabel("Alamat");
        alamat.setBounds(20, 170, 50, 20);
        this.add(alamat);

        alamatText = new JTextField();
        alamatText.setBounds(115, 168, 150, 20);
        this.add(alamatText);
        alamatText.addActionListener(this);

        tambahButton = new JButton("TAMBAH");
        tambahButton.setBounds(120, 250, 90, 25);
        this.add(tambahButton);
        tambahButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == tambahButton) {
            Pasien psn = new Pasien();
            if (psn == null) {
                JOptionPane.showMessageDialog(null, "Data Pasien " + noRekamText.getText() + " Pasien Tidak Ada ");
            } else {
                namaText.setText(psn.getNama());
                alamatText.setText(psn.getAlamat());
            }

        }
        if (ae.getSource() == tambahButton) {
            Pasien cari = Pasien.cariPasien(noRekamText.getText());
          
            for (int i = 0; i < Pasien.daftarPasienKlinik.size(); i++) {
                if (cari != Pasien.daftarPasien) {
                } else {
                    JOptionPane.showMessageDialog(null, "Nama Antrian Anda : " + (i + 1));
                    this.dispose();
                }
            }
        }
    }
}
