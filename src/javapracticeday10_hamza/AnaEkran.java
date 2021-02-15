package javapracticeday10_hamza;

import java.util.Scanner;

public class AnaEkran {

	public static void main(String[] args) {
		/* Galeri Uygulaması
		 *
		 * arabaKayit();
		 * arabaSatis();
		 * arabaGuncelleme();
		 * arabalariGoruntuleme();
		 */
		VeriTabani veriTabani=new VeriTabani();
		Scanner input=new Scanner(System.in);
		
		while(true) { //sonsuz kere calisir true yazinca ---break koyarsak durur sadece
			System.out.println("Lütfen seçim yapınız : ");
			System.out.println("1-Araba Kayit");
			System.out.println("2-Araba Satis");
			System.out.println("3-Araba Guncelleme");
			System.out.println("4-Tum Arabalari Goruntuleme");
			System.out.println("5-Sistemden Cikis Yap");
			
			int secim=input.nextInt(); //kullanicidan secim yapmasini istedik
			if(secim==5) {
				System.out.println("sistemden basariyla ciktiniz");
				break;
			}else if(secim==1) {
				System.out.println("Aracin id'sini giriniz");
				int id=input.nextInt();
				
				System.out.println("maxHiz giriniz");
				int maxHiz=input.nextInt();
				
				System.out.println("yil giriniz");
				int yil=input.nextInt();
				
				System.out.println("markasini giriniz");
				String marka=input.next();   ///next line yaptiktan sonra next kullaninca  bundan sonrakiler gelmedi
											//dikkat arka arkaya kullanilacaksa next kullan 
				System.out.println("renk giriniz");
				String renk=input.next();
				
				System.out.println("vites turu giriniz");
				String vites=input.next();
				
				Araba araba=new Araba(id,maxHiz,yil,marka,renk, vites); //siralama araba clasindaki gibi olmali
				veriTabani.arabaKayit(araba);
				
			}else if(secim==2) { //kullanici 2'ye tiklarsa
				System.out.println("satilan aracin id'sini giriniz");
				int id=input.nextInt();
				veriTabani.arabaSatis(id);  //araba satisi yaptik
		
			
			}else if(secim==3){
				System.out.println("guncellemek istediginiz aracin id'sini giriniz");
				int id=input.nextInt();
				
				System.out.println("maxHiz giriniz");
				int maxHiz=input.nextInt();
				
				System.out.println("yil giriniz");
				int yil=input.nextInt();
				
				System.out.println("markasini giriniz");
				String marka=input.nextLine();
				
				System.out.println("renk giriniz");
				String renk=input.next();
				
				System.out.println("vites turu giriniz");
				String vites=input.next();
				
				Araba araba=new Araba(id,maxHiz,yil,marka,renk,vites);
				veriTabani.arabaGuncelleme(id, araba);
				
			}else if(secim==4) {
				veriTabani.arabalariGoruntuleme();
			}
		}
			
			
	}
	/*
	 * public class AnaEkran {
	/*
	 * Galeri Uygulamasi
	 *
	 * arabaKayit(); arabaSatis(); arabaGuncelleme(); arabalariGoruntuleme();
	 */
	/*static Scanner scan = new Scanner(System.in);
	static Araba araba; 
	static int id;
	public static void main(String[] args) {
		VeriTabani veriTabani = new VeriTabani();
		while (true) {
			System.out.println("1- Araba kayit");
			System.out.println("2- Araba satis");
			System.out.println("3- Araba guncelleme");
			System.out.println("4- Arabalari goruntule");
			System.out.println("5- Sistemden cikis");
			System.out.println("Lutfen seciminizi yapiniz.");
			int secim = scan.nextInt();
			if (secim == 5) {
				System.out.println("Sistemden basariyla ciktiniz.");
				break;
			} else if (secim == 1) {
				aracOlustur();
				veriTabani.arabaKayit(araba);
			} else if (secim == 2) {
				System.out.println("Lutfen satilan aracin id sini giriniz.");
				int id = scan.nextInt();
				veriTabani.arabaSatis(id);
			} else if (secim == 3) {
				System.out.println("Lutfen arac guncellemek icin: ");
				veriTabani.arabaGuncelleme(id, araba);
			}else if(secim==4) {
				veriTabani.arabalariGoruntuleme();
			}
		}
	}
	public static void aracOlustur() {
		System.out.println("Lutfen aracin id sini giriniz.");
		int id = scan.nextInt();
		System.out.println("Lutfen aracin max hizini sini giriniz.");
		int maxHiz = scan.nextInt();
		System.out.println("Lutfen aracin yilini giriniz.");
		int yil = scan.nextInt();
		System.out.println("Lutfen marka giriniz : ");
		String marka = scan.next();
		System.out.println("Lutfen vites giriniz : ");
		String vites = scan.next();
		System.out.println("Lutfen renk giriniz : ");
		String renk = scan.next();
		araba = new Araba(id, maxHiz, yil, marka, vites, renk);
	}
}
	 */
	
	
	
	

}
