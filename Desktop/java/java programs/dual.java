import java.util.*;
class dual
{
static int [] convert(double [] ar)
{int v[]=new int[ar.length];
for (int c=0;c<ar.length;c++)
v[c]=(int)ar[c];
return(v);
}
public static void main(String [] args)
{
double [] d;
int z;
int a[];
Scanner sc = new Scanner(System.in);
d= new double[5];
System.out.println("Enter the Values = ");

for (int s=0;s<5;s++)
{
d[s]=sc.nextDouble();
}
a=convert(d);
System.out.println("After converting Values are = ");
for(int x=0;x<d.length;x++)
{
System.out.println(a[x]);
}
}
}