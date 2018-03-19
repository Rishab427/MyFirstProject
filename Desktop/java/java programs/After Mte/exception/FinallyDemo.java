class FinallyDemo
{
static void procA()
{
try
{
System.out.println("inside procA");
throw new RuntimeException("demo");
}
finally
{
System.out.println("procA's Finally");
}
}
static void procB()
{
try
{
System.out.println("inside procB");
return;
}
finally
{
System.out.println("procB's Finally");
}
}
static void procC()
{
try
{
System.out.println("inside procC");

}
finally
{
System.out.println("procC's Finally");
}
}

public static void main(String [] ra)
{
try
{
procA();
}
catch(Exception e)
{
System.out.println("Exception caught");
}
procB();
procC();
}
}