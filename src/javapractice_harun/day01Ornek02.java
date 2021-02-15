package javapractice_harun;

import java.util.Scanner;

public class day01Ornek02 {

	public static void main(String[] args) {
		  // kullanicidan bilgileri alarak dikdortgenin alan ve cevresini hesapla
	     Scanner scan = new Scanner(System.in);
	     System.out.println("lutfen dikdorgenin kenar uzunluklarini giriniz");
	     double en=scan.nextDouble();
	     double boy=scan.nextDouble();
	     double alan=en*boy;
	     double cevre= 2*en+2*boy;
	     System.out.println("Alan= " + alan);
	     System.out.println("Cevre= " + cevre);
	
	    
	     //kullanicidan uc sayi al toplamini ekrana yazdir
	     
	     System.out.println("Lutfen toplamak istediginiz uc sayi giriniz");
	     int sayi1=scan.nextInt();
	     int sayi2=scan.nextInt();
	     int sayi3= scan.nextInt();
	     int toplam=sayi1+sayi2+sayi3;
	     System.out.println("sayilarin toplami=" + toplam);
	     
	     // ikinci yol
	     int num1,num2,num3,toplam1;
	     System.out.println("3 tam sayi giriniz");
	     Scanner scan1 = new Scanner(System.in);
	     num1 = scan1.nextInt();
	     num2 = scan1.nextInt();
	     num3= scan1.nextInt();
	     toplam1=num1+num2+num3;
	    System.out.println(toplam1);
	
	
	
	
	
	scan.close();
	
	}

	
}
