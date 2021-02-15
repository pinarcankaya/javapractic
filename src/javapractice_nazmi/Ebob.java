package javapractice_nazmi;

import java.util.Scanner;

public class Ebob {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Lütfen 1. pozitif tam sayı giriniz.");
		
		int num1= sc.nextInt();
		System.out.println("Lütfen 2. pozitif tam sayı giriniz.");
		int num2 = sc.nextInt();
		
		int obeb=0;
		for (int i = 1; i <=num1 && i<=num2; i++) {
			
			if(num1%i==0 || num2%i==0) {
				obeb=i;
			}
			
		}System.out.println(num1 + " ve " + num2 + " ortak böleni: " + obeb);
		





	}

}
