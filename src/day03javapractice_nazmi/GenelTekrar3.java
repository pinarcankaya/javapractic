package day03javapractice_nazmi;

import java.util.Scanner;

public class GenelTekrar3 {

	public static void main(String[] args) {

		// kullanicidan iki kelime aliniz beraber ekarana yazdir sonuna unlem ekle

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen birinci sayiyi  giriniz");
		int sayi1 = scan.nextInt();
		System.out.println("lutfen ikinci sayiyi giriniz");
		double kare1=Math.pow(sayi1, 2);
		int sayi2 = scan.nextInt();
		double kare2=Math.pow(sayi2, 2);

		System.out.println(kare1);
		System.out.println(kare2);
	}

}
