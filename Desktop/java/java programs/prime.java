import java.util.Scanner;
class prime
{
public static void main(String [] argd)
{Scanner s= new Scanner(System.in);
int i;
System.out.println("Enter the number = ");
i=s.nextInt();
if(i%2==0||i%3==0||i%5==0)
{
if(i==2||i==3||i==5)
{
System.out.println("Number is prime");
}
else
System.out.println("Number is not prime");
}
else
System.out.println("Number is prime");
}}