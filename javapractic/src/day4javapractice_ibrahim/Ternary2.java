package day4javapractice_ibrahim;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {

		// kullanicidan bir harf isteyelim ve bunun buyuk harf kucuk harg yada hatali
		// giris  oldugunu ternary ile kontrol edelim
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir harf giriniz");
		char harf = scan.next().charAt(0);

		String result = harf >= 'a' && harf <= 'z' ? "kucuk harf"
				: harf >= 'A' && harf <= 'Z' ? "buyuk harf" : "hatali giris";
				System.out.println(result);
	}

}
