package day07javapractice_nazmi;

public class IkiSayininEsitligi {

	public static void main(String[] args) {
		//iki sayının eşitlik durumunu kontrol eden methodu yazınız.

        System.out.println(esitMi(5,5));
    }
    public static boolean esitMi (int num1, int num2){
        if(num1==num2){
            return true;
        }
        return false;
    }
	

}
