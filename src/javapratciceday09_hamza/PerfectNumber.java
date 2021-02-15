package javapratciceday09_hamza;

public class PerfectNumber {  //mulakat sorusu

	public static void main(String[] args) {
		/* Perfect Number (Mükemmel sayı)
		 * Bir sayının mükemmel olup olmadığını bulan method yazınız.
		 * getMukemmelMi(int sayi)
		 *  return true/false
		 *  
		 * Mükemmel sayı : bir sayının kendisi hariç bölenlerinin toplamı, kendisine eşitse
		 * 		o sayı mükemmeldir.
		 * 		örnek :  6 -> 1,2,3 	1+2+3 = 6 = 6 (Mükemmel)
		 * 
		 * süre 3 dk.
		 * 
		 * */
		
				int sayi=8128;
				System.out.println(getMukemmelMi(sayi));
	}

	private static boolean getMukemmelMi(int sayi) {
		int sum=0;
		for(int i=1; i<sayi; i++) { //i<=n/2 denilirse yarisini bulur hafiyazi yormaz yine aradigimiz sonucu verir
			if(sayi%i==0) {
				sum+=i;
			}
		}
		if(sayi==sum) { //sayimiz ve toplam esit ise true olur
			return  true;
		}else {
			return false;
		}
	}
		 
		
	}


