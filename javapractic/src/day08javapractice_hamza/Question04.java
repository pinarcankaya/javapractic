package day08javapractice_hamza;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import javapractice_nazmi.ForLoop;

public class Question04 {

	public static void main(String[] args) {

		/* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayıyı String'e çevirin.
		 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen sayiyi giriniz");
		int sayi = scan.nextInt();
		
			
		
		System.out.println(getRakamlarToplami(sayi));
	}
	
	public static int getRakamlarToplami(int sayi) {
		String sayininStringi=String.valueOf(sayi);
		int toplam=0;
		
		for (int i = 0; i <sayininStringi.length(); i++) {
			int sayiyaCevir=Integer.parseInt(sayininStringi.substring(i,i+1));
			toplam+=sayiyaCevir;
		}
		
		/*Integer.parseInt("10");	//valuof ile ayni
		 * 
		 */
		
		
		return toplam;
}	
}
