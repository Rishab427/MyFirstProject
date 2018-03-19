class exceptfinal
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
finally
{                                                                                      //in case catch block not present for a particular exception then it will go to finally
                                                                                                                                      //  and then it will goto default handler
System.out.println("final line which will always execute");
}

m();
}
static void m()
{
System.out.println("method to be executed even if exception occurs ");
}
}
