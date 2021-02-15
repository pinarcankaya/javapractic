package javapractice_nazmi;

import java.util.Scanner;

public class CarpimTablosu {

	public static void main(String[] args) {

		//kullanicidan rakam alalim ve bu rakamin carpim tablosunu ekrana yazdiralim
		//sonra da butun carpim tabmosunu yazdiralim
	//
		Scanner scan = new Scanner(System.in);
	//	System.out.println("lutfen bir rakam giriniz");
		//int num=scan.nextInt();
	
		for (int num = 1; num <= 10; num++) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "*" + num+ "=" + (i * num) + " ");
				
			}
			
		}
	}

}
