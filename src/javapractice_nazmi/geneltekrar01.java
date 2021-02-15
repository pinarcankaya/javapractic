package javapractice_nazmi;

import java.util.Scanner;

public class geneltekrar01 {

	public static void main(String[] args) {

		//kullanicidan 5 basamakli bir sayi alalim ve bu sayinin bastan 2 ve sondan 2 rakamlarin
		//basamak degeri ile  toplma sonucunu yazdiralim
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Lütfen 5 basamaklı tam sayı giriniz.");
		
		int num = sc.nextInt();
		
		int ilkIki=num/1000;
		System.out.println(ilkIki);
		ilkIki=ilkIki*1000;
		
		
		int sonIki= num%100;
		System.out.println(sonIki);
		
		int sum = ilkIki + sonIki;
		
		System.out.println("Toplam:" +sum);

	}				//12045 cikacak
}
