import java.util.*;
class array1
{
public static void main(String[] args)
{int i,z;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the size ");
z=sc.nextInt();
int [] n= new int[z];
System.out.println("Enter the Values = ");
for (i=0;i<z;i++)
n[i]=sc.nextInt();
System.out.println("Values are = ");
for(int j:n)
System.out.println(j);
}}