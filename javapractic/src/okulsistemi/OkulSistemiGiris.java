package okulsistemi;

public class OkulSistemiGiris {

	/*
	 * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
	 * 
	 * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı bir class oluşturalım
	 * 			 Buradaki verileri public static final olarak tutalım.
	 * 			 MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adım : Ogretmen adlı bir class oluşturalım.
	 * 			 Bu classta öğretmenin adı, branşı ve telefon numaralarını tutalım.
	 * 			 String isim, brans, telefon ;
	 * 			 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman öğretmenlerin bilgilerini yazdıralım
	 * 
	 * 3. Adım : Ogrenci adlı bir class oluşturalım.
	 * 			 Bu classta pgrencinin adı, okulnumarası bulunsun.
	 * 			 String isim;
	 *   		 int ogrenciNo;
	 *   		 
	 * 			 içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman ogrencilerin bilgilerini yazdıralım
	 * 
	 * 4. Adım : Ogretmenler adlı class oluşturalım.
	 * 			 Bu classta tüm öğretmenleri tutualım.
	 * 			 İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak yeni öğretmen ekleyebilelim.
	 * 
	 * 5. Adım : Ogrenciler adlı class oluşturalım.
	 * 			 Bu classta tüm öğrenciler tutualım.
	 * 			 İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList oluşturalım ve tüm öğretmenleri içine ekleyelim
	 * 		     Bu class'ın içine "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak yeni öğrenci ekleyebilelim.
	 * 	 
	 * 
	 * */
	
	public static void main(String[] args) {
		System.out.println("****OKUL SİSTEMİNE HOŞGELDİNİZ****");
		/* Eğer nesne üreterek başka bir class'tan  bilgi almak istiyorsak ya da methodlara, değişkenlere
		 * erişmek istiyorsak, verilerimizi private yapabilir, onlara public methodlardan erişebiliriz.
		 * buna Encapsolution deniliyor. (getter ve setter methodları)
		 * */
		System.out.println("\nOkul İsmi : " + SabitBilgiler.OKUL_ISIM);
		System.out.println("Müdür Bey : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Website : " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek :" + SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : " + SabitBilgiler.ADRES);
		System.out.println("\n      ÖĞRETMEN OLUŞTURALIM     ");
		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Süleyman Alptekin");
		ogretmenSuleymanBey.setBrans("JAVA");
		ogretmenSuleymanBey.setTelefon("0539999999");
		System.out.println("\nİsim : " + ogretmenSuleymanBey.getIsim());
		System.out.println("Branş : " + ogretmenSuleymanBey.getBrans());
		System.out.println("Tel : " + ogretmenSuleymanBey.getTelefon());
	//	System.out.println("Süleyman Alptekin " + ogretmenSuleymanBey.toString());
		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yılmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("0536666666");
		System.out.println("\nİsim : " + ogretmenHamza.getIsim());
		System.out.println("Branş : " + ogretmenHamza.getBrans());
		System.out.println("Tel : " + ogretmenHamza.getTelefon());
	//	System.out.println("Hamza " + ogretmenHamza.toString());
		System.out.println("\n      ÖĞRENCİ OLUŞTURALIM     \n");
		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setIsim("Adil Yesilmen");
		ogrenci1.setNo(1);
		System.out.println(ogrenci1.toString());
		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setIsim("Ahmet Yanık");
		ogrenci2.setNo(2);
		System.out.println(ogrenci2.toString());
		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.setIsim("Ersin Kara");
		ogrenci3.setNo(3);
		System.out.println(ogrenci3.toString());
		System.out.println("\n     OGRETMENLER CLASS     \n");
		Ogretmenler ogretmenler = new Ogretmenler();
		ogretmenler.ogretmenEkle(ogretmenSuleymanBey);
		ogretmenler.ogretmenEkle(ogretmenHamza);
		System.out.println("Öğretmen Sayısı : " +ogretmenler.ogretmenSayisi());
		System.out.println(ogretmenler.toString());
	}

}
