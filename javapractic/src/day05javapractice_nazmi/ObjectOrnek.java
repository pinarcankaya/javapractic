package day05javapractice_nazmi;

public class ObjectOrnek {

	public static void main(String[] args) {

		StringBuilder stb=new StringBuilder();
		stb.append("Ozkan");
		System.out.println(stb.equals(stb.reverse())); //true verir cunku adres ayni
		System.out.println(stb.equals(stb.reverse().toString())); //false verir. stringe donustugu icin degerler degisir
		
		StringBuilder stb2=new StringBuilder();
		stb2.append("pinar");
		System.out.println(stb2);
		System.out.println(stb2.reverse());
		System.out.println(stb2.equals(stb2.reverse())); //iki degeri birbiri ile karsilastiriyorz
		//StringBuilder ile olusturulan objectlerin tersi ile karsilastirilmasinda reference lari ayni kalir
		System.out.println(stb2.equals(stb2.reverse().toString()));//stringe donustu artik
		System.out.println(stb2.toString().equals(stb2.reverse().toString()));
		//ada gibi tersen okunusu ayni olanlar icin de yukardaki gibi ikisi de stringe cevrilip bakilir
		//yoksa false verir.biri string biri builder cunku
		
		
		String name1="mahmut";
		String name2="mahmut";
		System.out.println(name1.equals(name2));
		
		
		
		
		
		
	}

}
