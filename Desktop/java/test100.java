interface a 
{
void meth();
}
class test100 implements a
{
public void meth()
{
System.out.println("Hello meth");
}
public static void main(String args[])
{
a ob=new test100();
ob.meth();
}
}