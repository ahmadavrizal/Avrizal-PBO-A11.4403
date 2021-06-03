package contohpraktikum;

public class Sepeda extends Kendaraan{
    public Sepeda(String nama){
        this.nama = nama;
    }
    @Override
    public void jalankan(){
        System.out.println("Duduklah di atas sadel "+ this.nama+" Berjalan Sendiri");
    }
}