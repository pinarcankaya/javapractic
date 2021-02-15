package day05javapractice_nazmi;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {

		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
		*/
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen e-mail giriniz");
		String mail=scan.nextLine();
	
		if(mail.contains("hotmail")) {
		System.out.println(mail.replace("hotmail", "gmail"));
	
		
		}
	}
}
