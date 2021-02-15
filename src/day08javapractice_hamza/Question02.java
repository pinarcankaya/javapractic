package day08javapractice_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız. 
		 * 
		 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
		 * 2. Adım : Kullanıcıdan tahminini alalım.
		 * 3. Adım : Kullanıcının girdiği tahmini, bilgisayarın ürettiği 
		 * 			 rastgele sayı ile karşılaştıralım.
		 * 4. Adım : Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, 
		 * 			 bunu da while döngüsü ile yapalım.
		 *
		 * */
		Scanner scan = new Scanner(System.in);
		Random random=new Random();
		
		int rastgeleSayi=random.nextInt(10);
		
		int tahmin=-1;	//while dongusu calissin diye 0-10 aarsi bisey yazmadik
	//	System.out.println(rastgeleSayi);
		
		while (tahmin!=rastgeleSayi) {
			System.out.println("lutfen tahmininizi yaziniz");
			tahmin=scan.nextInt();
			
			if(tahmin==rastgeleSayi) 
				System.out.println("tebrikler! kazandiniz ");
			else {
				System.out.println("yanlis cevap! tekrar deneyiniz");
			
		}
		
		
		
		
		}
		scan.close();
	}

}
