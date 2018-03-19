interface anonymous
{
int k=1;  //public static and final
void m();
}

class testAnonymous
{ public static void main(String [] ar)
{
anonymous i1=new anonymous()
{
public void m()
	{
    System.out.println("Demo of Anonymous using interface");
}
};

i1.m();

}
}
