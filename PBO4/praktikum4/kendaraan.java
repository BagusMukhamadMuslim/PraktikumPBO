package praktikum4;

public class kendaraan {
    private String merek;
    private String model;
    private int tahun;

public kendaraan(String merek, String model, int tahun) {
    this.merek = merek;
    this.model = model;
    this.tahun = tahun;
}

public String getMerek() {
    return merek;
}

public void setMerek(String merek) {
    this.merek = merek;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getTahun() {
    return tahun;
}

public void setTahun(int tahun) {
    this.tahun = tahun;
}
}