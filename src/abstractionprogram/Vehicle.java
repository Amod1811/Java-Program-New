package abstractionprogram;

abstract public class Vehicle {
	
	abstract void start();
		
	}

	class Car extends Vehicle{
		void start() {
			System.out.println("Start car with key");
		}
	}

	class Scooter extends Vehicle{
		void start() {
			System.out.println("Start Scooter with kick");
		}

	public static void main(String[] args) {
		//Vehicle vehicle = new Vehicle();
		Car car = new Car();
		car.start();
		
		Scooter scooter = new Scooter();
		scooter.start();
	
	}
}
