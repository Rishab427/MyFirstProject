import java.util.Scanner;
class ForTable
{
public static void main(String [] ard)
{int j;
for (int i=1;i<=6;i++)
{
for (j=5;j>=i;j--)
{
System.out.print(" ");
}
for (int z=1;z<=2*j-1;z++)
{
System.out.print("*");
}
System.out.print("\n");
}

}}