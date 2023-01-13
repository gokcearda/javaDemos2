package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this._id=id;
		this.renk=renk;
		this.name=name;
		this.price=price;
		this.stockAmount=stockAmount;
		this.description=description;
	}
	public Product() {
		//bu şekilde ikinciye aynı isimde metot oluşturmaya aşırı yükleme(overloading) denir.
	}
	// attribute ya da field olarak adlandırılan kısım
	int _id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		_id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	String getDescription() {
		return description;
	}

	void setDescription(String description) {
		this.description = description;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}

	int getStockAmount() {
		return stockAmount;
	}

	void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	String getRenk() {
		return renk;
	}

	void setRenk(String renk) {
		this.renk = renk;
	}

	String getKod() {
		return this.name.substring(0, 1)+_id;
	}

	void setKod(String kod) {
		this.kod = kod;
	}

}
