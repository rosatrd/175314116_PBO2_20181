/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Pasien;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author admin
 */
public class TestStream {
    public static void main(String[] args) throws FileNotFoundException {

        Pasien test = new Pasien();
        test.setNoRekamMedis("001");
        test.setNama("puspa") ; 
        test.setAlamat("klate");
       
         
        Pasien test1 = new Pasien();
        test1.setNoRekamMedis("002");
        test1.setNama("adi");
        test1.setAlamat("medan");
        
        
        System.out.println(test.toString());
        System.out.println(test1.toString());
                

        Pasien.tambahPasien(test);
        Pasien.tambahPasien(test1);
        Pasien.simpanDaftarPasien(new File ("daftar.txt"));

}
}
