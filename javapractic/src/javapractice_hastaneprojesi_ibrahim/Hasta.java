package javapractice_hastaneprojesi_ibrahim;

public class Hasta {
	private String isim;
	private String soyIsim;
	private int hastaIDleri;
	private Durum hastaDurum;
	
	
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyIsim() {
		return soyIsim;
	}
	public void setSoyIsim(String soyIsim) {
		this.soyIsim = soyIsim;
	}
	public int getId() {
		return hastaIDleri;
	}
	public void setId(int hastaIDleri) {
		this.hastaIDleri = hastaIDleri;
	}
	public Durum getHastaDurum() {
		return hastaDurum;
	}
	public void setHastaDurum(Durum hastaDurum) {
		this.hastaDurum = hastaDurum;
	}
}
