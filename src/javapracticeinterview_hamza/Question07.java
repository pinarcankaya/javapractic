package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		//girilen ifadenin Array kullanrak tersini alalim
		//return yapsin
		//metin adi getTersi(char[] array) olsun
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade yazınız : ");
		String ifade = scan.nextLine();
		char[] array = ifade.toCharArray();
		String ters = getTersi(array);
		System.out.println("Tersi : " + ters);
	}
	private static String getTersi(char[] array) {
		String ters = "";
		for(int i = array.length - 1 ; i >= 0; i--) {
			ters += array[i];
		}
		return ters;
	}


}
