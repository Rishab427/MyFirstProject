class a
{
int x,y;
int get(int p,int q)
{
x=p;
y=q;
}
void show()
{
System.out.println("value of x: "+x);
System.out.println("value of y: "+y);
}
}
class b extends a
{
void display()
{
System.out.println("B");
}
public static void main(String[] args)
{
b t =new b();
t.get(5,6);
t.show();
}
}

