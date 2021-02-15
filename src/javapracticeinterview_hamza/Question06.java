package javapracticeinterview_hamza;

import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {

		//girilen sayi yada metnin polindrom olup olmadigini kontroleden bir method yazinz
		//method booelan olarak bir deger retun etsin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade yazınız : ");
		String ifade = scan.nextLine();
		
		if(getPolindrom(ifade.toLowerCase())) {
			System.out.println("Polindrom");
		}else {
			System.out.println("Polindrom Değil");
		}
	}
	private static boolean getPolindrom(String ifade) {
		int i = 0;
		int j = ifade.length()-1;
		while(i < j) {
			if(ifade.charAt(i) != ifade.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	//2.yol
	private static boolean getPolindromYeni(String word) {
		String wordTers = "";
   		boolean ne = false;
   		for(int i = word.length()-1; i>=0; i--) {
   			wordTers = wordTers + word.charAt(i);
   		}
   		if(wordTers.equalsIgnoreCase(word)) {
   			ne = true;
   		}else {
   			ne = false;
   		}  	
   		return ne;
	}
}
		 