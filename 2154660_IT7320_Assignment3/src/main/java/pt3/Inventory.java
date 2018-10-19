package pt3;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Product> productList = new ArrayList<Product>();
	int total = 0;
	int amount = 0;
	
	public Inventory (ArrayList<Product> productList) {
		this.productList = productList;
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}

	public void setProductList(ArrayList<Product> productList) {
		this.productList = productList;
	}

	public void addProduct(Product product) {
		this.productList.add(product);
	}
	
	public int getTotal() {
		int i;
		for (i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);
			total += product.getPrice();
		}
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getAmount() {
		int i;
		for (i = 0; i < productList.size(); i++) {
			Product product = productList.get(i);
			amount += product.getAmount();
		}
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
