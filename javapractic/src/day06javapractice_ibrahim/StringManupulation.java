package day06javapractice_ibrahim;

import java.util.Scanner;

public class StringManupulation {

	public static void main(String[] args) {

		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("bir cumle giriniz");
		String str=scan.nextLine();
		
		String arr[]=str.split(" ");
		for (int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+ " ");
		}
		
		
	}

}
