/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Rosa
 */
public class MainFrame extends JFrame implements ActionListener {

  

    private JMenuBar menuBar;
    //Mendeklarasikan attribut menuBar dengan tipe data JMenuBar
    private JMenu fileMenu;
    //Mendeklarasikan attribut fileMenu dengan tipe data fileMenu
    private JMenuItem exitMenuItem;
    //Mendeklarasikan attribut exitMenuItem dengan tipe data JMenuItem
    private JMenuItem tambahPasien;
    private JMenuItem tambahAntrian ;

    public MainFrame() throws HeadlessException {
        init();
    }

    public void init() {
        menuBar = new JMenuBar();
        //Membuat objek baru menuBar dengan tipe data JMenuBar
        this.setTitle("Main Frame");
        //Mengisi/Mengeset setTitle dengan "Main Frame"
        fileMenu = new JMenu("File");
        //Membuat objek baru fileMenu dengan tipe data JMenu dengan isi parameternya "File"
        exitMenuItem = new JMenuItem("Exit");
        //Membuat objek baru exitMenuItem dengan tipe data JMenuItem dengan isi parameter "Exit"
        tambahPasien = new JMenuItem("Tambah Pasien");
        tambahAntrian = new JMenuItem("Tambah Antrian");
        fileMenu.add(exitMenuItem);
        fileMenu.add(tambahPasien);
        fileMenu.add(tambahAntrian);
        //Menambahkan exitMenuItem pada fileMenu
        menuBar.add(fileMenu);

        //Menambahkan fileMenu pada menuBar
        this.setJMenuBar(menuBar);

        //Mengisi/Mengeset setJMenuBar dengan menuBar
        exitMenuItem.addActionListener(this);
        tambahPasien.addActionListener(this);
        tambahAntrian.addActionListener(this);
        
         this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent aa) {
        if (aa.getSource() == exitMenuItem) {
//            DaftarAntrianDialog data = new DaftarAntrianDialog();
            System.exit(0);
        }
        if (aa.getSource() == tambahPasien) {
            DaftarPasienBaru test = new DaftarPasienBaru("Dialog Baru");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (aa.getSource() == tambahAntrian) {
            MainTambahAntrian test = new MainTambahAntrian("Latihan Dialog");
            test.setSize(600, 500);
            test.setVisible(true);

        }
    }
   }

