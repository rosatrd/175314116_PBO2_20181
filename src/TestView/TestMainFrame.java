/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestView;

import View.MainFrame;
import javax.swing.JFrame;

/**
 *
 * @author Rosa
 */
public class TestMainFrame {

    public static void main(String[] args) {
        // TODO code application logic here
        MainFrame mf = new MainFrame();
        mf.setSize(600, 500);
        mf.setVisible(true);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
