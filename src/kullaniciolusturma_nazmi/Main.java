package kullaniciolusturma_nazmi;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		VeriBankasi_Kullanici vbKullanici= new VeriBankasi_Kullanici();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("islem seciniz!  \n 1-) Kullanici Ekle\n2-)Kullanici Sil\n3-)Kullanici Guncelle \n4-)Tum Kullanicilar\n5-)Cikis");
			int islem =input.nextInt();
			input.nextLine();
			
			if(islem==1) {
				System.out.println("Kullanici Adi giriniz: ");
				String kulAdi=input.next();
				System.out.println("Kullanici Parola giriniz: ");
				String parola = input.next();
				input.nextLine();
				System.out.println("Kullanici İsim giriniz: ");
				String isim = input.nextLine();
				System.out.println("Kullanici Soyadı giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Email giriniz: ");
				String mail = input.next();
				
				Kullanici kullanici = new Kullanici(kulAdi,parola,isim,soyisim,mail);
				
				vbKullanici.kullaniciKaydet(kullanici);
			}
			
			else if (islem==2) {
				System.out.println("Silmek istediginiz kullanici index ini giriniz: ");
				int id = input.nextInt();
				vbKullanici.kullaniciSil(id);
			}
			else if (islem==3) {
				System.out.println("Kullanici Adi giriniz: ");
				String kulAdi=input.next();
				System.out.println("Kullanici Parola giriniz: ");
				String parola = input.next();
				System.out.println("Kullanici İsim giriniz: ");
				String isim = input.nextLine();
				System.out.println("Kullanici Soyadı giriniz: ");
				String soyisim = input.nextLine();
				System.out.println("Kullanici Email giriniz: ");
				String mail = input.next();
				
				System.out.println("Guncellemek istediginiz Kullanici index ini giriniz: ");
				
				int id = input.nextInt();
				
				Kullanici kullanici = new Kullanici(kulAdi,parola,isim,soyisim,mail);
				
				vbKullanici.kullaniciGuncelleme(id, kullanici);
				
			}
			else if (islem==4) {
				vbKullanici.kullaniciGoruntuleme();
				
			}
			else if (islem==5) {
				System.out.println("Program Sonlandırıldı.");
				break;
			}
		}

	}

		
	}


