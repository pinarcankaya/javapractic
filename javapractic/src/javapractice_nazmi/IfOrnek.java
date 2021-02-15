package javapractice_nazmi;

import java.util.Scanner;

public class IfOrnek {

	public static void main(String[] args) {

		//kullanicidan yas ve kilo alalim 18 yasindan kucukse kan bagisi yapamasin
		//18 yasindan buyuk ve 50 kilodan zayifsa kan veremesin
		//18 yasindan buyuk ve 50 kilodan fazlaysa kan verebilsin
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Lütfen yasinizi giriniz.");
		int yas= sc.nextInt();
		System.out.println("Lütfen kilonuzu giriniz.");
		int kilo = sc.nextInt();
		
//		if (yas<18) {
//			System.out.println("kan bagisi yapamazsiniz");
//		}
//		else if( yas>=18 && kilo<50) {
//				System.out.println("kan veremezsiniz");
//			}
//		
//			else if (yas>=18 && kilo>50) {
//			System.out.println("kan bagisi yapabilirsiniz");
		
		
		///ternary ile cozum
		String result= (yas>=18 ? kilo>=50 ? "Kan verebilirsiniz." :"50 kilodan zayıflar kan veremez." :"18 yaşından küçükler kan veremez.");
		System.out.println(result);
		}
		
	}


