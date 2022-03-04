
abstract class Parent
{
	abstract public void message();
}
class SubClass1 extends Parent
{
	public void message()
	{
		System.out.println("This is First subclass");
	}
}
class SubClass2 extends Parent
{
	public void message()
	{
		System.out.println("This is Second subclass");
	}
}
public class Abstract {
	public static void main(String args[])
	{
		SubClass1 s1=new SubClass1();
		s1.message();
		SubClass2 s2=new SubClass2();
		s2.message();
	}
}