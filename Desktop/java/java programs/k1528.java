import java.util.Scanner;
class k1528
{

k1528()
{
System.out.println("program on data types");
}

void k1528()
{
System.out.println("In methods ");
}
public static void main(String [] args)
{k1528 k=new k1528();
Scanner s = new Scanner(System.in);//linking the standard inputs
String name,address, phone_no;
float cgpa =0.0f;
System.out.println("Enter the name ");
name=s.nextLine();
System.out.println("Enter the address ");
address=s.nextLine();
System.out.println("Enter the phone number ");
phone_no=s.nextLine();
System.out.println("Enter the cgpa ");
cgpa=s.nextFloat();
}
}