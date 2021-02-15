package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {
		/* Girilen e-mailin doğru olup olmadığını anlayan bir method yazınız.
		 * Method boolean veri tipinde değer döndersin.
		 * 
		 * hamzayilmaz   // @   .   " "    2
		 * */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir e-mail yazınız : ");
		String email = scan.next();
		boolean dogruMu = getEmailDogruMu(email);
		System.out.println("Email : " +dogruMu);
	}
	private static boolean getEmailDogruMu(String email) {
		if(!email.contains("@"))
			return false;
		if(!email.contains("."))
			return false;
		if(email.length()<=4)
			return false;
		String[] array = email.split("@");
		if(array[0].length()<1)
			return false;
		if(array[1].length()<3)
			return false;
		if(array.length > 2)
			return false;
		return true;
	}
}