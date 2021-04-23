import java.util.Scanner;

public class MenggambarDenganJava {

	public MenggambarDenganJava () {
		System.out.println("Menggambar Dengan Java");
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	
	public void GambarKotak(int nilai) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan ukuran kotak : ");
		int size = nilai;
		
		for (int x=0; x < size ; x++) {
			for (int y=0; y < size ; y++) {
			
			if(x<y) {
				
			System.out.print("*");
			}else {
			System.out.print("*");
		}
			}
			System.out.println();
		}	
	}
	
	
	//-----------------------------------------------------------------------------------------
	
	
	public void GambarSegitiga(int nilai) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga : ");
		int size = nilai;
		
		for (int x=0; x < size ; x++) {
			for (int y=0; y <= size ; y++) {
			
			if(x<y) {
				
			System.out.print("");
			}else {
			System.out.print("*");
		}
			}
			System.out.println();
		}	
	}
	
	
	//--------------------------------------------------------------------------------------------
	
	
		static void GambarSegitigaTerbalik(int nilai) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukan tinggi segitiga : ");
		int size = nilai;
		
		for (int x=0; x < size ; x++) {
			for (int y=0; y <= size ; y++) {
			
			if(x<y) {
				
			System.out.print("*");
			}else {
			System.out.print("");
		}
			}
			System.out.println();
		}	
		
	}
	
	
	//---------------------------------------------------------------------------------------------
	
	
		static void GambarSelangSeling(int baris) {
		
			for (int i= baris; i>0; i--) {
				for(int j=0; j<i; j++) {
					if((i%2==0 && j%2==1) || (i%2==1 && j%2==0)) {
						System.out.print("!");
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
			}
	}
	
	
	//---------------------------------------------------------------------------------------------
	
	
	static void GambarCampur(int baris, int kolom) {
		
		System.out.println("Masukan ukuran kotak : ");
		
		
		for (int x=0; x < baris ; x++) {
			for (int y=0; y < kolom ; y++) {
			
			if(x<=y) {
				
			System.out.print("#");
			}else {
			System.out.print("*");
		}
			}
			System.out.println();
		}	
		
	}
	
	
	//------------------------------------------------------------------------------------------
	
	
	static void GabungGambar(int baris, int kolom) {
		GambarCampur(baris, kolom);
		GambarSelangSeling(baris);
		
		
	}
	
	
	//------------------------------------------------------------------------------------------
	
	
	public static void main (String[]args) {
		MenggambarDenganJava coba = new MenggambarDenganJava();
		
//		coba.GambarKotak(5);
//		System.out.println();
		
//		coba.GambarSegitiga(5);
//		System.out.println();
//		
//		GambarSegitigaTerbalik(5);
//		System.out.println();
//		
//		GambarSelangSeling(5);
//		System.out.println();
//		
//		GambarCampur(5,5);
//		System.out.println();	
//		
		GabungGambar(5,5);
		System.out.println();
	}
}
