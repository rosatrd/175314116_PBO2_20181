/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class TestStreaming1 {
     public static void main(String[] args) throws FileNotFoundException, IOException {
      FileInputStream  fis = null;
      try {
          File file = new File ("test.txt");// file tujuan 
          String hasilBaca="";
          fis = new FileInputStream(file);// object stream
          int dataInt =0;
          while ((dataInt=fis.read()!=-1)){
              hasilBaca = hasilBaca + (char) dataInt;
          }
          System.out.println(hasilBaca);  
     } catch (FileNotFoundException ex){
          Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null , ex);
      } catch (IOException ex){
          Logger.getLogger(TestStreaming1.class.getName()).log(Level.SEVERE, null , ex);
      } finally {
          
          
          
      }
         
     }

    
}
