package pbogab;

public class KendaraanBeraksi {
    public static void main(String[] args)
    {
        //membuat objek
        Kendaraan mobil = new Kendaraan();
        mobil.warna = "Merah";
        mobil.merk = "Toyota Inova";
        mobil.roda = 4;
        mobil.infoKendaraan();
        mobil.berjalan("Kiri");
        mobil.berhenti();
    }
}
