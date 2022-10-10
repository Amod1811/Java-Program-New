package lambda_expression;

@FunctionalInterface
interface Cab{
	  public void bookCab();
}
/*class Ola implements Cab{
	 public void bookCab() {
 }
	 System.out.println("Ola cab is booked....");
	 }
In the abstraction use this normal class but function interface using lambda expression 
does not use the this type of class or method body
	 
 } */

public class DemoLambda {
	
	public static void main(String[] args) {
		
		Cab cab =()->System.out.println("Ola cab is booked....");
		cab.bookCab();
	}
}
	

	

