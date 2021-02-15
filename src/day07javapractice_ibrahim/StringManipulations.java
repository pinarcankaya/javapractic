package day07javapractice_ibrahim;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {

		// kullanicidan isim ve soyisim isteyiniz ve bas harfleri buyuk geri kalan
		// harfleri kucuk
		// yazdiriniz

		Scanner scan = new Scanner(System.in);
		System.out.println("isminizi giriniz");
//		String isim=scan.nextLine().toLowerCase();
//		System.out.println("soyadinizi giriniz");
//		String soyisim=scan.nextLine().toLowerCase();
//		System.out.print(isim.substring(0, 1).toUpperCase()+isim.substring(1, isim.length()));
//		System.out.print(" " +soyisim.substring(0, 1).toUpperCase() +soyisim.substring(1, soyisim.length()));

		/// hocanin cozumu
		// int ikinciBasNok = isimSoyIsim.indexOf(" ");
//      System.out.print(isimSoyIsim.substring(0,1).toUpperCase());
//      System.out.print(isimSoyIsim.substring(1, ikinciBasNok+1).toLowerCase());
//      System.out.print(isimSoyIsim.substring(ikinciBasNok+1, ikinciBasNok+2).toUpperCase());
//      System.out.println(isimSoyIsim.substring(ikinciBasNok+2).toLowerCase());

		/// Array ile cozum
		String isimSoyIsim = scan.nextLine();
		
//                  0/fedai     1/ocak //isimler.length => 2 - 1    1 != 1
		String[] isimler = isimSoyIsim.split(" ");

		for (int i = 0; i < isimler.length; i++) {
			isimler[i] = isimler[i].toLowerCase();
				if(isimler.length-1 != i  ) //
			System.out.print(isimler[i].substring(0, 1).toUpperCase() + isimler[i].substring(1) + " ");
				else
		 System.out.print(isimler[i].substring(0,1).toUpperCase()+isimler[i].substring(1));
		}
scan.close();
	}

}
