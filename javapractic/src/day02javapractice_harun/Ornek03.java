package day02javapractice_harun;

import java.util.Random;

public class Ornek03 {

	public static void main(String[] args) {

		//0 ile 1000 arasında random bir sayı oluşturarak bu sayının rakamları toplamını veren java algoritma kodunu yazınız ?	
		//random sayi= 185  toplamları = 14
	
		int randomSayi= (int)(Math.random()*1000) ; //0 ile 1000 arasi
		
		//int randomSayi= (int)(Math.random()*10)+10 ; //0 ile 20 arasi degerler
			
		//	Random random = new Random();
		//	int randomSayi= random.nextInt(1000);
			
			System.out.println(randomSayi);
	
			int birler=randomSayi%10;
			int onlar=randomSayi/10%10;
			int yuzler=randomSayi/100;
			System.out.println("rakamlar toplami = " +( birler+onlar+yuzler));
	
	}

}
