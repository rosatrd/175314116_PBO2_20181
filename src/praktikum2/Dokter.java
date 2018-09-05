/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

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


    public Dokter() {

    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getTempatlahir() {
        return Tempatlahir;
    }

    public void setTempatlahir(String Tempatlahir) {
        this.Tempatlahir = Tempatlahir;
    }

    public int getTanggallahir() {
        return Tanggallahir;
    }

    public void setTanggallahir(int Tanggallahir) {
        this.Tanggallahir = Tanggallahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }

    public void getKelahiran() {
        Date Tanggallahir = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggallahir());
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.println(ft.format(Tanggallahir));

    }
}
//     
