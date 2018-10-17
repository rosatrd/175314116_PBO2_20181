/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rosa
 */
public class Pasien {

    public static Object daftarPasien;

    private static Object getDaftarPasien() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String noRekamMedis; // mendeklarasikan variable norekammedis dengan tipe data string ;
    private String Nama; // mendeklarasikan variable nama dengan tipe data string .
    private String Alamat; // mendeklarasikan variable alamat dengan tipe data string .
    private String tempatLahir;// mendeklarasikan variable tempatlahir dengan tipe data string .
    private int tanggalLahir;// mendeklarasikan variable tanggallahir dengan tipe data int .
    private int bulanLahir;// mendeklarasikan variable bulanlahir dengan tipe data int .
    private int tahunLahir;// mendeklarasikan variable tahunlahir dengan tipe data int .
    private String nik = noRekamMedis;
    public static ArrayList<Pasien> daftarPasienKlinik = new ArrayList<Pasien>();

    public Pasien() {
    }

    public Pasien(String puspa, String klaten, String medan, int i, int i0, int i1, String string) { //membuat constructor dengan parameter kosong yang akan otomatis dipanggil jika suatu objek dibuat
    }


    public String NoRekamMedis() {
        String noRekamMedis;
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama
        noRekamMedis = ft.format(date) + Nama.substring(0, 3);
        //pengembalian nilai variabel nomorRekamMedis
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamNedis) throws NumberFormatException { // mengisi data ke dalam atribut.
        if (noRekamMedis.length() <= 4) {
            this.noRekamMedis = noRekamMedis; // menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
        } else {
            throw new NumberFormatException("nomor data anda salah.");//dan jika data noRekamMedis salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noRekamMedis tsb salah
        }
    }

    public String getNoRekamMedis() {//method getNoRekamedis bertipe data String yang akan mengembalikan variabel noRekamMedis
        return noRekamMedis; //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    

    public static Pasien cariPasien(String noRM) { // listing cari elemen 
        for (int i = 0; i < daftarPasienKlinik.size(); i++) {
            if (daftarPasienKlinik.get(i).getNoRekamMedis() == noRM) {
                return daftarPasienKlinik.get(i);

            }

        }

        return null;
    }

   

    public void setNama(String Nama) { // mengisi data ke dalam atribut.
        this.Nama = Nama;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getNama() { //method getNama bertipe data String yang akan mengembalikan variabel nama
        return Nama;//Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public void setAlamat(String Alamat) { // mengisi data ke dalam atribut.
        this.Alamat = Alamat; //  menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri . 
    }

    public String getAlamat() { // memanggil method getAlamat dengan tipe data string.
        return Alamat; //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public void setTempatLahir(String tempatLahir) { // mengisi data ke dalam atribut.
        this.tempatLahir = tempatLahir; // menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getTempatLahir() {// memanggil method getTempatLahir dengan tipe data string.
        return tempatLahir;  //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public int getTanggalLahir() {// memanggil method getTanggalLahir dengan tipe data int.
        return tanggalLahir;  //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir >= 1 && tanggalLahir <= 31) { // jika tanggal lahir lebih dari =1 dan tanggal lahir kurang dari =12 maka benar.
            this.tanggalLahir = tanggalLahir; // akan menunjuk tanggal lahir dan akan menampilkan.
        } else { //jika kurang dari 1 atau lebih dari 31 ,
            throw new Exception(" tanggal lahirnya salah bro ");// makan akan menampilkan kata" tanggal lahirnya salah " karena tidak terdaftar.
        }
    }

    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1990, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public void setBulanLahir(int bulanLahir) throws NumberFormatException {
        if (bulanLahir >= 1 && bulanLahir <= 12) {  // jika bulan lahirnya lebih dari = 1 dan bulan lahir kurang dari = 12 ,
            this.bulanLahir = bulanLahir;// maka bulan lahir akan ditunjuk atau ditampilkan .
        } else { // jika bulan lahir kurang dari 1 dan lebih dari 12 ,
            throw new NumberFormatException(" Bulan Lahirnya salah bro  ");// maka akan mengeluarkan kata " bulan lahirnya salah " karena tidak termasuk dalam syarat.
        }
    }

    public int getBulanLahir() { // memanggil method getBulanLahir dengan tipe data int.
        return bulanLahir; //Pengembalian nilai pada fungsi menggunakan kata kunci return.

    }

    public void setTahunLahir(int tahunLahir) throws NumberFormatException {
        if (tahunLahir > 0) { // jika tahun lahir nya lebih dari 0 maka 
            this.tahunLahir = tahunLahir; // maka tahun lahir akan di tunjuk/ditampilkan .
        } else { // jika kurang dari 0 
            throw new NumberFormatException(" Tahun lahir salah bro ");//dan jika data TahunLahir salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tahunLahir tsb salah
        }

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

    public void printInfo() {
        System.out.printf("%-25", "Nomor Rekam Medis Pasien");
        System.out.println(":" + getNoRekamMedis());
        System.out.printf("%-25s", "nama pasien ");
        System.out.println(":" + getNama());
        System.out.printf("%-25s", "tempat, tanggal lahir");
        System.out.println(":" + getTempatLahir() + " , ");
        getTanggalKelahiran();
        System.out.printf("%-25s", "Alamat");
        System.out.println(":" + getAlamat());
        System.out.println("");
    }


    public static void simpanDaftarPasien(File file) throws FileNotFoundException, IOException {
        try {
            FileOutputStream fos = new FileOutputStream(file);
            for (int i = 0; i < DaftarPasien.size(); i++) {
                String data = DaftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public static void bacaDaftarPasien(File file){
        
    }
    public static Object getDaftarPasien(File file){
        return null ;
    }
@Override
public String toString(){
        String alamat;
    return String.format("nama pasien : " + Nama + "\n" + "alamat pasien : " + Alamat + "\n");
}
}
