package day8methodvearray;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {
		/*//Array içerisindeki tek sayıları 1 artırıp çift sayıları 1 azaltan 
		java methodu yazalım*/
		int[] arr= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(donusum(arr)));
	}
	
	public static int[] donusum(int []arr) {
		
		for (int i = 0; i < arr.length; i++) {
		if (arr[i]%2!=0) {
			arr[i]=arr[i]+1;
		}else {
			arr[i]=arr[i]-1;
		}
		}
		return arr;
	}	
}
