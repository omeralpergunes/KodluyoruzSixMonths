package kodluyoruzsixmonths;

import java.util.Scanner;

public class ManavKasaProgrami {
	
	double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlican=5.00, tutar;	
	int akilo,ekilo,dkilo,mkilo,pkilo;
	
	public void Hesapla() {
		tutar=(armut*akilo)+(elma*ekilo)+(domates*dkilo)+(muz*mkilo)+(patlican*pkilo);
		System.out.println(tutar);
	}

	public static void main(String[] args) {
		
		ManavKasaProgrami kasaProgrami = new ManavKasaProgrami();
		Scanner deger = new Scanner(System.in);
		System.out.println("Armut Kaç Kilo:");
		kasaProgrami.akilo=deger.nextInt();
		System.out.println("Elma Kaç Kilo:");
		kasaProgrami.ekilo=deger.nextInt();
		System.out.println("Domates Kaç Kilo:");
		kasaProgrami.dkilo=deger.nextInt();
		System.out.println("Muz Kaç Kilo:");
		kasaProgrami.mkilo=deger.nextInt();
		System.out.println("Patlıcan Kaç Kilo:");
		kasaProgrami.pkilo=deger.nextInt();
		System.out.println("Toplam Tutar:");
		kasaProgrami.Hesapla();
		
	}

}
