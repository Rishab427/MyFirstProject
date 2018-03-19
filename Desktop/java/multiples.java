interface a
{
void meth1();
void meth2();
}
interface b
{
void meth3();
}
class demo
{
public void meth1()
{
System.out.println("Defination of meth1");
}
}
//class multiples implements a,b extends demo-->error
class multiples extends demo implements a,b
{
public void meth1()
{
System.out.println("meth1");//overriding.
}
public void meth2()
{
System.out.println("meth2");
}
public void meth3()
{
System.out.println("meth3");
}
public static void main(String args[])
{
multiples m=new multiples();
m.meth1();
}
}
