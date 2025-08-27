public class project1 {

    // Method untuk menampilkan biodata
    static void tampilkanBiodata(String nama, String npm, String alamat, String noHP) {
          System.out.println(
            "=== Biodata Mahasiswa ===\n" +
            "Nama   : " + nama + "\n" +
            "NPM    : " + npm + "\n" +
            "Alamat : " + alamat + "\n" +
            "No HP  : " + noHP
        );
    }

    // Titik awal program
    public static void main(String[] args) {
        // Cetak pesan pembuka
        System.out.println("Halo, Tidar! Ini adalah sebuah kode dari Java\n");

        // Panggil method tampilkanBiodata()
        tampilkanBiodata("Bagus Mukhamad Muslim", "123456789", 
                         "Jl. Contoh No. 10, Magelang", "081234567890");
    }
}
