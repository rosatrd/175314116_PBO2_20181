/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class klinik {

    private String nama; // mendeklarasikan variable nama  dengan tipe data string ;
    private String idklinik;// mendeklarasikan variable idklinik dengan tipe data string ;
    public static ArrayList<klinik> daftarklinik = new ArrayList<klinik>();

    public static void tambahklinik(klinik klinik) {
        daftarklinik.add(klinik);
    }

    public klinik(String string, String anak) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public klinik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNama() {
        return nama;    //pengambalian nilai dari variabel idKlinik
    }

    public void setNama(String nama) { // mengisi data ke dalam atribut.
        this.nama = nama;  // pernyataan bahwa nilai variabel nama sama dengan nilai dari variabel lokal nama
    }

    public String getIdklinik() {
        return idklinik;    //pengambalian nilai dari variabel idKlinik
    }

    public void setIdklinik(String idklinik) { // mengisi data kedalam atribut.
        this.idklinik = idklinik;  // pernyataan bahwa nilain variabel idklinik sama 
        //dengan nilai dari variabel lokal idklinik

    }

    public static klinik cariKlinik(String namaKlinik) {
        for (int i = 0; i < daftarklinik.size(); i++) {
            if (daftarklinik.get(i).getNama().equalsIgnoreCase(namaKlinik)) {
                return daftarklinik.get(i);
            }
        }
        return null;
    }

    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("KLINIK " + getNama().toUpperCase() + "\n");
        System.out.printf("%-25s", "Nomor ID Klinik");
        System.out.print(": ");
        System.out.println(getIdklinik());

    }
}
