class sup
{
void meth()
{
System.out.println("Super Class Meth");
}
}
class sub extends sup
{
void meth()
{
super.meth();
System.out.println("Sub Class Meth");
}
}
class super2
{
public static void main(String args[])
{
sub d=new sub();
d.meth();
}
}