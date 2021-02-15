package day10geneltekrar_nazmi;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {

		//Klavyeden girilen bir cümlede belirttiğimiz bir
		//harfin tekrar sayısını hesaplayalım.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		String harf=scan.next();
		
		
		int count=0;
		
		for (int i = 0; i < cumle.length(); i++) {
			if(cumle.substring(i,i+1).equals(harf)) {
			count++;
			}
		}
		System.out.println("harf sayisi: " + count+" defa tekrar edilmistir");
		
		
		
		
	}

}
