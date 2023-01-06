package classes;

public class Main {

	public static void main(String[] args) {
		//Classlar referans tipleridir.
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		//aşağıdaki değişkenler değer(value) tiplilerdir.
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		//aşağıdaki diziler kodlaması  yapıldıktan sonra sorulan soru:"ekrana yazdırılan sayılar 2 dizisinin,
		//sıfırıncı elemanının değeri ne olur?
		//sorunun cevabı: diziler de classlar gibi referans tiplidirler.
		//hangi nesneye referans verildiyse bir daha hep ona gider.
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar2= sayilar1;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]);
	}

}
