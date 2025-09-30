/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author Acer
 */
public class MainT {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        Buku buku = new Buku("Pemrograman Java", 100000);
        Elektronik hp = new Elektronik("Smartphone", 3000000);
        Pakaian baju = new Pakaian("Kaos Polos", 150000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(baju);

        keranjang.tampilkanIsiKeranjang();
        System.out.println("Total Harga Setelah Diskon: Rp" + keranjang.hitungTotal());
    }
}
