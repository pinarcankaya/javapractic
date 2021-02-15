package day06javapractice_ibrahim;

public class AileStaticVariable {
	//static her zaman paylasilandir
	static int ailePizzasi=8;
	int bireysel=8;
	
	
	public static void main(String[] args) {

		AileStaticVariable cocuk=new AileStaticVariable();
		cocuk.ailePizzasi-=2;
		cocuk.bireysel-=2;
		System.out.println(cocuk.bireysel);
		System.out.println(cocuk.ailePizzasi);
		
		AileStaticVariable anne=new AileStaticVariable();
		anne.ailePizzasi-=2;
		anne.bireysel-=2;
		System.out.println(anne.ailePizzasi);
		System.out.println(anne.bireysel);
		
		AileStaticVariable baba=new AileStaticVariable();
		baba.ailePizzasi-=2;
		baba.bireysel-=2;
		System.out.println(baba.ailePizzasi);
		System.out.println(baba.bireysel);
		
		
	}

}
