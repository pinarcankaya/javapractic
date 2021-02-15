package javapractice_nazmi;

import java.util.Scanner;

public class Modulus {

	public static void main(String[] args) {

		//kullanicidan 5 basamakli pozitif bir tam sayi alalim ve her rakamini yazdiralim
		
//		Scanner scan=new Scanner(System.in);
//		
//		System.out.println("5 basamakli pozitif tam sayi girin");
//		int sayi=scan.nextInt();
//		int birler=sayi%10;
//		int onlar=sayi/10%10;
////		int yuzler=sayi/100%10;
//		int binler=sayi/1000%10;
//		int onbinler=sayi/10000;

		
//		System.out.println("birler bas: " + birler);
//		System.out.println("onlar bas: " + onlar);
//		System.out.println("yuzler bas: " + yuzler);
//		System.out.println("binler bas: " + binler);
//		System.out.println("onbinler bas: " + onbinler);
		
		int num=12; 
//    	int birler=num%10;
//    	int onlar=num/10%10;
//    	int ters=birler*10+onlar;
    	
    	String bos="";
    	while(num>0) {
    		bos=bos+num%10;
    		num=num/10;
    	}
    	System.out.println(bos+20);
    	
    	int sonters=Integer.valueOf(bos);
    	System.out.println(sonters+20);

    	int sonsayi=0;
    	while(num>0) {
    		int bas=num%10;
    		num=num/10;		
    	sonsayi=bas*10+bas;
    	}
    	System.out.println(sonsayi);
    	
			//scan.close();
		
}	
	}


