package lambda_expression;

interface Ola{
	public String bookCab(String source, String destination);
}
/*class Bus implements Ola{
	public String bookCab(String source, String destination) {
		System.out.println("Ola is booked from " + source + "To"+ destination );
		return("Price = 5000");
		In the abstraction use this normal class but function interface using lambda expression 
does not use the this type of class or method body
	}
}*/
public class ReturnValue {

	public static void main(String[] args) {
		Ola ola =(source, destination)-> {
			System.out.println("Ola is booked from " + source + "To"+ destination );
			return("Price = 5000");
		};
		System.out.println(ola.bookCab("Hyd", "mumbai"));
		
	}

}
