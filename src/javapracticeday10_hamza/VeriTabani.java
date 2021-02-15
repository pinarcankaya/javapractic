package javapracticeday10_hamza;

import java.util.ArrayList;
import java.util.List;

public class VeriTabani implements IArabaIslemler {
	
	//veri tabani ustu kiemizi cizilzczk anlami overrride eklemek zorunlu oldugu icin yani methodlar eklenecek
	//abstrac claass ve interface en buyuk farki abstarc class kullanilirsa sadece bir tane miras alinabilri (bir tane extends) yapabilrz
	//interface kullniilirsa birden fazla interface miras alinabilir(implements)
	//eger abstrac kullanilirsa icindeki tum methodlari(abstarca + digerleri) override yapmak zorunda degiliz
	//eger interface kullanilirsa override yapmak zorundayiz
	
	List<Araba> arabalar=new ArrayList<>();
	
	@Override
	public void arabaKayit(Araba araba) {
		arabalar.add(araba);
		
	}

	@Override
	public void arabaSatis(int id) {
		for (int i = 0; i < arabalar.size(); i++) {
			Araba araba=arabalar.get(i);
			if(arabalar.get(i).getId()==id) {  //i==0 arabalar.get(0).getId()---getId araba classindan geliyo
				arabalar.remove(i);///for icinde her seferinde bir araba geliyor get id ye esit olunca sil dedik
				break;
			}
			
		}
		
	}

	@Override
	public void arabaGuncelleme(int id, Araba araba) {  //id 110000
		for (int i = 0; i < arabalar.size(); i++) {
			
			Araba suankiBakilanAraba=arabalar.get(i);
			
			if(suankiBakilanAraba.getId()==id) {
				arabalar.set(i, araba);  //guncelledik
				break;
			}
				
		}
		
	}

	@Override
	public void arabalariGoruntuleme() {
		
		for(Araba araba: arabalar) {
			System.out.println(araba.getId() + " -" + araba.getMarka() +"-" +araba.getMaxHiz()
			+"-"+ araba.getRenk()+"-"+ araba.getVites()+"-" + araba.getYil());
		}
	}

}
