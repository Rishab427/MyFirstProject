class A
{
void call1()
{
System.out.println("Inside A instance method");
}
static void call2()
{
System.out.println("Inside A static method");
}
}

class B extends A
{
void call1()
{
System.out.println("Inside B's instance method");
}
static void call2()
{
System.out.println("Inside B's static method");
}
}
 
class staticVsNonStatic
{
public static void main(String [] mn)
{
/*A.call2();
A a1 = new A();
a1.call1();
a1.call2();*/

A b1= new B();
b1.call1();
b1.call2();//this reference var the type is A so it is calling class A
}}