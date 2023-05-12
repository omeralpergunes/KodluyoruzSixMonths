package kodluyoruzsixmonths;

import java.util.Scanner;

public class VucutKitleEndeks {

	double boy;
	double kilo;
	double sonuc;
	
	public double endeksHesapla(){
		
		sonuc = (kilo)/(boy*boy);
		
		
		return sonuc;
	}
	
	
	public static void main(String[] args) {
		
		VucutKitleEndeks kitleEndeks = new VucutKitleEndeks();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Boyu Giriniz:");
		kitleEndeks.boy = scanner.nextDouble();
		System.out.println("Kilonuzu Giriniz");
		kitleEndeks.kilo = scanner.nextDouble();
		System.out.println("Sonuç " + kitleEndeks.endeksHesapla());
		
		
	}

}
