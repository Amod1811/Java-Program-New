package streamprogram;

import java.util.ArrayList;
import java.util.List;

/*
 * In collection store the object value using filter 
 */
class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}
public class UseFilterMethod4 {
	

	public static void main(String[] args) {
		
	List<Product> productList = new ArrayList<Product>();
	
	productList.add(new Product(1, "HP", 25000));
	productList.add(new Product(2, "DEll", 30000));
	productList.add(new Product(3, "Lenova", 40000));
	productList.add(new Product(4, "sony", 60000));
	productList.add(new Product(5, "Apple", 45000));
	
	// iterate the list
	productList.stream().filter(p-> p.price>25000).forEach(pr -> System.out.println(pr.price));
	
	
	}

}
