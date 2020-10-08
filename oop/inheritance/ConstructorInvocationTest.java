package oop.inheritance;

class A{
	A()
	{
		System.out.println("in constructor of class A");
	}
}
class B extends A{
	B()
	{
		System.out.println("in constructor of class B");
	}
}

class C extends B{
	C()
	{
		System.out.println("in constructor of class C");
	}
}

class D extends C{
	D()
	{
		System.out.println("in constructor of class D");
	}
}
public class ConstructorInvocationTest {

	public static void main(String[] args) {
		
		D object = new D();
		
		//Base b1 = new Base();
		//System.out.println(" Creating object on inherited class");
		//Derived d1 = new Derived();
	}

}
