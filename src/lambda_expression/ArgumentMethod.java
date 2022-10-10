package lambda_expression;

@FunctionalInterface
interface Car
{
	public void bookCab(String source, String destination);
}
/*class Ola implements Cab{
	public void bookCab(String source, String destination) {
		System.out.println("Ola cab is Booked" +" "+ source + " "+"To"+" "+ destination);
		
		In the abstraction use this normal class but function interface using lambda expression 
does not use the this type of class or method body
	}
}*/
public class ArgumentMethod {

	public static void main(String[] args) {
		Car cab =( source, destination)->System.out.println("Ola cab is Booked" + source + "To"+ destination);
		cab.bookCab("Hyd", "Mumbai");

	}

}
