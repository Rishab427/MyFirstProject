class exceptfinal
{
public static void main(String s[])
{
try
{
int a=Integer.parseInt(s[0]);
int b=Integer.parseInt(s[1]);
try{
int c=a/b;
System.out.println("result is"+c);
}
catch(ArithmeticException e)  // if appropriate exception handler is not there it will search handler in the outer try
{
System.out.println("ArithmeticException");
}
finally
{

System.out.println("All exceptions are handled in finally of nested try block ");
}

}
catch(ArithmeticException|ArrayIndexOutOfBoundsException e)
{
System.out.println("Multi catch ArithmeticException");
}
/*catch(e)
{
System.out.println("ArrayIndexOutOfboundException ");
}*/
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
