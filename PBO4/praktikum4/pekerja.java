package praktikum4;

public class pekerja extends ningen {
    private int gaji;

    public pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public void tostring() {
        System.out.println("Nama =" + getNama());
        System.out.println("Usia =" + usia + " tahun");
        System.out.println("Pekerjaan =" + pekerjaan);
        System.out.println("Gaji = Rp." + gaji);
    }
}