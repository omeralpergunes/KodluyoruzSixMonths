package kodluyoruzsixmonths;

import java.util.Scanner;

public class UcakBileti {

	double km=0.10;
	double mesafe,yas,total;
	double sonuc;
	
	
	public void normalTutar() {
	
		total=mesafe*km;
	
		if(yas<12) {
			total-=total*0.50;
			System.out.println(total);
		}
		else if(yas>=12 && yas<=24) {
			total-=total*0.10;
			System.out.println(total);
		}
		else if(yas>=65) {
			total-=total*0.30;
			System.out.println(total);
		}
		else {
			System.out.println("Geçersiz Değer");
		}
	}
	
	public void gidisDonus() {
		
		normalTutar();
		total-=total*0.20;
		System.out.println(total);
		
	}
	

	public static void main(String[] args) {
		int yon;
		UcakBileti ucakBileti = new UcakBileti();		
		Scanner giris = new Scanner(System.in);
		System.out.println("Mesafeyi KM Türünden Giriniz: ");
		ucakBileti.mesafe=giris.nextDouble();
		System.out.println("Yaşınızı Giriniz:");
		ucakBileti.yas=giris.nextDouble();
		System.out.println("Yolculuk Tipini Giriniz (1=> Tek Yön , 2 => Gidiş-Dönüş ");
		yon=giris.nextInt();	
		switch(yon) {
		case 1:ucakBileti.normalTutar();
		break;
		case 2:ucakBileti.gidisDonus();
		break;
		case 3:System.out.println("Hatalı Veri Girdiniz:");
		break;
		}
		}
	}
