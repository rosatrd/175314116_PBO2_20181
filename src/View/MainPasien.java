/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

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

    public static void main(String[] args) throws Exception {
        Pasien Ps = new Pasien(); // membuat objek baru yang diberi nama Ps. dengan tipe data Pasien.
        Pasien Ps1 = new Pasien ();
        Dokter Dk = new Dokter(); // membuat objek baru yang diberi nama Dk. dengan tipe data Dokter.
        klinik Kl = new klinik(); // membuat objek baru yang diberi nama Kl. dengan tipe data klinik.
        
       
        Kl.setNama("AMANDA"); // menginput set nama dengan isi amanda.
        Kl.setIdklinik("17");// menginput set idklinik dengan isi 17.

        Ps.setNama("Akila Andries");//  menginput set nama dengan isi Akila "Andries".
        Ps.setTempatLahir("Batam");// menginput set tempat lahir dengan isi "Batam".
        Ps.setAlamat("Jl.Padjajaran");// menginput set alamat dengan isi "Jl.Padjajaran".
        Ps.setNik("111");
        Ps.setTanggalLahir(31);
        Ps.setBulanLahir(07);
        Ps.setTahunLahir(1999);
        Ps.setNoRekamMedis("250");
        
        Ps1.setNama("patricia");
        Ps1.setTempatLahir("jakarta");
        Ps1.setAlamat("Jl.Ir.Soekarno");
        Ps1.setNik("222");
        Ps1.setTanggalLahir(12);
        Ps1.setBulanLahir(07);
        Ps1.setTahunLahir(1997);
        Ps1.setNoRekamMedis("223");
        
        
        Dk.setNama("Dokter Revan");// menginput set nama dengan isi "Dokter Revan".
        Dk.setNomorPegawai("175314116"); //  menginput set NomorPegawai dengan isi "175314116".
        Dk.setAlamat("Jl.Senayan");//  menginput set Alamat dengan isi "Jl.Senayan".
        Dk.setTempatlahir("Jakarta");//  menginput set TenpatLahir dengan isi "Jakarta".
        Dk.setTanggallahir(21);
        Dk.setBulanLahir(3);
        Dk.setTahunLahir(1980);
        
       
        
        try {
            
        System.out.println("nama klinik        : " + Kl.getNama()); // untuk menampilkan nama klinik pada output.
        System.out.println("id klinik          : " + Kl.getIdklinik());// untuk menampilkan id klinik pada output.
        System.out.println("");// memberi spasi/ enter 
        System.out.println("===================================");// membuat garis penengah atau batasan atau garis bawah.
        
            System.out.println("");
           System.out.println("Pasien ke -2 ");
        System.out.println("=======Nama Dokter=========");
        System.out.println("Nama Dokter        : " + Dk.getNama()); // untuk menampilkan nama dokter pada output.
        System.out.println("No.Pegawai         : " + Dk.getNomorPegawai());// untuk menampilkan nomor pegawai pada output.
        System.out.println("Alamat             : " + Dk.getAlamat());// untuk menampilkan alamat pada output.
        System.out.println("Tempat Lahir       : " + Dk.getTempatlahir());// untuk menampilkan tempat lahir pada output.
        System.out.println("TTL                : " + Dk.getTanggallahir()+ "-" + Dk.getBulanLahir()+ "-" + Dk.getTahunLahir());
        
        System.out.println("=======Nama Pasien=========");
        System.out.println("Nama Pasien        : " + Ps.getNama());// untuk menampilkan nama pasien  pada output.
        System.out.println("Alamat Pasien      : " + Ps.getAlamat());// untuk menampilkan alamat pasien pada output.
        System.out.println("Tempat Lahir       : " + Ps.getTempatLahir());// untuk menampilkan tempat lahir pada output.
        System.out.println("NIK                : " + Ps.getNik());
        System.out.println("TTL                : " + Ps.getTanggalLahir()+ "-" + Ps.getBulanLahir() +"-" + Ps.getTahunLahir());
        System.out.println("No.Rekam Medis     : " + Ps.getNoRekamMedis());
        

////        try {
//            Ps.setTahunLahir(1999);//untuk mengeset TahunLahir.
//            Ps.setBulanLahir(7);//untuk mengeset BulanLahir.
//            Ps.setTanggalLahir(31);//untuk mengeset TanggalLahir.
//            Ps.setNoRekamMedis("RM");//untuk mengeset NoRekamMedis.
            

//            System.out.println("No.Rekam medis  : " + Ps.getNoRekamMedis());// untuk menampilkan no rekam medis pada output.
//            System.out.println("TTL             : " + Ps.getTanggalLahir()+ "-" + Ps.getBulanLahir() +"-" + Ps.getTahunLahir());// untuk menampilkan tempat tanggal bulan dan tahun lari pada output.
//            System.out.println("Alamat          : " + Ps.getAlamat());// untuk menampilkan Alamat pada output.
//            System.out.println("Tempat lahir    : " + Ps.getTempatLahir());// untuk menampilkan tempat lahir pada output.
//       

            System.out.println("=============================");// membuat garis penengah atau batasan atau garis bawah.
            System.out.println(""); // membuat spasi atau enter .

        } catch (Exception ex) {
            System.out.println(ex);
        }
        
          System.out.println("");
           System.out.println("Pasien ke -2 ");
        System.out.println("=======Nama Dokter=========");
        System.out.println("Nama Dokter        : " + Dk1.getNama()); // untuk menampilkan nama dokter pada output.
        System.out.println("No.Pegawai         : " + Dk1.getNomorPegawai());// untuk menampilkan nomor pegawai pada output.
        System.out.println("Alamat             : " + Dk1.getAlamat());// untuk menampilkan alamat pada output.
        System.out.println("Tempat Lahir       : " + Dk1.getTempatlahir());// untuk menampilkan tempat lahir pada output.
        System.out.println("TTL                : " + Dk1.getTanggallahir()+ "-" + Dk1.getBulanLahir()+ "-" + Dk1.getTahunLahir());
        
        System.out.println("=======Nama Pasien=========");
        System.out.println("Nama Pasien        : " + Ps1.getNama());// untuk menampilkan nama pasien  pada output.
        System.out.println("Alamat Pasien      : " + Ps1.getAlamat());// untuk menampilkan alamat pasien pada output.
        System.out.println("Tempat Lahir       : " + Ps1.getTempatLahir());// untuk menampilkan tempat lahir pada output.
        System.out.println("NIK                : " + Ps1.getNik());
        System.out.println("TTL                : " + Ps1.getTanggalLahir()+ "-" + Ps.getBulanLahir() +"-" + Ps.getTahunLahir());
        System.out.println("No.Rekam Medis     : " + Ps1.getNoRekamMedis());
//        System.out.println("Data dokter : ");
//        System.out.println("nama dokter : " + Dk.getNama());
//        System.out.println("no pegawai  : " + Dk.getNomorPegawai());
//        System.out.println("Alamat      : " + Dk.getAlamat());
//        System.out.println("Tempat lahir: " + Dk.getTempatlahir());
//            try {
//                Dk.setTanggallahir(31);
//                Dk.setBulanLahir(07);
//                Dk.setTahunLahir(1999);
//                System.out.print("tanggal lahir   : ");
//                Dk.getKelahiran();
//            } catch (Exception ex){
//                System.out.println(ex);
//            }
            
                    
            
        }
    }
