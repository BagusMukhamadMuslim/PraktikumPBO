package praktikum4;

public class MainNingen {
    public static void main(String[] args) {
        pekerja ningen1 = new pekerja("Faust", 18, "Penembak runduk", 3000000);
        ningen1.tostring();

        ningen1.setNama("Sasha");
        System.out.println("Data objek setelah perubahan");
        ningen1.tostring();
    }
}