package day08javapractice_hamza;

import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		/* 2. Kullanıcının girdiği sayının, while döngüsü kullanarak 
		 * 			 rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayının %10'unu alarak son hanesini al ve toplama ekle.
		 * 3. Adım : Daha sonra sayıyı son haneden kurtarmak için 10'a böl.
		 * 4. Adım : Sayı 0 olarak kadar bu işlemi while döngüsü ile tekrarla.
		 * 
		 * Bunu da method kullanarak yapalım, toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplamiWhileDongusu(int sayi)
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sayiyi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println(getRakamlarToplamiWhileDongusu(sayi));
		
		
	}

	public static int getRakamlarToplamiWhileDongusu(int sayi) {
		
		int sum=0;    
			while (sayi>0){		
			sum+=sayi%10;
			sayi=sayi/10;
	}
			return sum;
}
}