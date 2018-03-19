class overloading
{
void name()
{
System.out.println("Name is : Anupam");
}
void name(String a)
{
System.out.println("Name is "+a);
}
void name(String c, String d)
{
System.out.println("Names are "+c+" "+d);
}
public static void main(String [] args)
{
overloading  a =new overloading();
a.name();
a.name("Aakash");
a.name("aa","bb");
}}