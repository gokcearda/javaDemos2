package overriding;

public class OgrenciKrediManager extends BaseKrediManager{
	public double hesapla(double tutar) {
		return tutar*1.10;
		//burada yeniden belirtilen hesapla metodu base kredi managerdan miras 
		//almasına rağmen burada üzerine yazıldığından diğer metodu ezerek burada yazılan 
		//metodu öğrenci classında çalıştırır.
		//buna da overrideable denir.
	}

}
