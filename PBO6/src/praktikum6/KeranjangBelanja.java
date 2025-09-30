/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Acer
 */
import java.util.ArrayList;

class KeranjangBelanja {
    private ArrayList<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanIsiKeranjang() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + " - Harga Asli: Rp" + p.getHarga() 
                               + " | Setelah Diskon: Rp" + p.getHargaSetelahDiskon());
        }
    }
}
