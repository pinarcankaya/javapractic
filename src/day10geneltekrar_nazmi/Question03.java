package day10geneltekrar_nazmi;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {

		// Kullanıcıdan 2 sayı alalım 1. sayı taban olsun. 2. sayı üssü olsun
		// 1. sayının üsünü bulalım
		
		//1.yol
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		int taban=scan.nextInt();
		System.out.println("lutfen bir sayi daha giriniz");
		int kuvvet=scan.nextInt();
		System.out.println(Math.pow(taban, kuvvet));
			
		/////2.yol
		int sonuc=1;
		for (int i = 1; i <= kuvvet; i++) {
			sonuc=sonuc*taban;
			
		}
			System.out.println(sonuc);
			
		
		////while ile cozum
			  /*   while (kuvvet !=0){
			​
			             sonuc *=taban;
			             kuvvet--;
			​
			         }
			        System.out.println("Cevap: " + sonuc);
			​
			       */
			//for ile diger cozum​
			       /* for (;kuvvet!=0;kuvvet--){
			            sonuc *=taban;
			        }
			        System.out.println("Cevap: " + sonuc);
			​
			        */

	}

}
