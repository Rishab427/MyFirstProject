abstract class figure
{
int d1,d2;
figure()
{
d1=10;
d2=20;
}
void greet()
{
System.out.println("HELLO");
}
abstract void area();//abstract_method
}
class rect extends figure
{
public void area()
{
System.out.println(d1*d2);
}
}
class test
{
public static void main(String args[])
{
rect r=new rect();
r.area();
}
}






