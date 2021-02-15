package day08javapractice_hamza;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question08 {

	public static void main(String[] args) {

		/*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
		 *  1. Adım : Kullanıcıdan ismini isteyelim
		 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
		 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
		 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
		 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
			*/
			
			List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
			veritabanindakiKullaniciListesi.add("Ahmet");
			veritabanindakiKullaniciListesi.add("Ayşe");
			veritabanindakiKullaniciListesi.add("Süleyman");
			veritabanindakiKullaniciListesi.add("Nazmi");
		 
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen isim ve soyisim giriniz");
		String isim=scan.nextLine().replace(" ", "");
			
		int num = new Random().nextInt(1000);
		
		if(veritabanindakiKullaniciListesi.contains(isim)) {
			System.out.println("yeni isim onerisi" +isim+num);
		}else {
			System.out.println("Basarili bir kullanici adi girdiniz");
		}

		//ternary ile cozum
		System.out.println(veritabanindakiKullaniciListesi.contains(isim) ? "Bu kullanıcı adi alınmış." : "Bu kullanıcı adı UYGUN !" );
		if(veritabanindakiKullaniciListesi.contains(isim)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = isim + rastgeleSayi;
			System.out.println("YENİ KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YENİ KULLANICI ADINIZ : " + isim);
		
		
		
		scan.close();
	}
	}
	}
