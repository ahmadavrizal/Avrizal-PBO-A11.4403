package contohpraktikum;

public class App {
    public static void main (String []args){
        Sepeda sepedaku = new Sepeda("Sepeda Otomatis");
        
        int jumlahroda = 2;
		sepedaku.setJumlahRoda(jumlahroda);
		
		System.out.println(sepedaku.getJumlahRoda());
        sepedaku.jalankan();
    }
}