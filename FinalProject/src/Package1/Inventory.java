package Package1;

public class Inventory {
	private String name;
	private Product[] products;
	private int index;
	
	public Inventory(){
		this.name = "Store Inventory\n";
		this.products = new Product[10];
		this.index = 0;
	}
	
	public Inventory(int size) {
		this.name = "Store Inventory";
		this.products = new Product[size];
		this.index = 0;
	}
	//Searches through the array by product name
	public String searchByProductName(String object) {
		String productsName = " ";
		
		for(int i = 0; i < products.length; i++) {
			if(products[i] != null) {
				productsName = products[i].getProductName();
			}
			
			if(productsName.equalsIgnoreCase(object)) {
				productsName = products[i].toString();
				break;
			}
			else if(!(productsName.equalsIgnoreCase(object))) {
				productsName = "No such item";
			}
			
		}
		return productsName;
	}
	
	/*public boolean searchByProductName(String object) {
		boolean found = false;
		String productsName = " ";
		
		for(int i = 0; i < products.length; i++) {
			if(products[i] != null) {
			productsName = products[i].getProductName();
			}
	
			if(productsName.equalsIgnoreCase(object)) {
				found = true;
				break;
			}
		}
		return found;
	}
	
	public String foundProduct(Boolean found, String productsName) {
		String item = " ";
		String sameItem = " ";
		if(found == true) {
			for(int i = 0; i < products.length; i++) {
				if(products[i] != null) {
					sameItem = products[i].getProductName();
				}
				
				if(sameItem.equalsIgnoreCase(productsName)) {
					item = products[i].toString();
					break;
				}
			}
		}
		else if(found == false) {
			item = "No such item";
		}
		return item;
	}*/
	//adds a new product to the array
	public void addProduct(Product product) {
		if(index == products.length)
			ensureCapacity();
		
		this.products[index] = product;
		index++;
	}
	//doubles the size of the array if it's full
	private void ensureCapacity() {
		int newSize = products.length * 2;
		Product[] newArray = new Product[newSize];
		
		for(int i = 0; i < products.length; i++) {
			newArray[i] = products[i];
		}
		products = newArray;
	}
	//displays the products in the array
	public String toString() {
		String storeInventory = this.name;
		for(int i = 0; i < index; i++) {
			storeInventory += products[i].toString() + "\n";
		}
		return storeInventory;
	}
}
