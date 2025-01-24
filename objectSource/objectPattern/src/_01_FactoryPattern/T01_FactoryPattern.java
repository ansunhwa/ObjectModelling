package _01_FactoryPattern;

public class T01_FactoryPattern {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("tv");
		System.out.println(p1);
		
		p1.setName("computer");
		System.out.println(p1);
		
		
	}

}
