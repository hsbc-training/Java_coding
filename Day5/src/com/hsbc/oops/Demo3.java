package com.hsbc.oops;
class Demo3 implements MyInterface
{

   public void method1()
   {
	System.out.println("implementation of method1");
   }
   public void method2()
   {
	System.out.println("implementation of method2");
   }
   public static void main(String arg[])
   {
	MyInterface obj = new Demo3();
	obj.method1();
   }
}