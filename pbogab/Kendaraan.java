package pbogab;

public class Kendaraan {
    //atribute
    int roda;
    String warna;
    int kecepatan;
    String merk;

    public void berjalan(String arah)
    {
        System.out.println("Bergerak ke " +arah);
    }

    public void berhenti()
    {
        System.out.println("Berhenti");
    }

    public void infoKendaraan()
    {
        System.out.println("Kendaraan Beroda " +roda);
        System.out.println("Kendaraan Bewarna " +warna);
        System.out.println("Kendaraan Bermerk " +merk);
    }
}
