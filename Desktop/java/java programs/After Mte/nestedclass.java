class A
{
private int a=10;
static int b=20;
void m()
{
System.out.println("Non Static method of outer class");
}
static void m1()
{
System.out.println("Static method of outer class");
}
void test1()
{
B b1= new B();
b1.w();
}

private class B
{
void w()
{
System.out.println(A.b);
System.out.println(a);
A.m1();

}
}

static class C
{
A a1=new A();
void p()
{
System.out.println(A.b);
System.out.println(a1.a);
A.m1();
}
static void p1()
{
System.out.println("static method of static class");
}

}
}
class test
{
public static void main(String [] ar)
{
//A.C a1= new A.C();
//a1.p();
//A.C.p1();
//A a1= new A();
//A.B b1= a1.new B();
//b1.w();
A a1= new A();
a1.test1();
}}