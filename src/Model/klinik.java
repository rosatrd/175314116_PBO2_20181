/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class klinik extends Pasien  {
   
    private String nama ; // mendeklarasikan variable nama  dengan tipe data string ;
    private String idklinik ;// mendeklarasikan variable idklinik dengan tipe data string ;

    public klinik() { // membuat constructor dengan parameter kosong yang akan otomatis dipanggil jika suatu objek dibuat
        
    }
  
    public String getNama() { // memanggil method getNama dengan tipe data string.
        return nama;// Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setNama(String nama) { // mengisi data ke dalam atribut.
       this.nama = nama; // menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri
    }

    public String getIdklinik() { // memanggil method getIdklinik dengan tipe data string.
        return idklinik; //Pengembalian nilai pada fungsi menggunakan kata kunci return.
    }

    public void setIdklinik(String idklinik) { // mengisi data kedalam atribut.
        this.idklinik = idklinik;//menunjukkan bahwa atribut yang ditunjuk merupakan atribut dari kelas itu sendiri
    }
}
