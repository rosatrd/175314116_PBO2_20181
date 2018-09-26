/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Rosa
 */
public class Dokter {

    private String nomorPegawai; // mendeklarasikan variable nomorpegawai dengan tipe data string .
    private String nama;// mendeklarasikan variable nama dengan tipe data string .
    private String alamat;// mendeklarasikan variable alamat dengan tipe data string .
    private String Tempatlahir; // mendeklarasikan variable tempatlahir dengan tipe data string .
    private int Tanggallahir; // mendeklarasikan variable tanggallahir dengan tipe data int .
    private int bulanLahir; // mendeklarasikan variable bulanlahir dengan tipe data int .
    private int tahunLahir; // mendeklarasikan variable tahunlahir dengan tipe data int .

    public Dokter() { //membuat constructor dengan parameter kosong yang akan otomatis dipanggil jika suatu objek dibuat

    }

    public String getNomorPegawai() { // memanggil method getNomorPegawai dengan tipe data string.
        String noPegawai = (nomorPegawai + nama.substring(0, 3));
        return nomorPegawai; //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setNomorPegawai(String nomorPegawai) throws Exception { // mengisi data ke dalam atribut.
        if (nomorPegawai.length() == 5) {//dalam langkah ini jika NomorPegawai lebih besar sama dengan 6 dan benar, maka dia akan berhenti dan mencetaknya
            this.nomorPegawai = nomorPegawai;
        } else {
            throw new NumberFormatException("nomor pegawai anda salah.");//dan jika data nomor pegawai salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa noomor pegawai tsb salah
        }

    }

    public String getNama() { // memanggil method getNama dengan tipe data string.
        return nama;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setNama(String nama) {// mengisi data ke dalam atribut.
        this.nama = nama;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getAlamat() {// memanggil method getAlamat dengan tipe data string.
        return alamat;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setAlamat(String alamat) {// mengisi data ke dalam atribut.
        this.alamat = alamat;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public String getTempatlahir() { // memanggil method getTempatLahir dengan tipe data string.
        return Tempatlahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setTempatlahir(String Tempatlahir) {// mengisi data ke dalam atribut.
        this.Tempatlahir = Tempatlahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1990, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }

    public int getTanggalLahir() {//method getTanggalLahir bertipe data integer yang akan mengembalikan variabel tanggalLahir
        return Tanggallahir;
    }

    public void setTanggallahir(int Tanggallahir) throws NumberFormatException {// mengisi data ke dalam atribut.
        if (Tanggallahir > 0 && Tanggallahir < 32) {
            this.Tanggallahir = Tanggallahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
        } else {
            throw new NumberFormatException("salah ditanggalnya");//dan jika data tanggalLahir salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tanggalLahir tsb salah
        }
    }

    public int getBulanLahir() { // memanggil method getBulanLahir dengan tipe data int.
        return bulanLahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setBulanLahir(int bulanLahir) {// mengisi data ke dalam atribut.
        this.bulanLahir = bulanLahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public int getTahunLahir() {// memanggil method getTahunLahir dengan tipe data int.
        return tahunLahir;//Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setTahunLahir(int tahunLahir) {// mengisi data ke dalam atribut.
        this.tahunLahir = tahunLahir;// menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri .
    }

    public void getKelahiran() { // memanggil method getKelahiran dengan tipe data void.
        Date Tanggallahir = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir() - 15);// mengeset data tahun lahir, bulan lahir dan tanggal lahir
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");// membuat tampilan atau format .
        System.out.println(ft.format(Tanggallahir));// menampilkan data sesuai dengan format yang telah di buat.

    }

    public void printInfo() {
        System.out.println();
        System.out.printf("%-20s", "");
        System.out.println("Biodata Dokter" + "\n");
        System.out.printf("%-20s", "Nomor Pegawai");
        System.out.println(": " + getNomorPegawai());
        System.out.printf("%-20s", "Nama");
        System.out.println(": " + getNama());
        System.out.printf("%-20s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.printf("%-20s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatlahir() + ", ");
        getKelahiran();
        /*
        dalam method ini kita dimudahkan saat akan menampilkan karena hanya memanggil method ini saja
         */
    }
}



//     
