package Package1;

import java.util.Random;

public class Product {
	private String productName;
	private int qty;
	private double unitCost;
	private long productId;
	
	public Product() {
		this.productName = "No name";
		this.qty = 0;
		this.unitCost = 0;
	}
	//Creating an object
	public Product(String productName, int qty, double unitCost, long productId) {
		this.productName = productName;
		this.qty = qty;
		this.unitCost = unitCost;
		Random rand = new Random();
		long num = (long)(rand.nextInt(900000000)+ 100000000);
		productId = num;
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(double unitCost) {
		this.unitCost = unitCost;
	}

	public long getProductId() {
		return productId;
	}
	//Displays product information
	public String toString() {
		return ("Product: " + productName + "\n" + "Quantity: " + qty + "\n" + "Unit Cost: $" + unitCost +
				 "\n" + "Product Id: "+ productId + "\n");
	}
	
}
