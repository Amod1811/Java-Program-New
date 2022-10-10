package constructorprogram;

	public class DemoConstructor {
		int rollno;
		String name;
		float fee;
		DemoConstructor(int rollno,String name ){
			this.rollno=rollno;
			this.name=name;
		}
		DemoConstructor(int rno, String name,float fee){
			this.rollno=rno;
			this.name=name;
			this.fee=fee;
			}
		
		
		void display() {
			System.out.println(rollno);
			System.out.println(name);
			System.out.println(fee);
		}
		public static void main(String[] args) {
			DemoConstructor test1 = new DemoConstructor(111,"amod");
			DemoConstructor test2 = new DemoConstructor(112,"ashish",677.77f);
	     	test1.display();
			test2.display();
			
		}
	}