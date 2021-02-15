package day02javapractice_harun;

public class Ornek01 {

	public static void main(String[] args) {


		//verilen iki sayinin yerlerini degistiriniz
		int num1=11;	//33
		int num2=33;	//11
		
		System.out.println("...degisiklik oncesi");
		System.out.println("1.sayi = " + num1);
		System.out.println("2.sayi = " + num2);
		int bos=num1;		//1.sayiyi bos a atiyoruz
		num1=num2;			//2.sayiyi bire atiyoruz
		num2=bos;			//bos icindeki degeri 2.sayiya atiyoruz
		
		System.out.println("...degisiklik sonrasi=" +  num1);
		System.out.println("....degisiklik sonrasi=" +  num2);
		
		
	}

}
