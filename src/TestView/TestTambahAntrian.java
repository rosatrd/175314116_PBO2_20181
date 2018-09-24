/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import View.MainTambahAntrian;
import javax.swing.JDialog;
import javax.swing.JPanel;


/**
 *
 * @author Rosa
 */
public class TestTambahAntrian  {
    public static void main(String[] args) {
       
    MainTambahAntrian test = new MainTambahAntrian("Antrian Baru");
        test.setSize(600, 500);
        test.setVisible(true);
    
}
}
