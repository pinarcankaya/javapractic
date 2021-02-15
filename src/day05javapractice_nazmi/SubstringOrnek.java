package day05javapractice_nazmi;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		/*
		uKullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
		ue.g:
		umehmet ==>  mehahmetmet
		uahmet
		u*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen iki isim giriniz");
		String isim1=scan.nextLine();
		String isim2=scan.nextLine();
		
		if (isim1.length()%2==0) {
		System.out.println(isim1.substring(0, isim1.length()/2)+isim2+isim1.substring(isim1.length()/2));
			}
		}
		
	}


