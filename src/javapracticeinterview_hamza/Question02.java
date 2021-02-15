package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {

		//girilen sayinin faktoriyelini bulan bir metot yaziniz
	
		   
		
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		long sayi=scan.nextLong();
		
		long faktoriyel=getFaktoriyel(sayi); 
		
		System.out.println("sonuc :" + faktoriyel);
	}

	private static long getFaktoriyel(long sayi) {
			if(sayi==0 || sayi==1) {
				return 1;
			}
			long faktoriyel=1;
			
			for(int i=1; i<=sayi; i++) {  //1-5
				faktoriyel*=i;
			}
			return faktoriyel;
	}
	
	///2.yol profesyonel hali
	private static long getFaktoriyelYeni(long sayi) {
		if(sayi==0 || sayi==1) {
			return 1;
		}else {
			return sayi*getFaktoriyelYeni(sayi-1);
		}
	}
}
