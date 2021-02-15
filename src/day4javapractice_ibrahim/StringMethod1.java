package day4javapractice_ibrahim;

import java.util.Scanner;

public class StringMethod1 {

	public static void main(String[] args) {

		//index of karaekterin yerini belirler  stringdeki karakter sayimi 0'dan baslar
		//istanbul kelimesindeki "u" harfinin indexini bulunuz
		
//		String str="Istanbul";
//		System.out.println(str.indexOf('u'));
//		
//		//last index of aradugimiz karekterin stringdeki son gorunumunu verir
//		
//		String str1="sarikayalar";
//		System.out.println(str1.lastIndexOf('a'));
//	}
		//length() uzunluk verir	
	//kullanicindan bir kelime alalim ve son harfini yazalim

//		Scanner scan = new Scanner(System.in);
//		System.out.println("lutfen bir kelime giriniz");
//		String str2=scan.nextLine();
//		System.out.println(str2.charAt(str2.length()-1));
		
		//contains methodu karekter arar varsa true yoksa false return eder
		String str3="java ogrenmek bizim isimiz";
		System.out.println(str3.contains("biz"));
		System.out.println(str3.contains("pinar"));
		
		//Isempty stringde karakter var ise false yok ise true doner
		String soz="";
		System.out.println(soz.isEmpty());
	
		//trim methodu bas ve sondaki bosluklari yok eder
		String str4="  Nevsehir cocuguyuz  ";
		System.out.println(str4.trim());
	
		//starswith istenen harf ile baslayip baslamadigini kontrol eder
		String str5="Nevsehir";
		System.out.println(str5.startsWith("N"));
		
		//substring methodu stringin belli bir kismini kesip almaya yarar
		String str6="OzkanPinarYanyana";
		System.out.println(str6.substring(2));
		System.out.println(str6.substring(0, 10));
		
		//kullanıcısan tek kelime alalım ve ilk karfi le son harfini yerdeğiştirelim.
		String abc="France";
		System.out.println(abc.charAt(abc.length()-1)+ abc.substring(1,abc.length()-1)+abc.charAt(0));
		
		
	}	
}
