package day8methodvearray;

public class Arrays05 {

	public static void main(String[] args) {

		//bir int array icerisinde tekrarlanan elemanlari bulalim
		int arr[]= {1,2,3,3,4,5,5,6};
		int flag=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j =i+1; j < arr.length; j++) {
				if(arr[i]==arr[j] && (i!=j))
			System.out.println("tekrarlanan elaman: " + arr[j]);
			}
		}
		
		if(flag==0) {
			System.out.println("tekrarlanan elaman yoktur");
		}
		
		
		
	}	
}
