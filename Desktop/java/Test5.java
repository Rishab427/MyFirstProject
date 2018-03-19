class Test5
{
int x,y,z;
Test5()
{
this(10);
System.out.println("no!!");
}
Test5(int x,int y)
{
this(x,y,30);
System.out.println("two parameter");
}
Test5(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
System.out.println("Three parameters!!");
}
public static void main(String arg[])
{
Test5 t1=new Test5();
Test5 t2=new Test5(22);
Test5 t3=new Test5(2,35);
Test5 t4=new Test5(2,35,77);
System.out.println(t1.x+" "+t1.y+" "+t1.z);
System.out.println(t2.x+" "+t2.y+" "+t2.z);
System.out.println(t3.x+" "+t3.y+" "+t3.z);
System.out.println(t4.x+" "+t4.y+" "+t4.z);
}
}