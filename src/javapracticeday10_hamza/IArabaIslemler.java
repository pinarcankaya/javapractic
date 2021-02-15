package javapracticeday10_hamza;

public interface IArabaIslemler {  ///I harfi Interface oldugunu kolay anlamak icin kulllanilir
	//interface class degildir interface'dir
		//abstract yapsaydik bir kere kullanirdik fazla kullanamazdik
	//nesne uretilemez body olmaz
	//methodlarin ismi ve parametre olur
	
	public void arabaKayit(Araba araba);  //araba claasindan olusturulan nesneleri ekleyecez
	public void arabaSatis(int id);
	public void arabaGuncelleme(int id,Araba araba);
	public void arabalariGoruntuleme();
	
	//interface yaparak methodlari istedigimiz yerde zorunlu olarak kullabiliryorz
	//yeni bir method eklenirse implement edilen her classta o method kullanilmak zorunlu
	//interface ile classi tek elden yonetebilirz 
	
}
