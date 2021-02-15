package javapractice_hastaneprojesi_ibrahim;

public class HastaneRunner {

	 static Hastane hastane=new Hastane();//private ile sadece bu classtan ulassin diyebilirz.
	//disardan erisim saglamak icin main disina olusturuyoruz
	
	
	public static void main(String[] args) {
		
		String HastaDurumu="Kalp hastaliklari";
		String unvan=doktorUnvani(HastaDurumu);
		hastane.setDoktor(doktoruBul(unvan));
		System.out.println("doktor ismi: " + hastane.getDoktor().getIsim());
		System.out.println("doktor soyismi: " + hastane.getDoktor().getSoyIsim());
		System.out.println("doktor unvani: " + hastane.getDoktor().getUnvan());
	}
	
	
	public static String doktorUnvani(String aktuelDurum) {
	      
	        
	        if(aktuelDurum.equals("Allerji")) {
	            return hastane.unvanlar[0];
	        }else if(aktuelDurum.equals("Bas agrisi")) {
	            return hastane.unvanlar[1];
	        }else if(aktuelDurum.equals("Diabet")) {
	            return hastane.unvanlar[2];
	        }else if(aktuelDurum.equals("Soguk alginligi")) {
	            return hastane.unvanlar[3];
	        }else if(aktuelDurum.equals("Migren")) {
	            return hastane.unvanlar[4];
	        }else if (aktuelDurum.equals("Kalp hastaliklari")) {
	            return hastane.unvanlar[5];
	        }
	        
	        
	        return "yanlis durum";
	        
	    }
	public static Doktor doktoruBul(String unvan) {
		
		Doktor doktor=new Doktor();
		
		for(int i=0; i<hastane.unvanlar.length; i++) {
			
			if(unvan.equals(hastane.unvanlar[i])) {
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(hastane.unvanlar[i]);
			}
			
		}
		return doktor;
	}
		
		
	}
	