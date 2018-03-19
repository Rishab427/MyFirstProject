class sup
{
int x,y;
sup()
{
x=10;
y=20;
System.out.println("Super Constructor");
}
}
class sub extends sup
{
int z;
sub()
{
z=80;
System.out.println("Sub Constructor");
}
}
class constructor
{
public static void main(String args[])
{
sub d=new sub();
System.out.println(d.x+" "+d.y+" "+d.z);
}
}