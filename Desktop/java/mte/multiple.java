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
int a;
}
class multiple extends demo implements a,b
{
public void meth1()
{
System.out.println("meth1");
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
multiple m=new multiple();
m.meth2();
}
}
