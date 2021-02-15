package day8methodvearray;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {

		//bir string array olusturulalm ve array elemanlarinin her birine istedigimizi ekleyebilelim
		
		String arr[]={"clever","meek","hurried","nice"};	
		String ek="ly";
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(sonEk(arr,ek)));
	}
	public static String[] sonEk(String[]arr,String ek){
		for (int i = 0; i < arr.length; i++) {
			arr[i]+=ek;
			
		}
		
		return arr;
		
		
		
	}
	
		

}
