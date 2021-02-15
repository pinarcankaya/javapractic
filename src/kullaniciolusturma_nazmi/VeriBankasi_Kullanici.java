package kullaniciolusturma_nazmi;
import java.util.ArrayList;
public class VeriBankasi_Kullanici implements IKullanici{
	
	ArrayList <Kullanici> kullanicilar =new ArrayList<Kullanici>();

	@Override
	public void kullaniciKaydet(Kullanici kullanici) {
		
		kullanicilar.add(kullanici);

	}

	@Override
	public void kullaniciSil(int id) {
		kullanicilar.remove(id);
		
	}

	@Override
	public void kullaniciGuncelleme(int id, Kullanici kullanici) {
	
		kullanicilar.set(id, kullanici);
		
	}
	@Override
	public void kullaniciGoruntuleme() {
		if(kullanicilar.isEmpty()) {
			System.out.println("liste bos");
		}
			
		
		for (Kullanici kul : kullanicilar) {
			System.out.println("Kullanici Adi: " +kul.getKullaniciAdi() +"\nParola: " +kul.getParola()+ "\nİsim:" +kul.getIsim()
			+ "Soyisim: " +kul.getSoyisim() + "\nMail Adresi: " + kul.getMail());
			
		}
		
		
	
	}

}
