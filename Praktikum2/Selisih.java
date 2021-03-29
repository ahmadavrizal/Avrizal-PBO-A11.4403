import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
         
        //  Scanner
        Scanner scan = new Scanner(System.in);
         
        //  Input Waktu Awal
        System.out.println("Waktu Awal");
        System.out.print("Input Jam   : ");     String str_jam_awal = scan.nextLine();
        System.out.print("Input Menit : ");     String str_menit_awal = scan.nextLine();
        System.out.print("Input Detik : ");     String str_detik_awal = scan.nextLine();
         
        //  Input Waktu Akhir
        System.out.println("\nWaktu Akhir");
        System.out.print("Input Jam   : ");     String str_jam_akhir = scan.nextLine();
        System.out.print("Input Menit : ");     String str_menit_akhir = scan.nextLine();
        System.out.print("Input Detik : ");     String str_detik_akhir = scan.nextLine();
         
        //  Tampilkan Waktu Awal dan Waktu Akhir
        String str_waktu_awal = str_jam_awal+":"+str_menit_awal+":"+str_detik_awal;
        String str_waktu_akhir = str_jam_akhir+":"+str_menit_akhir+":"+str_detik_akhir;
        System.out.println("Waktu Awal  : "+str_waktu_awal);
        System.out.println("Waktu Akhir : "+str_waktu_akhir);
         
        //  Konversi variable str menjadi integer
        int jam_awal = Integer.parseInt(str_jam_awal);
        int jam_akhir = Integer.parseInt(str_jam_akhir);
        int menit_awal = Integer.parseInt(str_menit_awal);
        int menit_akhir = Integer.parseInt(str_menit_akhir);
        int detik_awal = Integer.parseInt(str_detik_awal);
        int detik_akhir = Integer.parseInt(str_detik_akhir);
         
        //  Proses pencarian selisih Waktu Awal dan Waktu Akhir
        //  Langkah Ketiga, cari selisih detik awal dan detik akhir     
        int selisih_detik = 0;
         
        //  Jika detik awal > detik akhir
        //  Contohnya, detik awal = 40 dan detik akhir = 30
        if(detik_awal > detik_akhir) {
             
            while(detik_awal != detik_akhir) {
                 
                if(detik_awal == 60) {
                    detik_awal = 0;
                    menit_awal++;
                        continue;
                }
                detik_awal++;
                selisih_detik++;
            }
        }
         
        //  Jika detik awal < detik akhir
        //  Contohnya, detik awal = 30 dan detik akhir = 40
        else if(detik_awal < detik_akhir) {
            selisih_detik = detik_akhir - detik_awal;
        }
         
        //  Masukkan ke variable selisih waktu
        int selisih_waktu = selisih_detik;
         
        //-------------------------------------------------------
        //  Langkah Kedua, cari selisih menit awal dan menit akhir      
        int selisih_menit = 0;
         
        //  Jika menit awal > menit akhir.
        //  Contohnya, menit awal = 50 dan menit akhir = 10
        if(menit_awal > menit_akhir) {
             
            while(menit_awal != menit_akhir) {
                 
                if(menit_awal == 60) {
                    menit_awal = 0;
                    jam_awal++;
                        continue;
                }
                 
                menit_awal++;
                selisih_menit++;
            }
        }
         
        //  Jika menit awal < menit akhir
        //  Contohnya, menit awal = 10 dan menit akhir = 50
        else if(menit_awal < menit_akhir) {
            selisih_menit = menit_akhir - menit_akhir;          
        }
         
        //  Ubah selisih menit menjadi satuan detik (1 menit = 60 detik)
        selisih_waktu += selisih_menit * 60;
         
        //  Langkah Pertama, cari selisih jam awal dan jam akhir        
        int selisih_jam = 0;
         
        //  Jika jam awal > jam akhir. Contohnya, Jam Awal = 22 (10 malam) dan Jam Akhir = 05 (5 pagi)
        if(jam_awal > jam_akhir) {
             
            //  Cocokkan antara jam awal dan jam akhir
            while(jam_awal != jam_akhir) {
                if(jam_awal == 24) {                
                    jam_awal = 0;
                    continue;
                }
                 
                jam_awal++;
                selisih_jam++;
            }
        }
         
        //  Jika jam awal < jam akhir. Contohnya, Jam Awal = 05 (5 pagi) dan Jam Akhir = 22 (10 malam)
        else if(jam_awal < jam_akhir) 
            selisih_jam = jam_akhir - jam_awal;
         
        //  Ubah selisih jam menjadi satuan detik (1 jam = 3600 detik)
        selisih_waktu += selisih_jam * 3600;
 
         
        //  Tampilkan selisih antara waktu awal dan waktu akkhir dalam satuan detik
        System.out.println("Selisih antara waktu awal dan waktu akhir (detik) : "+selisih_waktu);
         
        //  Ubah selisih_waktu menjadi format waktu HH:mm:ss
        //  Ubah selisih waktu menjadi satuan jam
        int jam = selisih_waktu / 3600;
        selisih_waktu %= 3600;
         
        //  Ubah selisih waktu menjadi satuan menit
        int menit = 0;
        int detik = 0;
        if(selisih_waktu >= 60) {
            menit = selisih_waktu / 60;
            detik = selisih_waktu % 60;
             
        } else {
            menit = 0;
            detik = selisih_waktu;
        }
         
        //  Tampilkan selisih antara waktu awal dan waktu akhir dalam format waktu HH:mm:ss
        String waktu = jam+":"+menit+":"+detik;
        System.out.println("Selisih antara waktu awal dan waktu akhir (HH:mm:ss) : "+waktu);
    }
}