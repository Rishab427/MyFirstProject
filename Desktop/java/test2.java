class test2
{
int x,y;
test2(int a,int b)
{
x=a;
y=b;
System.out.println("Initialized with parameter");
}
public static void main(String args[])
{
test2 t1=new test2(4,5);
test2 t2=new test2(2,3);
System.out.println(t1.x+" "+t1.y);
System.out.println(t2.x+" "+t2.y);
}
}