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
public class Pasien {

    private String noRekamMedis; // mendeklarasikan variable norekammedis dengan tipe data string ;
    private String Nama; // mendeklarasikan variable nama dengan tipe data string .
    private String Alamat; // mendeklarasikan variable alamat dengan tipe data string .
    private String tempatLahir;// mendeklarasikan variable tempatlahir dengan tipe data string .
    private int tanggalLahir;// mendeklarasikan variable tanggallahir dengan tipe data int .
    private int bulanLahir;// mendeklarasikan variable bulanlahir dengan tipe data int .
    private int tahunLahir;// mendeklarasikan variable tahunlahir dengan tipe data int .

   public Pasien (){ //
   }

    public void setNoRekamMedis(String noRekamNedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir >= 1 && tanggalLahir <= 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception(" tanggla lahirnya salah ");
        }
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir >= 1) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception(" Bulan Lahirnya salah ");
        }
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir >= 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("tahun lahir salah ");
        }

    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
//   
    }



