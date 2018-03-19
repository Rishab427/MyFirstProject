class X
{
int a=10;
void k()
{
for(int i=0;i<3;i++)
{
class Local     //Local class
{
void l1()
{
System.out.println("Method of Local Class");
}
}

Local l1 = new Local(); //since we can't access this local class outside the method so we do this
l1.l1();
}
}
}
class extra
{
public static void main(String[] ar)
{
X x1= new X();
x1.k();
}}