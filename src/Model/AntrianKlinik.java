/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Rosa
 */
public class AntrianKlinik {
    
    private int bulanAntrian; // mendeklarasikan variabel bulanAntrian dengan tipe data int 
    private int tahunAntrian, tanggalAntrian; // mendeklarasikan variabel tahunAntrian dengan tipe data int 
    private klinik Klinik; //variabel klinik Klinik bertipe data Klinik bersifat private
    public static ArrayList<AntrianKlinik> daftarAntrian = new ArrayList<AntrianKlinik>();
    private ArrayList<Pasien> DaftarPasienAntrian = new ArrayList<Pasien>();
    
    public void mendaftar(Pasien Pasien) {
        DaftarPasienAntrian.add(Pasien);
    }
    
    public int getTanggalAntrian() {//method getTanggalAntrian yang mengembalikan variabel tanggalAntrian
        return tanggalAntrian;
    }
    
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }
    
    public int getBulanAntrian() {//method getBulanAntrian bertipe data integer yang mengembalikan varianel bulanAntrian
        return bulanAntrian;
    }
    
    public void setBulanAntrian(int bulanAntrian) throws NumberFormatException {//method void setBulanAntrian dengan parameter bulanAntrianr bertipe data integer dengan menambahkan throws NumberFormatException
        if (bulanAntrian > 0 && bulanAntrian < 13) {//dalam langkah ini jika bulanAntrian lebih lebih besar dari 0 dan lebih kecil dari 13 dan benar, maka dia akan berhenti dan mencetaknya
            this.bulanAntrian = bulanAntrian;
        } else {
            throw new NumberFormatException("salah bulannya nih"); //dan jika data BulanAntrian salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa bulanAntrian tsb salah
        }
        
    }
    
    public int getTahunAntrian() {//method getTahunAntrian yang mengembalikan variabel tahunAntrian
        return tahunAntrian;
    }
    
    public void setTahunAntrian(int tahunAntrian) throws NumberFormatException {//method void setTahunAntrian dengan parameter tahunAntrian bertipe data integer dengan menambahkan throws NumberFormatException
        if (tahunAntrian > 0) {//dalam langkah ini jika tahunAntrian lebih lebih besar dari 0 dan benar, maka dia akan berhenti dan mencetaknya
            this.tahunAntrian = tahunAntrian;
        } else {
            throw new NumberFormatException("salah tahunnya nih..");//dan jika data TahunAntrian salah maka fungsi dari throw new NumberFormatException tsb akan bekerja dan mencetak bahwa tahunAntrian tsb salah
        }
    }
    
    public klinik getKlinik() {//method getKlinik yang mengembalikan variabel Klinik
        return Klinik;
    }
    
    public void setKlinik(klinik Klinik) {//method void setKlinik dengan parameter Klinik
        this.Klinik = Klinik;
    }
    
    public ArrayList<Pasien> getDaftarPasien() {
        //pengambalian nilai dari variabel daftarPasien
        return DaftarPasienAntrian;
    }
    
    public void setDaftarPasien(ArrayList<Pasien> daftarPasien) {
        // pernyataan bahwa nilai dari variabel daftarPasien sama dengan nilai dari variabel lokal daftarPasien
        this.DaftarPasienAntrian = daftarPasien;
    }
    
    public void printInfo() {
    }
    
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, klinik Klinik) throws Exception {
        if (CariAntrian(tanggal, bulan, tahun, Klinik) == -1) {
            daftarAntrian.get(CariAntrian(tanggal, bulan, tahun, Klinik)).mendaftar(pasien);
        } else {
            BuatAntrian(tanggal, bulan, tahun, Klinik);
        }
    }
    
    public static int CariAntrian(int tanggal, int bulan, int tahun, klinik Klinik) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getTanggalAntrian() == tanggal
                    && daftarAntrian.get(i).getBulanAntrian() == bulan
                    && daftarAntrian.get(i).getTahunAntrian() == tahun
                    && daftarAntrian.get(i).getKlinik().getNama().equalsIgnoreCase(Klinik.getNama())
                    && daftarAntrian.get(i).getKlinik().getIdklinik().equalsIgnoreCase(Klinik.getIdklinik())) {
                return i;
            }
        }
        return -1;
    }
    
    public static void BuatAntrian(int tanggal, int bulan, int tahun, klinik klinik) {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftar antri
        if (CariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrian.add(antrian);
        } else {
            System.out.println("Antrian " + klinik.getNama() + " Sudah Ada");
            System.out.println("");
        }
    }
    
    public static Pasien CariPasien(String noRM) {
        for (int i = 0; i < daftarAntrian.size(); i++) {
            if (daftarAntrian.get(i).getDaftarPasien().get(i).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                return daftarAntrian.get(i).getDaftarPasien().get(i);
            }
        }
        return null;
    }
}
