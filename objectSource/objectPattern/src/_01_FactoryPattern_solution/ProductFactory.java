package _01_FactoryPattern_solution;

public class ProductFactory {
	
	public static Product getInstance(String name) {
		Product product = new Product();
		
		if(name.equalsIgnoreCase("tv")) {
			product.setName("tv");
			product.setPrice(300);
		} else if(name.equalsIgnoreCase("computer")) {
			product.setName("computer");
			product.setPrice(200);
		}
		return product;
	}

	
	
}
