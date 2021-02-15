package day05javapractice_ibrahim;

public class StringMethod01 {

	public static void main(String[] args) {

		//concat() methodu concatination yapmamizi saglar
		String str1="ankara";
		String str2="van";
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		
		
		//replace() methodu strigdeki istenilen karakterin baska bir karakter ile degistirmemizi saglar
		String str3="karete";
		System.out.println(str3.replace("a", "o"));
		
		
		//valueOf()  2 farkli kullanimi var
		//1-methodu string icindeki rakamlari 
	//	String icindeki int karakterlere matematiksel islem yapmamizi saglar
		String butce1="12000";
		String butce2="13000";
		System.out.println(butce1+butce2);
		System.out.println(Integer.valueOf(butce1)+Integer.valueOf(butce2));
		
		//2-Int icindeki karakterlere string ozelligi katar
		int yas1=12;
		int yas2=15;
		System.out.println(yas1+yas2);
		System.out.println(String.valueOf(yas1)+String.valueOf(yas2));
		
		
		
		
		
		
		
		
	}

}
