package javapractice_arabaproje_ibrahim;

public class Toyota extends Car {

	//parametreli cons olusturursan mutlaka paremetresiz de olustur garanti olsun
	public String make="Toyota";
	public String model="Corolla";
	public int year=2009;
	public Toyota() {
		
	}
	public Toyota(String model, int year) {
		this.model=model;
		this.year=year;
	}
	public static void main(String[] args) {

		Toyota araba=new Toyota();
		System.out.println("arabaMarkasi" +araba.make);
		System.out.println("arabaModeli" +  araba.model);
		System.out.println("arabaYili"+araba.year);
		
		Toyota araba2=new Toyota("avensis",2020);
		System.out.println("arabaMarkasi" +araba2.arabaMarkasi());
		System.out.println("arabanin modeli: "+araba2.arabaModeli());
        System.out.println("arabanin yili: "+araba2.arabaYili());
	}

	
	public String arabaMarkasi() {
		return make;
	}
	public String arabaModeli() {
		return model;
	}
	public int arabaYili() {
		return year;
	}
	
	
	
	
	
	
	
	/*Bir class olusturunuz adi Honda olsun
    icerisinde 3 instance variable olsun 
    protected String make = "Toyota";
    protected String model = "Corolla";
    protected int year = 2009;
    Sonra 3 tane String return tipinden method olusturunuz
    arabaMarkasi
    arabaModeli
    arabaYili
    Son olarak bir oject olusturup method lari main method da print ediniz*/

}
