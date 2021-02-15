package day07javapractice_ibrahim;

public class HastaRunner {
//Setter ile neyi koyarsaniz, getter ile onu elde edersiniz, 
	//önce set et sonra get ile cagir.
	public static void main(String[] args) {
		
			Hasta hasta1=new Hasta();
			
			Case durum=new Case();
			
			durum.setActualCase("Romatizma"); 
			durum.setEmergency("Normal");
	
			hasta1.setIsim("nevzat");
			hasta1.setSoyisim("toprak");
			hasta1.setDurum(durum);
			
			System.out.println("hastanin ismi: " + hasta1.getIsim());
			System.out.println("hastanin soyismi: " + hasta1.getSoyisim());
			System.out.println("hastanin aktuel durumu: " + hasta1.getDurum().getActualCase());
			System.out.println("hastanin aciliyet durumu: " + hasta1.getDurum().getEmergency());
	}

}
