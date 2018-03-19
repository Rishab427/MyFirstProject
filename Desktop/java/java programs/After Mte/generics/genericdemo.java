class Gen<T>
{
T ob;
Gen(T o)
{
ob =o;
}
T getOb()
{
return ob;
}
void showType()
{
System.out.println("Type of T is "+ ob.getClass());
}
}


class GenericDemo
{
public static void main(String [] ra)
{
Gen<Integer> a = new Gen<Integer> (10);
System.out.println(a.getOb());
a.showType();
}}