class out
{
	static int o=20;
	int o1=30;
	static class in
	{
		static int x=10;
		void meth()
		{
			System.out.println(o);
			out ob1=new out();
			System.out.println(ob1.o1);
		}
	}
}
class iner
{
	public static void main(String args[])
	{
		out.in ob=new out.in();
		System.out.println(out.in.x);
		ob.meth();
	}
}