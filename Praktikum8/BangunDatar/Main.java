package contohbangundatar;

public class Main
{
	public static void main(String[] args)
	{
		System.out.println("\nPersegi");
		Persegi a = new Persegi();
		a.setSisi(20);
		showLuasKeliling(a);

		System.out.println("\nsegitiga siku");
		SegitigaSiku b = new SegitigaSiku();
		b.setAlas(5);
		b.setTinggi(20);
		showLuasKeliling(b);

		System.out.println("\nsegitiga sama kaki");
		SegitigaSamaKaki d = new SegitigaSamaKaki();
		d.setAlas(9);
		d.setTinggi(7);
		showLuasKeliling(d);

		System.out.println("\nsegitiga sama sisi");
		SegitigaSamaSisi e = new SegitigaSamaSisi();
		e.setAlas(6);
		e.setTinggi(4);
		showLuasKeliling(e);
	}

	static void showLuasKeliling(BangunDatar a)
	{
		System.out.print("luasnya Adalah = ");
		a.luas();
		System.out.print("kelilingnya Adalah = ");
		a.keliling();
	}
}
