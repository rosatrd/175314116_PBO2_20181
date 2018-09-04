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

    private String nomorPegawai;
    private String nama;
    private String alamat;
    private String Tempatlahir;
    private int Tanggallahir;
    private int bulanLahir;
    private int tahunLahir;
//    private String nomorPegawai, nama,alamat, tempatLahir;
//private int tanggalLahir, bulanLahir, tahunLahir;

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
