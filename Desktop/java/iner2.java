class out
{
int x=10;
static int y=20;
void methout()
{
	in ob=new in();
	ob.meth();
}
class in
{
	void meth()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
}
class iner2
{
	public static void main(String args[])
	{
		out o=new out();
		o.methout();
		out.in i=o.new in();
		i.meth();
	}
}