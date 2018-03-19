interface a
{
void meth();//abstract by default
void meth1();
}
class inter implements a
{
public void meth()                      //it is by default pakage leveel so  privilage is less so declare public.
{
System.out.print("Meth");
}
public void meth1()
{
System.out.println("Meth1");
}

public static void main(String args[])
{
inter i=new inter();
i.meth();
}
} 