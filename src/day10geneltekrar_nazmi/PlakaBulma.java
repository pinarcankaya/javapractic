package day10geneltekrar_nazmi;

import java.util.Scanner;

public class PlakaBulma {

	public static void main(String[] args) {
		//klavyeden giriecek plaka numarsindan ili gpsteren uyg yaziniz
			/*"Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", 
        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", 
        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", 
        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", 
        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", 
        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", 
        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", 
        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", 
        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", 
        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", 
        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"  */
		
		String sehir[]= {"","Adana", "Adıyaman", "Afyon", "Ağrı", "Amasya", "Ankara", 
		        "Antalya", "Artvin", "Aydın", "Balıkesir", "Bilecik", "Bingöl", "Bitlis", 
		        "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", 
		        "Diyarbakır", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", 
		        "Gaziantep", "Giresun", "Gümüşhane", "Hakkari", "Hatay", "Isparta", 
		        "İçel (Mersin)", "İstanbul", "İzmir", "Kars", "Kastamonu", "Kayseri", 
		        "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", 
		        "K.maraş", "Mardin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Rize", 
		        "Sakarya", "Samsun", "Siirt", "Sinop", "Sivas", "Tekirdağ", "Tokat", "Trabzon", 
		        "Tunceli", "Şanlıurfa", "Uşak", "Van", "Yozgat", "Zonguldak", "Aksaray",
		        "Bayburt", "Karaman", "Kırıkkale", "Batman", "Şırnak", "Bartın", "Ardahan", 
		        "Iğdır", "Yalova", "Karabük", "Kilis", "Osmaniye", "Düzce"};
		        		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen bir plaka no giriniz");
		int plaka=scan.nextInt();
		System.out.println("girilen plaka: " +sehir[plaka]);
		
		
		        	//int Plaka = Byte.valueOf(JOptionPane.showInputDialog("Lütfen bir plaka numarası giriniz."));
				//JOptionPane.showMessageDialog(null,Sehirler[Plaka]);
		//yukadaki yol ekrana mesaj olarak sonucun  gelmesini sagliyor
	
	}

}
