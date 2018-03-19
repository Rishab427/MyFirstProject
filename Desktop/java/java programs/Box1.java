class Box
{
double l;
double w;
double h;
void volume()
{
double d = l*w*h;
System.out.println("Volume is "+d);
}
Box()
{
l=4;
w=6;
h=10;
}
}
public class Box1
{
public static void main(String [] args)
{

Box b=new Box();

b.volume();

}
}