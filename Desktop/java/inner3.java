package rishab;
class out
{
	void meth()
	{
		class in
		{
			int x=20;
		}
		in ob=new in();
		System.out.println(ob.x);
	}
}
class inner3
{
	public static void main(String args[])
	{
		out o=new out();
		o.meth();
	}
}