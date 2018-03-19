class to
{
int x,y;
to(int x,int y)
{
this.x=x;
this.y=y;
}
void t1(int x,int y)
{
x=x+10;
y=y+10;
}
void t1()
{
x=x+10;
y=y+10;

}
public static void main(String args[])
{
to ob1=new to(10,20);
ob1.t1(4,6);
System.out.println(ob1.x+" "+ob1.y);
ob1.t1();
System.out.println(ob1.x+" "+ob1.y);
}
}
