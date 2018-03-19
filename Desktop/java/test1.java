class test1
{
int x,y;
public static void main(String args[])
{
test1 t1=new test1();
test1 t2=new test1();
t1.x=20;
t2.x=30;
System.out.println(t1.x+" "+t1.y);
System.out.println(t2.x+" "+t2.y);
t1=t2;
t2.x=90;
System.out.println(t1.x+" "+t1.y);
System.out.println(t2.x+" "+t2.y);
}
}