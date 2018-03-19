class t
{
int x,y;
t(int x,int y)
{
this.x=x;
this.y=y;
}
void t1(double a,int b)
{
System.out.println("Double int");
}
void t1(int a,double b)
{
System.out.println("int Double");
}
public static void main(String args[])
{
t ob1=new test(10,20);
ob1.t1(4,6);
}
}
