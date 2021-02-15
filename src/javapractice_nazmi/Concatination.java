package javapractice_nazmi;

import java.util.Scanner;

public class Concatination {

	public static void main(String[] args) {

		//5 + "Ali"	///"Ali" + 5+5
		
//		System.out.println(5+"Ali"+5+5);
//		
//		int num=4;
//		num=num+1;
//		num++;
//		System.out.println(num);
		
		//kullanicidan 3 tane sayi aliniz bu sayilarla ucgen olup olamayacaigini kontrol edelim
		//ucgen ise esitkenar mi degil mi
		Scanner scan=new Scanner(System.in);
		System.out.println(" 3 pozitif tam sayi girin");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		 if (a+b>c && a+c>b && b+c>a) {
			 if(a-b<c && a-c<b && b-c<a) {
				 if(a==b && a==c && b==c) {
				 System.out.println("eskenar ucgen cizilebilir");
			
			 }else {
				 System.out.println("eskenar olmayan ucgen");
			 }
			 
		 }	else {
			 System.out.println("ucgen degildir");
		 }
		 }
		 scan.close();
}
}