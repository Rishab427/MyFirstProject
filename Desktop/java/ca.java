class billing
{
void computebill(int price)
{
int due;
due=price+(price*0.075);
System.out.println("Total due in Single Parameter is:="+due);
}
void computebill(int x,int y)
{
int a,b;
a=x*y;
b=a+(a*0.075);
System.out.println("Total due in Two parameter is:="+b);
}
void computebill(int p,int q,int c)
{
int r,s,t;
r=p*q;
s=c-r;
t=s+(s*0.075);
System.out.println("Total due in Three parameter is:="+t);
}
public static void main(String args[])
{
billing obj=new billing();
obj.computebill(20);
obj.computebill(20,5);
obj.computebill(20,5,50);
}
}