package praktikum4;

public class kendaraan1 {
    private String nama;
    protected int vmaks;
    public String jenismesin;

public kendaraan1(String nama, int vmaks, String jenismesin) {
    this.nama = nama;
    this.vmaks = vmaks;
    this.jenismesin = jenismesin;
}

public String getNama() {
    return nama;
}

public void setNama(String nama) {
    this.nama = nama;
}

public void viewInfoKendaraan() {
    System.out.println("Nama Kendaraan " + nama);
    System.out.println("Kecepatan Maksimum " + vmaks + " km/h");
    System.out.println("Jenis Mesin " + jenismesin);
}
}