public class next
{
static void mymethod()
{  
System.out.println("inside my method");

}
void anotherMethod()
{  
System.out.println("inside another method");

}
public static void main(String [] rt)
{
mymethod();
B.m();
next a;
a =new next();
a.anotherMethod();
System.out.println("hello world");


}

}
class B
{
static void m()
{
System.out.println("static method of class b");


}
}