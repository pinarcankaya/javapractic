package javapracticeinterview_hamza;

import java.lang.reflect.Array;

public class Question04 {

	public static void main(String[] args) {
		// Elimizdeki Array'in en büyük sayısını bulup, return yapan bir method yazınız.
		 
			int[] array = {12,56,788,4,1,0,999,4};
			int enBuyukSayi = getEnBuyukSayi(array);
			System.out.println("En büyük sayı :" + enBuyukSayi);
		}
		private static int getEnBuyukSayi(int[] array) {
			int max = 0;
			for(int i = 0 ; i < array.length ; i++) {  
				if(array[i] > max) {   //  12 > 0       56 > 12      788 > 56    4 > 788   1 > 788    0 > 788    999 > 788   4 > 999                   
					max = array[i];	   //  max = 12     max = 56    max  = 788   -------   -------    -------    max = 999   -------
				}
			}
			return max;
		}
	}
	
	
	//sort ile yapilisi
	/*public static void main(String[] args) {
		int [] array = {12, 56, 788,4, 1, 0,999,38884};
		int arr[]=getEnBuyukSayi(array);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] getEnBuyukSayi(int [] array) {
		Arrays.sort(array);
		int max[] = new int[1];
		max[0]=array[array.length-1];
		return max;
	}*/


