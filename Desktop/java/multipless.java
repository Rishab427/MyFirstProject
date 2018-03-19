interface a
{
void meth1();
static void meth2()
{
System.out.println("Interface A");
}
default void meth3()
{
System.out.println("Interface A default method");
}
}
class multipless implements a
{
public void meth1()
{
System.out.println("Defination of meth1 is given");
}
public static void main(String args[])
{
multipless m=new multipless();
m.meth1();
a.meth2();
m.meth3();
}
}