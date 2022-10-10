package abstractionprogram;
interface I1{
void m1();
void m2();
void m3();
}
class Test1 implements I1
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
public class InterfaceProgram {
public static void main(String[] args) {
	Test1 t=new Test1();
	t.m1();
	t.m2();
	t.m3();
}
}
}
