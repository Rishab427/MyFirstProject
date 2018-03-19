import java.util.Scanner;
class A
{
A()
{
System.out.println("Constructor Calling");
} 
void A()
{
System.out.println("Method callimg");
}
public static void main(String [] arg)
{
A a= new A();
a.A();
Scanner s= new Scanner(System.in);
String classs;
System.out.println("Enter Your section = ");
classs=s.nextLine();
System.out.println("Your section is = "+classs);
}}
