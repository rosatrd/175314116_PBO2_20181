/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import View.MainTambahAntrian;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 *
 * @author Rosa
 */
public class TestTambahAntrian  {
    public static void main(String[] args) {
       
    MainTambahAntrian test = new MainTambahAntrian("Antrian Baru");
        test.setSize(300,350);
        test.setVisible(true);
        test.setTitle("tambah antrian ");
         test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
