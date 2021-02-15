package kullaniciolusturma_nazmi;

public interface IKullanici { //i'nin anlami interface oldugunu belirtmek icin
	//method bodysi olmaz
	//burda olusturulan herseyi alt siniflar kullnamak zounda
	//interface anayasa gibi dusunulebilir
	
	void kullaniciKaydet(Kullanici kullanici);
	void kullaniciSil(int id);
	void kullaniciGuncelleme(int id,Kullanici kullanici);
	void kullaniciGoruntuleme();
}
