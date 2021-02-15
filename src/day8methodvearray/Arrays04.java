package day8methodvearray;

import java.util.Arrays;

public class Arrays04 {

	public static void main(String[] args) {

		//Arrays listesinin ortalamasini bulan java kodu yaziniz
		int numbers[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(numbers));
		
		int sum=0;
		for (int i = 0; i < numbers.length; i++) {
			
			sum=sum+numbers[i];
		}
		double ort=sum/numbers.length;
		System.out.println(ort);
	}

}
