import java.util.*;
class wrapperclass1
{
public static void main(String args[])
{
Integer i1=new Integer(20);
Integer i2=new Integer("40");
Integer i3=Integer.valueOf("55");

System.out.println(i1);
System.out.println(i2);
System.out.println(i3);
Double d1=new Double("23.33");
int i=d1.intValue();

System.out.println(d1);
System.out.println(i);


//autoboxing
Integer i4;
int ii=99;
i4=ii;

System.out.println(i4);

//auto unboxing

int a=i1;
System.out.println(a);
}
}