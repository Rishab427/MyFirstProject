import java.util.*;
class JaggedArray
{
public static void main(String [] args)
{int n;
int z;
int marks;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of subjects = ");
z=sc.nextInt();
int [][] x =new int[z][];
for(int i=0;i<z;i++)
{
System.out.println("Enter the number of ca in Subject ["+(i+1)+"] = " );
n=sc.nextInt();
x[i]=new int[n];
}

System.out.println("Enter the marks in : \n\n" );
for(int i=0;i<z;i++)
{
for(int c=0;c<x[i].length;c++)
{

System.out.println("Subject ["+(i+1)+"] CA ["+(c+1)+"]= " );
x[i][c]=sc.nextInt();
}
}


}}