import java.util.Scanner;
public class KalkulatorSederhana{
    static float total = 0, angka1 = 1, angka2 = 1;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Angka ke 1 = ");
        angka1 = input.nextFloat();
        System.out.print("Masukan Angka ke 2 = ");
        angka2 = input.nextFloat();

        while(angka2!=0 && angka1!=0){
            System.out.println("Kalkulator Sederhana");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Bagi");
            System.out.println("4. Kali");
            System.out.println("Masukan Pilihan = ");
            int pilihan = input.nextInt();

            switch(pilihan){
                case 1:
                    System.out.println( + angka1 +"+"+angka2);
                    System.out.println("Hasilnya = ");
                    total = angka1 + angka2;
                    break;

                case 2:
                    System.out.println( + angka1 +"-"+angka2);
                    System.out.println("Hasilnya = ");
                    total = angka1 - angka2;
                    break;

                case 3:
                    System.out.println( + angka1 +"/"+angka2);
                    System.out.println("Hasilnya = ");
                    total = angka1 / angka2;
                    break;

                case 4:
                    System.out.println( + angka1 +"*"+angka2);
                    System.out.println("Hasilnya = ");
                    total = angka1 * angka2;
                    break;
                default:
                    System.out.println("Harus Mengisi Angka");
            }
            System.out.println(total);
        }
    }
}