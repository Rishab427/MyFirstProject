interface a
{
void meth();
void meth1();
}
interface b
{
void meth3();
}
class demo
{
public void meth()
{
System.out.println("This is Demo meth");
}
}
class inter1 extends demo implements a,b
{
/*public void meth()
{
System.out.println("Hello meth");
}*/
public void meth1()
{
System.out.println("Hello meth1");
}
public void meth3()
{
System.out.println("Hello meth3");
}
public static void main(String args[])
{
a i=new inter1();
i.meth();
}
}