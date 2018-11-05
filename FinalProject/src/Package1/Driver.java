package Package1;

public class Driver {

	public static void main(String[] args) {
	
		Inventory inv = new Inventory();
		Product product1 = new Product("Paper", 10, 59.99, 000000000);
		Product product2 = new Product("Pickles", 5, 3.99, 000000000);
		Product product3 = new Product("Nvidia 1080 TI Graphics Card", 3, 899.99, 000000000);
		
		inv.addProduct(product1);
		inv.addProduct(product2);
		inv.addProduct(product3);
		
		
		System.out.print(inv.toString());
		String item = inv.searchByProductName("Pickles");
		System.out.println(item);
		//boolean found = inv.searchByProductName("Pickles");
		//String item = inv.foundProduct(found, "Pickles");
		//System.out.println(item);
		//System.out.println(found);
		
		//System.out.println(inv.products[2]);

	}

}

