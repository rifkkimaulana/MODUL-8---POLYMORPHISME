
/**
 *
 * Konsep Polymorphisme kelas barang, dengan jenis barang yang diambil adalah buku gambar dan pensil.
 * 
 * Ketentuan: 
 * untuk ptoses input dibuat dalam bentuk contructor. proses yang dibutuhkan yautu
 * hitung stok, hitung total, hitung laba, dan tampil.
 * 
 * Keterangan:
 * Barang (Super class) = Kode dan Nama.
 * Buku Gambar dan Pensil 2B (Sub Class) = Kode, Nama, HPP, Harga Jual, dan stok.
 * 
 * @author Rifki Maulana
 * 
 */


public class Barang {
    public String kode, nama;
    private long hpp, hargajual;
    private int stok, jumlahjual;
    
    
        public Barang (String kode, String nama, long hpp, long hargajual, int stok, int jumlahjual) {
            this.kode = kode;
            this.nama = nama;
            this.hpp = hpp;
            this.hargajual = hargajual;
            this.stok = stok;
            this.jumlahjual = jumlahjual;
        }
        
    public String tampilBarang () {
        return ("INPUT: " + "\nKode\t\t: " + kode + "\nNama Barang\t: " + nama + "\nHPP\t\t: " + hpp + 
                "\nHarga Jual\t: " + hargajual + "\nStok\t\t: " + stok + "\nJumlah Jual\t: " + 
                jumlahjual + "\nOUTPUT:\t" + "\nStok Sekarang\t: " + (stok - jumlahjual) 
                + "\nTotal Bayar\t: " + (hargajual*jumlahjual) + "\nLaba\t\t: " + 
                ((hargajual*jumlahjual)-(hpp*jumlahjual)));
    }
}

class bukugambar extends Barang {
    private long hpp, hargajual;
    private int stok, jumlahjual;
    
    public bukugambar (String kode, String nama, long hpp, long hargajual, int stok, int jumlahjual) {
        super (kode, nama, hpp, hargajual, stok, jumlahjual);
        this.hpp = hpp;
        this.hargajual = hargajual;
        this.stok = stok;
        this.jumlahjual = jumlahjual;
        
    }
    public String tampilBukugambar () {
        return ("""
                INPUT: 
                Kode\t\t: """ + kode + "\nNama Barang\t: " + nama + "\nHPP\t\t: " + hpp + 
                "\nHarga Jual\t: " + hargajual + "\nStok\t\t: " + stok + "\nJumlah Jual\t: " + 
                jumlahjual + "\nOUTPUT:\t" + "\nStok Sekarang\t: " + (stok - jumlahjual) 
                + "\nTotal Bayar\t: " + (hargajual*jumlahjual) + "\nLaba\t\t: " + 
                ((hargajual*jumlahjual)-(hpp*jumlahjual)));
    }
}

class pensil2b extends Barang {
    private long hpp, hargajual;
    private int stok, jumlahjual;
    
    public pensil2b (String kode, String nama, long hpp, long hargajual, int stok, int jumlahjual) {
        super(kode, nama, hpp, hargajual, stok, jumlahjual);
        this.hpp = hpp;
        this.hargajual = hargajual;
        this.stok = stok;
        this.jumlahjual = jumlahjual;
        
    }
    public String tampilPensil2b () {
        return ("""
                INPUT: 
                Kode\t\t: """ + kode + "\nNama Barang\t: " + nama + "\nHPP\t\t: " + hpp + 
                "\nHarga Jual\t: " + hargajual + "\nStok\t\t: " + stok + "\nJumlah Jual\t: " + 
                jumlahjual + "\nOUTPUT:\t" + "\nStok Sekarang\t: " + (stok - jumlahjual) 
                + "\nTotal Bayar\t: " + (hargajual*jumlahjual) + "\nLaba\t\t: " + 
                ((hargajual*jumlahjual)-(hpp*jumlahjual)));
}   
}


class main {
public static void main (String args[]) {

    Barang[] informasi = new Barang[2];
    informasi[0] = new bukugambar("B001", "BUKU GAMBAR", 2500, 3000, 5, 2);
    informasi[1] = new pensil2b ("P002", "PENSIL 2B", 1500, 1750, 10, 1);
    
    
    for (int i=0; i<2; i++){
        
        System.out.println("--------------------------");
        System.out.println(informasi[i].tampilBarang());
    }
}
}
