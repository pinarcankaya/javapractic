package day02javapractice_harun;

import java.util.Scanner;

public class Ornek05 {

	public static void main(String[] args) {

		 //Scanner kullanarak kullanıcıdan saat, dakika ve saniye bilgilerini alarak sonucu yazdırınz
		    // saat,dakika, saniye -->int
		    // PM veya AM--> String
		    // Örn: 11:25:33 PM
		
			
		Scanner scan =new Scanner(System.in);
		int saat,dakika,saniye;
		String amOrpm="";  		//boyle tirnakli tanimlanmazsa hata verebilir
		
		System.out.println("lutfen saati giriniz");
		saat=scan.nextInt();
		System.out.println("lutfen dakika giriniz");
		dakika=scan.nextInt();
		System.out.println("lutfen saniye giriniz");
		saniye=scan.nextInt();
		System.out.println("lutfen am veya pm degerini giriniz");
		amOrpm=scan.next();
		System.out.println(saat+ ":" + dakika + ":" + saniye + " " + amOrpm.trim().toUpperCase());
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
