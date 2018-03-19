import java.util.*;
class integerException
{
public static void main(String [] ar)
{int a,b;
Scanner sc = new Scanner(System.in);
boolean flag=true;
boolean flag1 =true;
do
{
try
{System.out.println("Enter a = ");
a= sc.nextInt();

System.out.println("Enter b = ");
b= sc.nextInt();
flag =false;
System.out.println("Sum is "+(a+b));
}
catch(InputMismatchException e)
{
System.out.println("Only Intemger are allowed");
sc.nextLine();
}
}while(flag);	
}
}