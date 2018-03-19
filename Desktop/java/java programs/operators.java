import java.util.Scanner;
class operators
{
public static void main(String [] args)
{
Scanner ab= new Scanner(System.in);
int a,b;
String name;
System.out.println("Enter the name =");
name = ab.nextLine();
System.out.println("Enter A = ");
a=ab.nextInt();

System.out.println("Enter B = ");
b=ab.nextInt();

System.out.println("A+B = "+(a+b));
System.out.println("A-B = "+(a-b));
System.out.println("A*B = "+(a*b));
System.out.println("A%B = "+(a%b));
System.out.println("A/B = "+(a/b));
System.out.println("A++ = "+(++a));
System.out.println("B-- = "+(b--));
}}