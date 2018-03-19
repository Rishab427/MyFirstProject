class Nongen
{
Object ob;
Nongen(Object b)
{
ob =b;
}
Object getob()
{
return ob;
}
void showType()
{
System.out.println("Type of ob is "+ob.getClass());
}
}

class NongenDemo
{
public static void main(String [] ar)

{
Nongen iob;
iob = new Nongen(88);
iob.showType();

int v = (Integer)iob.getob();
System.out.println("Value : "+v );
System.out.println();

Nongen strob = new Nongen("Non-Generics Test");
strob.showType();
String str= (String)strob.getob();
System.out.println("Value : "+str);
iob = strob;
//v = (Integer)iob.getob(); giving RUN_TIME Error
}
} 