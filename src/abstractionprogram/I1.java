package abstractionprogram;
interface I2{
void m1();
void m2();
void m3();
}
class Test implements I2
{
public  void m1()
{
System.out.println("m1- method implimentation");
}
public void m2()
{
System.out.println("m2-method implementation;");
}
public void m3()
{
System.out.println("m3 –method implementation");
}

public class I1 {
		
		public static void main(String[] args)
		{
		Test t=new Test();
		t.m1();
		t.m2();
		t.m3();
		}
}
}
