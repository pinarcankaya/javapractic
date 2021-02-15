package javapractice_harun;

public class day01Ornek {

	public static void main(String[] args) {

		System.out.println("Hello Word");
		
		//ornek1-- pascal ucgenini ekrana yazdiran bir prog yazdirin
		System.out.println("           1");
		System.out.println("        1      1");
		System.out.println("     1      2       1");
		System.out.println("   1     3       3      1");
		System.out.println(" 1   4      6       4      1");
	
	
		//ornek2--Aşağıdaki şekli ekrana yazdıran bir program yazınız
	   /*  A
	    B B
	   C   C
	  D     D
	 E       E
	F         F
	 E       E
	  D     D
	   C   C
	    B B
	*/    
	
		System.out.println("       A");
		System.out.println("      B  B ");
		System.out.println("    C     C");
		System.out.println("   D        D");
		System.out.println("  E          E");
		System.out.println("F              F");
		System.out.println(" E             E");
		System.out.println("  D          D");
		System.out.println("    C       C");
	    System.out.println("      B   B");
	    System.out.println("        A");
	
	    
	    //ornek3--"sagliginiz icin evde kalin" yazin
	    
	    System.out.println("Sagliginiz Icin \"Evde Kalin\" ."); //ters \ ekrana cift tirnak cikarmamizi saglar
	    
	    ///ornek4-->Would you like 'coffee' or 'tea' ? cümlesini ekrana yazdırınız
	      System.out.println("Would you like 'coffee' or 'tea'? ");  //ters \ ile yapilirsa da olur


	      //ornek5--> double 10.231 i int e cevirip ekrana yaz
	    
	      double sayi1 =10.231;
	      int sayi2=(int) sayi1;
	      System.out.println(sayi2);
	      
	      //ornek6-->
	      int a=11;
	      int b=5;
	      double pi = 3.14;
	      
	      System.out.println(a*b);
	      System.out.println(a*pi);
	      System.out.println(b/a);
	      System.out.println(a*b/pi);
	      System.out.println(a+b+pi);
	      System.out.println(a+b);
	      System.out.println(a-b);
	      System.out.println(-pi/a);
	      System.out.println((a+b)/pi);
	      System.out.println((b/pi)*a);
	      
	     
	        //ornek7--> hi 21  - hi Harun -  5TechProEd203 -  TechProEd305 - 7TechProEd305
	       //ekrana bu idafeleri yazdirniz
	      
	      System.out.println("hi " + 21);
	      System.out.println("hi "+ "Harun");
	      System.out.println(5 + "TechProEd" + 203);
	      System.out.println("TechProEd"+ 305);
	      System.out.println(2+0+5+ "TechProEd" +3+0+5); 	//boyle de yapilabilir yukardaki ile ayni ciktiyi verir
	      	      
	       	      
	     /* ornek8-->
	      * A--  -5+8*6
	        B--	(55+9)%9
	        C--	20+ -3*5 /8
	        D--	5+15-3*2-8%3  */
	      
	      
	      System.out.println("a="+ (-5+8*6)); ///basina siklar yazilabilir
	      System.out.println((55+9)%9);
	      System.out.println(20+-3*5/8);
	      System.out.println(5+15 / 3*2-8%3);
	     
	      //kisayollar
	      System.out.println(Math.pow(2, 3));	//uslu sayilar	(2.2,3.3) kuvveti vs de alinabilir
	      System.out.println(Math.sqrt(144));	//karekok alma
	      System.out.println(Math.round(2.7));	//sayiyi yuvarlama
	      
	      
	      //ornek9-->dikdortgenin alanini ve cevresini bulunuz
	      double en=5.6;
	      double boy=8.5;
	      System.out.println("alan= " + en*boy);
	      System.out.println("cevre= " + 2*(en+boy));
	     
	     // System.out.println("alan="+Math.round(en*boy)); // boyle yazilirsa da sonucu tamsayi aliriz
	    
	     
	     
	     
	      
	      
	      
	      
	      
	      
	}
}