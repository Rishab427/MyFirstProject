import java.io.*;
class Throw
{
public static void main(String [] ar)
{
try
{
m();
}catch(Exception t)
{
System.out.println("hello");
}
}
static void m() throws IOException, InterruptedException
{
IOException ae = new IOException ();
throw ae;
}
}