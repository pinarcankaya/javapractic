package day08javapractice_hamza;

import java.util.Scanner;

public class PolindromSayi {

	public static void main(String[] args) {
		/*
		 * Kullanıcı tarafından girilen yazı ya da sayının polindrom olup olmadığını bulan bir program yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan veri alalım.
		 * 2. Adım : For döngüsü kullanarak aldığımız ifadenin tersini bulalım.
		 * 3. Adım : Tersi ile normal ifadeyi karşılaştıralım.
		 * */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir sayi giriniz");
		String str=scan.nextLine().replace(" ", "");
		String ters="";
		for (int i = str.length()-1; i>=0; i--) {
			ters=ters+str.charAt(i);
		}
		if(str.equals(ters)) {
			System.out.println("polindrom");
		}else {
			System.out.println("polindrom degil");
		}
		
		//2.yol
//		  String cumle = "ada";
//		    StringBuilder sbl = new StringBuilder(cumle);
//		    String ters = sbl.reverse().toString();
//		    if(cumle.equals(ters)) {
//		        System.out.println("Bu polindromdur.");
//		      }else {
//		    	  System.out.println("polindrom degil");
//		      }

		
				}

}
