package javapratciceday09_hamza;

public class QuestionArray {//mulakat sorusu


    public static void main(String[] args) {
        int aranan = 7;
        int[] arr = {1,2,3,7,57};
        System.out.println(arraydaVarmi(aranan,arr));
    }
    public static boolean arraydaVarmi(int aranan, int[] arr) {
        for (int w : arr) {
            String sayi = String.valueOf(w);
            String arananSayi = String.valueOf(aranan);
            if (sayi.contains(arananSayi)) {
                return true;
            }
        }
        return false;
    }
/*private static boolean getVarMi(int[] sayilar) {
		for(int i = 0 ; i < sayilar.length ; i++) {
			if(String.valueOf(sayilar[i]).contains("7"))
				return true;
		}
		return false;
	} */ //hocanin cozumu

}
