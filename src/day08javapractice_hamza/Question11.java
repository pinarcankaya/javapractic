package day08javapractice_hamza;

import java.util.Scanner;

public class Question11 {

	/*
	 * Soru: Klavyeden girilen herhangi bir sayının, okunuşunu ekrana yazdırınız.
	 * (max yazılabilecek sayı 999 olsun) - dokuzyüz doksan dokuz
	 * 
	 * 1. Adım : Kullanıcıdan sayı alalım. 2. Adım : Sayıyı onlar, yuzler, binler
	 * basamağına bölelim. 3. Adım : Switch case ile her sayı için, o sayıya denk
	 * gelen okunuşu gösterelim. örnek : yüzler basamağındaki 1 için, yüzler örnek :
	 * onlar basamağındaki 7 için yetmiş gibi.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen sayı giriniz (max 999) : "); // 56
		int sayi = scan.nextInt();
		int birler = sayi % 10; // = 6
		sayi = sayi / 10;
		int onlar = sayi % 10; // = 5
		sayi = sayi / 10;
		int yuzler = sayi; // = 0
		/*
		 * String yaziHali = ""+sayi; String birlerBasamagi = yaziHali.substring(2,3);
		 * String onlarBasamagi = yaziHali.substring(1,2); String yuzlerBasamagi =
		 * yaziHali.substring(0,1);
		 */
		System.out.print(birler);
		System.out.print(onlar);
		System.out.println(yuzler);
		sayiyiOku(birler, onlar, yuzler);
	}

	private static void sayiyiOku(int birler, int onlar, int yuzler) {
		switch (yuzler) {
		case 1:
			System.out.print("one hundred");
			break;
		case 2:
			System.out.print("two hundred ");
			break;
		case 3:
			System.out.print("three hundred ");
			break;
		case 4:
			System.out.print("four hundred");
			break;
		case 5:
			System.out.print("five hundred");
			break;
		case 6:
			System.out.print("six hundred");
			break;
		case 7:
			System.out.print("seven hundred ");
			break;
		case 8:
			System.out.print("eight hundred");
			break;
		case 9:
			System.out.print("nine hundred ");
			break;
		default:
			break;
		}
		switch (onlar) {
		case 1:
			System.out.print("ten ");
			break;
		case 2:
			System.out.print("twenty");
			break;
		case 3:
			System.out.print("thirty");
			break;
		case 4:
			System.out.print("fourty");
			break;
		case 5:
			System.out.print("fifty");
			break;
		case 6:
			System.out.print("sixty ");
			break;
		case 7:
			System.out.print("seventy ");
			break;
		case 8:
			System.out.print("eighty ");
			break;
		case 9:
			System.out.print("ninety ");
			break;
		default:
			break;
		}
		switch (birler) {
		case 1:
			System.out.println("one ");
			break;
		case 2:
			System.out.println("two ");
			break;
		case 3:
			System.out.println("three ");
			break;
		case 4:
			System.out.println("four ");
			break;
		case 5:
			System.out.println("five ");
			break;
		case 6:
			System.out.println("six ");
			break;
		case 7:
			System.out.println("seven ");
			break;
		case 8:
			System.out.println("eight ");
			break;
		case 9:
			System.out.println("nine ");
			break;
		default:
			break;
		}
	}
}