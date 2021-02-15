package day02javapractice_harun;

public class Ornek02 {

	public static void main(String[] args) {

		// interview question***********
	       // Verilen iki değeri üçüncü bir değer kullanmadan yerlerini değiştiriniz
	       int  x = 50; //=>10
	       int  y  = 10; //=>50
	
	   	System.out.println("...degisiklik oncesi");
		System.out.println("x degeri= " + x);
		System.out.println("y degeri = " + y);
	       
	       
	        x= x+y;
	        y=x-y;
	        x=x-y;
	
	        System.out.println("degisiklik sonrasi= " +x);
	        System.out.println("degisiklik sonrasi= " +y);
	}
	}


