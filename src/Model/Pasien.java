/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rosa
 */
public class Pasien {

    private String noRekamMedis; // mendeklarasikan variable norekammedis dengan tipe data string ;
    private String Nama; // mendeklarasikan variable nama dengan tipe data string .
    private String Alamat; // mendeklarasikan variable alamat dengan tipe data string .
    private String tempatLahir;// mendeklarasikan variable tempatlahir dengan tipe data string .
    private int tanggalLahir;// mendeklarasikan variable tanggallahir dengan tipe data int .
    private int bulanLahir;// mendeklarasikan variable bulanlahir dengan tipe data int .
    private int tahunLahir;// mendeklarasikan variable tahunlahir dengan tipe data int .
    private String nik ;
    public Pasien daftarPasienKlinik[]; 
    
    
//    public static ArrayList<Pasien> daftarPasienKlinik
//            new ArrayList<Pasien>();
    

   public Pasien (){ //membuat constructor dengan parameter kosong yang akan otomatis dipanggil jika suatu objek dibuat
   }
   
   public static void  tambahPasienBaru(Pasien pasien){
//listing tambah elemen baru
//       daftarPasienKlinik.add(Pasien);
    
   }
   public static Pasien cariPasien(String string){ // listing cari elemen 
       
       return null ;
   }

    public void setNoRekamMedis(String noRekamNedis) { // mengisi data ke dalam atribut.
        this.noRekamMedis = noRekamMedis; // menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void setNama(String Nama) { // mengisi data ke dalam atribut.
        this.Nama = Nama;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void setAlamat(String Alamat) { // mengisi data ke dalam atribut.
        this.Alamat = Alamat; //  menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri . 
    }

    public void setTempatLahir(String tempatLahir) { // mengisi data ke dalam atribut.
        this.tempatLahir = tempatLahir; // menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir >= 1 && tanggalLahir <= 31) { // jika tanggal lahir lebih dari =1 dan tanggal lahir kurang dari =12 maka benar.
            this.tanggalLahir = tanggalLahir; // akan menunjuk tanggal lahir dan akan menampilkan.
        } else { //jika kurang dari 1 atau lebih dari 31 ,
            throw new Exception(" tanggla lahirnya salah ");// makan akan menampilkan kata" tanggal lahirnya salah " karena tidak terdaftar.
        }
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir >= 1 && bulanLahir <=12 ) {  // jika bulan lahirnya lebih dari = 1 dan bulan lahir kurang dari = 12 ,
            this.bulanLahir = bulanLahir;// maka bulan lahir akan ditunjuk atau ditampilkan .
        } else { // jika bulan lahir kurang dari 1 dan lebih dari 12 ,
            throw new Exception(" Bulan Lahirnya salah ");// maka akan mengeluarkan kata " bulan lahirnya salah " karena tidak termasuk dalam syarat.
        }
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) { // jika tahun lahir nya lebih dari 0 maka 
            this.tahunLahir = tahunLahir; // maka tahun lahir akan di tunjuk/ditampilkan .
        } else { // jika kurang dari 0 
            throw new Exception("tahun lahir salah "); // akan menampilkan kata "tahun lahir salah" 
        }

    }

    public String getNoRekamMedis() { // // memanggil method getnoRekamMedis dengan tipe data string.
        return noRekamMedis; //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public String getNama() { // memanggil method getNama dengan tipe data string.
        return Nama;//Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public String getAlamat() { // memanggil method getAlamat dengan tipe data string.
        return Alamat; //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public String getTempatLahir() {// memanggil method getTempatLahir dengan tipe data string.
        return tempatLahir;  //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public int getTanggalLahir() {// memanggil method getTanggalLahir dengan tipe data int.
        return tanggalLahir;  //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public int getBulanLahir() { // memanggil method getBulanLahir dengan tipe data int.
        return bulanLahir; //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public int getTahunLahir() { // memanggil method getTahunLahir dengan tipe data int.
        return tahunLahir;  //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }
    public void getKelahiran() { // memanggil method getKelahiran dengan tipe data void.
        Date Tanggallahir = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());// mengeset data tahun lahir, bulan lahir dan tanggal lahir
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");// membuat tampilan atau format .
        System.out.println(ft.format(Tanggallahir));// menampilkan data sesuai dengan format yang telah di buat.
//  
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }
}


   
    
    



