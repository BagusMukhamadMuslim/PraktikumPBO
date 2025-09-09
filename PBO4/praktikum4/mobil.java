package praktikum4;

public class mobil extends kendaraan1 {
    private int jumlahPintu;

    public mobil(String nama, int vmaks, String jenismesin, int jumlahPintu) {
        super(nama, vmaks, jenismesin);
        this.jumlahPintu = jumlahPintu;
    }
    
    public void viewInfoMobil() {
        System.out.println("Kecepatan maksimum mobil " + vmaks + "km/h" );
        System.out.println("Jumlah Pintu " + jumlahPintu);
    }
    
}