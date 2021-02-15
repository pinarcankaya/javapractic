package javapratciceday09_hamza;

public class AsalSayiSorusu { ///mulakat sorusu
	 public static void main(String[] args) {
	        
		 int num=19;
	        System.out.println("bu sayia sal mi :" + getAsalmi(num));
	    }
	    private static boolean getAsalmi(int n) { //bu soru cozumu bir kaliptir kesin bil
	        
	        for (int i = 2; i <= n/2; i++) {  //burdaki n/2 nin anlami yarisina kadar bakarsa sonuc dogru olur hafizayi yormasin diye
	            if(n%i==0) {
	                return false;
	            }
	        }
	        return true;    

	    }

}
