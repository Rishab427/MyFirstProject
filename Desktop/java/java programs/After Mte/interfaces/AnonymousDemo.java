interface Age
{
int x=21;
void getAge();
}

class AnonymousDemo
{
public static void main(String [] ar)
{
Age a1= new Age()
{@Override
public void getAge()
{
System.out.println("Age is "+x);
}};
a1.getAge();

}
}