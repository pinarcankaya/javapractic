package day4javapractice_ibrahim;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {

		//kullanicidan alinacak sayinin negatif pozitif ya da notr oldugunu kontrol eden ternary yazalim
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int num=scan.nextInt();
		
		String result = num>0 ? "pozitif" : num==0 ? "notr" :  "negatif"; 
		System.out.println(result);
		
	}

}
