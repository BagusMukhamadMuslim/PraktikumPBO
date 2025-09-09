package praktikum4;

public class MainK {
    public static void main(String[] args) {
        kendaraan mobil = new kendaraan("Toyota", "Avanza", 2020);

        System.out.println("Merek" + mobil.getMerek());
        System.out.println("Model" + mobil.getModel());
        System.out.println("Tahun" + mobil.getTahun());

        mobil.setModel("Innova");
        mobil.setTahun(2021);

        System.out.println("Merek Baru" + mobil.getMerek());
        System.out.println("Tahun Baru" + mobil.getTahun());

        mobil mbl = new mobil("Honda", 150, "VTEC Turbo", 4);
        mbl.viewInfoKendaraan();
        mbl.viewInfoMobil();
    }
}