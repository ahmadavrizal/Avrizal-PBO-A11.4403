package pbogab;

public class Varibel {
    public static void main(String[] args)
    {
        //data field - variabel - atribute
        /*tipe data
         *interger
         *float
         *double
         *char
         *boolean
         *byte
         *short
         *long
        */
        int angka; //benar
        angka = 10;
        System.out.println("Varibel angka bertipe interger nilainya adalah " +angka);

        angka = 100;
        double pecahan = 1.6;
        System.out.println("Varibel pecahan bertipe double nilainya adalah " +pecahan);
        char karakter = '2';
        System.out.println(karakter+angka);
        boolean aksi;
        aksi = true;//false
        System.out.println(aksi);
        /*
         * operasi aritmetika
         * +, -, *, %
         * pembanding
         * <, >, <=, >=, ><, ==
        */
        int jumlah;
        jumlah = angka+(int)pecahan;
        System.out.println(jumlah);

        String namaDepan = "Ahmad";
        String namaBelakang = "Avrizal Widiarso";
        System.out.println(namaDepan+" "+namaBelakang);
        
    }
}