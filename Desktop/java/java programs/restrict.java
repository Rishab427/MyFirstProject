import java.util.Scanner;
class restrict
{
public static void main(String[] args)
{Scanner sc= new Scanner(System.in);
int i;
while(true)
{
System.out.println("Enter the +ve number = ");
i=sc.nextInt();
if(i>0)
break;
else
System.out.println("you have enter the negative one \n");
}

}}