package day03javapractice_ibrahim;

public class PasswordOlusturma {

	public static void main(String[] args) {

		/*
        bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
        1_ uzunlugu => en az 10 karakter(chars) olmalidir
        2_en az 1 sembol bulundurmali
        3_en az 1 numara bulundurmali
        4_en az buyuk harf olmalidir5_en az bir kucuk harf olmalidir
        5_en az bir kucuk harf olmalidir
        */
        String sembol = "!@#$%%^&*()_+";
        String pasword = "Myasswo%rd1";
        String rakam = "0123456789";
        int numOfSembol = 0;
        int numOfRakam = 0;
        int numOfBuyukHarf =0;
        int numOfKucukHarf =0;
        
//      System.out.println(pasword.substring(2,6));
        
        
        
        if(pasword.length() >= 10) {
            
            
            for (int i = 0; i < pasword.length(); i++) {
                if(sembol.contains(pasword.substring(i,i+1))) {
                    numOfSembol++;
                }
                
                if(rakam.contains(pasword.substring(i,i+1))) {
                    numOfRakam++;
                }
                
                if(pasword.charAt(i) >= 'a' && pasword.charAt(i) <= 'z') {
                    numOfKucukHarf++;
                }
                
                if(pasword.charAt(i) >= 'A' && pasword.charAt(i) <= 'Z') {
                    numOfBuyukHarf++;
                }
            }
            
            if(numOfSembol > 0 ) {
                
                if(numOfRakam > 0) {
                    
                    if(numOfBuyukHarf > 0) {
                        if(numOfKucukHarf > 0){
                            System.out.println("Tebrikler Passwordunuz basarili bir sekilde olusturulmustur");
                        }else {
                            System.out.println("Kucuk harf kullanmaniz gerekmektedir");
                        }
                    }else {
                        System.out.println("Buyuk harf kullanmaniz gerekmektedir");
                    }
                }else {
                    System.out.println("Bir numara kullanmaniz gerekiyor!");
                }
            }else {
                System.out.println("Maalesef sembol kullanmadiginiz icin password olusturulamadi");
            }
            
            
            
            
            
            
        }else {
            System.out.println("pasword lengthiniz yetersizdir!");
            System.out.println("Lutfen daha guclu hale getiriniz!");
        }
		 
		
	
		
		
		
	}
	}


