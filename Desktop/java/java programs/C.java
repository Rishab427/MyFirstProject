import java.util.Scanner;
public class C
{
public static void main(String [] ar)
{
Scanner sc= new Scanner(System.in);


System.out.println("Enter your CGPA = ");
double cg=sc.nextDouble();

System.out.println("Enter your Roll = ");
int roll=sc.nextInt();

System.out.println("Enter the name = ");
sc.nextLine();
String name =sc.nextLine();
System.out.println("My Name is "+name+".\nMy CGPA is "+cg+".\nMy Roll is "+roll);
}}