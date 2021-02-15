package day05javapractice_nazmi;

public class OCAsorusu {

	public static void main(String[] args) {
		String str = "M ";//M 
        str = str.concat("E ");//M E 		///str+ yaparsak MME olur
        String add = "S ";//S 
        str = str.concat(add);//M E S 
        str.replace("S","T");		///bu bolum calsimaz cunku replace yi bi yere atamamis
        str = str.concat(add);//M E S S
        System.out.println(str);

	//cikti ne olur?
        
        //
        String names="Aydin Erkan Bayram Ersin";
        names+=names.replace("Erkan", " "); 		//+ koyunca concat yapar
        System.out.println(names);
        
        
        String name="Pinar";
        name+="Ozkan";
        System.out.println(name);
        
        int num2=32;
        num2=12; //yeni deger atamasi
        
	}

}
