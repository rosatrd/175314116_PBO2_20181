/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author Rosa
 */
public class Main {

    public static void main(String[] args) throws Exception {
         Pasien Ps = new Pasien();
        Dokter Dk = new Dokter();
        klinik Kl = new klinik();

        Kl.setNama("AMANDA");
        Kl.setIdklinik("17");

        Ps.setNama("Akila Andries");
        Ps.setTempatLahir("Batam");
        Ps.setAlamat("Jl.Padjajaran");
        Dk.setNama("Dokter Revan");
        Dk.setNomorPegawai("175314116");
        Dk.setAlamat("Jl.Senayan");
        Dk.setTempatlahir("Jakarta");

        System.out.println("nama klinik        : " + Kl.getNama());
        System.out.println("id klinik          : " + Kl.getIdklinik());
        System.out.println("");
        System.out.println("===================================");
      

        System.out.println("Nama Dokter        : " + Dk.getNama());
        System.out.println("No.Pegawai         : " + Dk.getNomorPegawai());
        System.out.println("Alamat             : " + Dk.getAlamat());
        System.out.println("Tempat Lahir       : " + Dk.getTempatlahir());

        System.out.println("====================================");

        System.out.println("Nama Pasien        : " + Ps.getNama());
        System.out.println("Alamat Pasien      : " + Ps.getAlamat());
        System.out.println("Tempat Lahir       : " + Ps.getTempatLahir());

        try {
            Ps.setTahunLahir(1999);
            Ps.setBulanLahir(7);
            Ps.setTanggalLahir(31);
            Ps.setNoRekamNedis("A1");

            System.out.println("No.Rekam medis  : " + Ps.getNoRekamNedis());
            System.out.println("Tanggal Lahir   : " + Ps.getTanggalLahir()+ "-" + Ps.getBulanLahir() +"-" + Ps.getTahunLahir());
            System.out.println("Alamat          : " + Ps.getAlamat());
            System.out.println("Tempat lahir    : " + Ps.getTempatLahir());
       

            System.out.println("=============================");
            System.out.println("");

        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("Data dokter : ");
        System.out.println("nama dokter : " + Dk.getNama());
        System.out.println("no pegawai  : " + Dk.getNomorPegawai());
        System.out.println("Alamat      : " + Dk.getAlamat());
        System.out.println("Tempat lahir: " + Dk.getTempatlahir());
        

        }
    }

    
//        Pasien Ps = new Pasien();
//        Dokter Dk = new Dokter();
//
//        Ps.setNama("Akila Andries");
//        Ps.setTempatLahir("Batam");
//        Ps.setAlamat("Jl.Padjajaran");
//        Dk.setNama("Dokter Revan");
//        Dk.setNomorPegawai("175314116");
//        Dk.setAlamat("Jl.Senayan");
//        Dk.setTempatlahir("Jakarta");
//
//        System.out.println("Nama Dokter : " + Dk.getNama());
//        System.out.println("No.Pegawai : " + Dk.getNomorPegawai());
//        System.out.println("Alamat     : " + Dk.getAlamat());
//        System.out.println("Tempat Lahir : " + Dk.getTempatlahir());
//
//        System.out.println("=======================================");
//        
//        System.out.println("Nama Pasien : " + Ps.getNama());
//        System.out.println("Alamat Pasien : " + Ps.getAlamat());
//        System.out.println("Tempat Lahir : " + Ps.getTempatLahir());
//       
//        try {
//            Ps.setTahunLahir(1999);
//            Ps.setBulanLahir(7);
//            Ps.setTanggalLahir(31);
//            Ps.setNoRekamNedis("A1");
//             
//            System.out.println("No.Rekam medis  : " + Ps.getNoRekamNedis());
//            System.out.println("Tanggal Lahir   : " + Ps.getTanggalLahir());
//            System.out.println("Alamat          : " + Ps.getAlamat());
//            System.out.println("Tempat lahir    : " + Ps.getTempatLahir());
//            
//            System.out.println("=============================");
//            System.out.println("");
//            
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//        System.out.println("Data dokter : ");
//        System.out.println("nama dokter : " + Dk.getNama());
//        System.out.println("no pegawai  : " + Dk.getNomorPegawai());
//        System.out.println("Alamat      : " + Dk.getAlamat());
//        
//
//            try {
//                Dk.setTanggallahir(31);
//                Dk.setBulanLahir(7);
//                Dk.setTahunLahir(1999);
//                System.out.println("tanggal lahir : ");
//                Dk.getKelahiran();
//            } catch (Exception ex){
//                System.out.println(ex);
//            
//        
//           
//           
//        }
//    }
//}
