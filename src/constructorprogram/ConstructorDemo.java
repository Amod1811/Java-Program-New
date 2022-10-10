package constructorprogram;

 class ConstructorDemo {
//	 String name;
//	 int emp_id;
//	 int i,j,k;
	 ConstructorDemo(){
		 System.out.println("Default constructor");
	 }
	 /*
	  * parameterized constructor with two parameter
	  * 
	  */
	 ConstructorDemo(String name, int emp_id){
//		 this.name = name;
//		 this.emp_id = emp_id;
		 System.out.println("constructor with two parameter");
	 }
	 /*
	  * constructor with three parameter with three three integer argument 
	  */
	 ConstructorDemo(int i,int j,int k){
//		 this.i=i;
//		 this.j=j;
//		 this.k=k;
		 System.out.println("constuctor with three para");
	 }
	 /*
	  * constructor with two parameter with two argument int i and String name 
	  */
	 ConstructorDemo(int i, String name){
//		 this.i=i;
//		 this.name=name;
		 System.out.println("constuctor with int and string");
	 }
		
	public static void main(String[] args) {
		// this invoke default constructor
		ConstructorDemo test = new ConstructorDemo();
		
		//this invoke with two int constuctor
		ConstructorDemo test1 = new ConstructorDemo("Amod",102);
		//System.out.println("Employee 1 :" + test1.name +" "+ test1.emp_id);
		
		//this invoke three integer para.
		ConstructorDemo test2 = new ConstructorDemo (104,102,103);
		//System.out.println("emp :" +test2.i+ " " + test2.j + " " + test2.k);
		// this invoke two para with int and string 
		ConstructorDemo test3 = new ConstructorDemo(101,"amod");
		//System.out.println("Emp2 :" +test3.i+ " " + test3.name);
		
}
	}

 
 