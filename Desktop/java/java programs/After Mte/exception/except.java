class except
{
public static void main(String s[])
{
try
{
int a=Integer.parseInt(s[0]);
int b=Integer.parseInt(s[1]);
int c=a/b;
System.out.println("result is"+c);
}
catch(ArithmeticException e)
{
System.out.println("ArithmeticException");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("ArrayIndexOutOfboundException ");
}
catch(NumberFormatException e)
{
System.out.println("NumberFormat Exception");
}

m();
}
static void m()
{
System.out.println("method ");
}
}
