package methods2;

import java.sql.SQLOutput;

import javax.sql.rowset.serial.SQLOutputImpl;

public class Main {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		//mesaj.substring(0,2);
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5,7);
		System.out.println(sayi);
		
		System.out.println("--------------- 2. videonun konusuna geçiliyor...------------------");
		//bu çizginin altındaki kısım, 2. videonun konusudur.
		
		int toplam = topla2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
	
	
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public static String sehirVer() {
		
		return "Ankara";
	}
	
	// bu kısımdan sonraki metotlar 2. videonun konusu.
	
public static int topla2(int... sayilar) {
		
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
			
		}
		return toplam;
	}
	

}
