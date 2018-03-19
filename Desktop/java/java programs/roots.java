class roots
{
public static void main(String [] at)
{
double a=Double.parseDouble(at[0]);
double b=Double.parseDouble(at[1]);
double c=Double.parseDouble(at[2]);
double r= b*b-4*a*c;
double d=Math.sqrt(r);
double r1=(-b+d)/(2*a);
double r2=(-b-d)/(2*a);
System.out.println("Root1 = "+r1);
System.out.println("Root2 = "+r2);
if(r1==r2)
{
System.out.println("roots are same");
}
else
{if(r1!=r2)
System.out.println("roots are not same");
}

if(r1==NULL && r2==NULL)
{System.out.println("roots are imaginary");
}
}
}