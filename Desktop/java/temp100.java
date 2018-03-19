import java.util.Scanner;
interface person
{
	void adharcard();
	void details();
}
interface place
{
	void marks();
}

class temp100 implements person,place
{
	Scanner in = new Scanner(System.in);
	public void adharcard()
	{
		int n;
		System.out.println("Enter adharcard number");
		n=in.nextInt();
		System.out.println("Your adharcard no is ="+n);
	}
	public void details()
	{
		String s;
		System.out.println("Enter your name-");
		s=in.next();
		System.out.println("Your name is-"+s);
		int r;
		System.out.println("Enter Roll no-");
		r=in.nextInt();
		System.out.println("Your rollno is-"+r);
	}
	public void marks()
	{
		int m1,m2;
		System.out.println("Enter m1&m2-");
		m1=in.nextInt();
		m2=in.nextInt();
		System.out.println("marks are --"+m1+" "+m2);
	}
	public static void main(String args[])
	{
		temp100 t=new temp100();
		t.adharcard();
		t.details();
		t.marks();
	}
}
		
		
		