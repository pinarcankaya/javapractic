package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi = scan.nextInt();

		String sayilar = String.valueOf(sayi);
		StringBuilder str = new StringBuilder(sayilar);
		String ters = str.reverse().toString();
		int tersSon = Integer.valueOf(ters);
		System.out.println(tersSon);

		// int ters = sayininTersi(sayi);
		// System.out.println("Sayının Tersi " + ters);

		// for ile cozum
		/*
		 * Scanner scan = new Scanner(System.in); System.out.println("Sayi giriniz");
		 * String sayi = scan.next(); String rvs = ""; for (int i = sayi.length()-1;
		 * i>=0; i--) { rvs = rvs+ sayi.charAt(i)+""; }
		 * 
		 * System.out.println(rvs);
		 */

		/*
		 * public static int sayininTersi(int n) { // 1654 - 456 // 4000 // 500 // 60 //
		 * 1 int sonuc = 0; while(n>0) { int sayi = n % 10; // 4 5 6 n/=10; // 65 6 0
		 * sonuc = sonuc*10+sayi; // 0*10 + 4 = 4; 45 456 } return sonuc; }
		 */

	}
}
