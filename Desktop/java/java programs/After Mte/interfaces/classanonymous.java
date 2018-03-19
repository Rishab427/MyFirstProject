class anonymous
{
int k=1;  
void m(){}
anonymous(String s)
{
System.out.println("hello");
}
}
class testAnonymousClass
{ public static void main(String [] ar)
{
anonymous i1=new anonymous("Lpu")
{
public void m()
	{
    System.out.println("Demo of Anonymous using classes");
}
};

i1.m();

}
}
