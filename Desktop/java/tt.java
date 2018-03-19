class tt
{
int x,y;
tt(int x,int y)
{
this.x=x;
this.y=y;
}
void t1(tt o)
{
o.x=o.x+10;
o.y=o.y+10;
}
public static void main(String args[])
{
tt ob1=new tt(10,20);
tt ob2=new tt(1,2);

ob1.t1(ob2);
System.out.println(ob1.x+" "+ob1.y);
System.out.println(ob2.x+" "+ob2.y);
}
}
