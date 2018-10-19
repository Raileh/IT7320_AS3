package pt3;

public class Product {

	int id;
	double price;
	int amount;
	double sale;
	
	public Product(int id, double price, int amount, double sale) {
		this.id = id;
		this.price = price;
		this.amount = amount;
		this.sale = sale;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getSale() {
		return sale;
	}

	public void setSale(double sale) {
		this.sale = sale;
	}
	
	public double getTotal() {
		return price * amount;
	}
	
	public double getDeal() {
		return price * sale;
	}
	
	public double getDealTotal() {
		return this.getTotal() * sale;
	}
}
