
package com.ios;


class A
{
	void run()
	{
		System.out.println("run");
	}

//	public void go() {
//		// TODO Auto-generated method stub
//		
//	}
}
class B extends A
{
	void run()
	{
		System.out.println("run2");
	}
	
	void go()
	{
		System.out.println("go");
	}
	
}
class demo
{
	public static void main(String args[])
	{
		A obj=new B();
		obj.run();
		
	}
}