interface I
{
int k=1;  //public static and final

void p(); //public and abstract

default void def()  //by default it is public
{
System.out.println("hello ..");
}
static void f()
{
System.out.println("Static Method of I interface");
}

}
interface I1
{
int k=1;  //public static and final

void p(); //public and abstract
default void def()
{
System.out.println("hello1 ..");
}

}


class inter implements I,I1
{
public void p() //cant give the lesser accessibility
{
System.out.println("interface overidden method");
}

public void def()
{
I.super.def();
System.out.println("HI i am here");

}

}
class testInterface
{
public static void main(String[] ar)
{
inter a1= new inter();
a1.p();
//System.out.println(a1.I.k);  we can't do this here we have to create the reference of parent interface 
a1.def();
I.f();

}}
