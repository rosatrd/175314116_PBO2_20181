/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianKlinik;
import Model.Dokter;
import Model.Dokter;
import Model.Dokter;
import Model.Pasien;
import Model.Pasien;
import Model.Pasien;
import Model.klinik;
import Model.klinik;
import Model.klinik;

/**
 *
 * @author Rosa
 */
public class MainPasien {

    public static void main(String[] args) {
        // deklarasi
        Pasien Ps = new Pasien(); // membuat objek baru yang diberi nama Ps. dengan tipe data Pasien.
        Dokter Dk = new Dokter(); // membuat objek baru yang diberi nama Dk. dengan tipe data Dokter.
        klinik Kl = new klinik(); // membuat objek baru yang diberi nama Kl. dengan tipe data klinik.
        AntrianKlinik antrian = new AntrianKlinik();
        // klinik 
        Kl.setNama("AMANDA"); // menginput set nama dengan isi amanda.
        Kl.setIdklinik("17");// menginput set idklinik dengan isi 17.
        
        // dokter 
        try {
            Dk.setNama(" Revan");// menginput set nama dengan isi "Dokter Revan".
            Dk.setNomorPegawai("175314116"); //  menginput set NomorPegawai dengan isi "175314116".
            Dk.setTempatlahir("Jakarta");//  menginput set TenpatLahir dengan isi "Jakarta".
            Dk.setTanggallahir(21);
            Dk.setBulanLahir(3);
            Dk.setTahunLahir(1980);

        } catch (Exception ex) {
            System.out.println(ex);
        } Dk.setAlamat("Jl.Adi Sucipto No.13");
        
        try {
            Ps.setNama("Akila Andries");//  menginput set nama dengan isi Akila "Andries".
            Ps.setTempatLahir("Batam");// menginput set tempat lahir dengan isi "Batam".
            Ps.setAlamat("Jl.Padjajaran No.5");// menginput set alamat dengan isi "Jl.Padjajaran".
            Ps.setNik("111");
            Ps.setTanggalLahir(31);
            Ps.setBulanLahir(07);
            Ps.setTahunLahir(1999);
            Ps.setNoRekamMedis("250");

        } catch (Exception ex) {
            System.out.println(ex);
        }
            // Mendaftar 
        antrian.setKlinik(Kl);
        antrian.mendaftar(Ps);
        
            // output
         antrian.getKlinik().printInfo();
         Dk.printInfo();
         
         for (int i = 0; i < antrian.getDaftarPasien().size(); i++) {
             antrian.printInfo();
            
        }
    }
}
