package pt3;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class ProductTest {
	
	//	Product obj (int id, double price, int amount, double sale)
	Product product = new Product(1,20.00,2,0.5);
	
	/*
	 * InventoryTest
	 * ArrayList<Product> productList = new ArrayList<Product>();
	 * Inventory inventory = new Inventory(productList);
	 * inventory.addProduct(product1);
	*/
	
	@Test
	public void testGetTotal() {
		assertEquals(40.00,product.getTotal(),0.00);
	}
	
	@Test
	public void testGetAmount() {
		assertEquals(2,product.getAmount());
	}
	
	@Test
	public void testGetDeal() {
		assertEquals(10.00,product.getDeal(),0.00);
	}
	
	@Test
	public void testGetDealTotal() {
		assertEquals(20.00,product.getDealTotal(),0.00);
	}

}
