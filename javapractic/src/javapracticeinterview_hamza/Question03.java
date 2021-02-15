package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question03 {

	public static void main(String[] args) {
		//verilen sayinin rakamlari toplamini return eden bir method yaziniz

		Scanner scan =new Scanner(System.in);
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		int rakamlarToplami=getRakamlarToplami(sayi);
		System.out.println("rakamalr toplami : "+ rakamlarToplami);
		
		
		
	}

	private static int getRakamlarToplami(int sayi) {

		int toplam=0;
		while(sayi>0) {
			toplam+=sayi%10;
			sayi/=10;
			
			//
		}
		System.out.println(toplam);
		return 0;
		
		
		
		
		
		//hocanin cozumu
		/*int toplam = 0;
		int birlerBasamagi = 0;
		while(sayi > 0) {		// 12
			birlerBasamagi = sayi % 10;    // 0					2             1
			toplam += birlerBasamagi;      // toplam = 0 + 0 +  2		+     1  	
			sayi = sayi / 10;			   // sayi = 12		  sayi = 1		sayi = 0  */

		//once stringe sonra char a sonra tekrar stringe cevirip elemnlari tek tek alip da yapabilirdik
		//yda substring ile tek tek alip da sonra toplayabiliriz (for a atarak)
		///// 123  = > "123"
		//			 '1'  '2'  '3'
		//			 "1"  "2"  "3"
		//			Integer.parseInt("1") => 1
		//			Integer.parseInt("2") => 2
		//			Integer.parseInt("3") => 3 + 2 + 1
	}

}
