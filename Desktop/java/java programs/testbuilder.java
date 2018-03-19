class TestStringBuilder
{
public static void main(String [] ar)
{
StringBuilder sb1 = new StringBuilder();
System.out.println(sb1.length());
System.out.println(sb1.capacity());

StringBuilder sb2 = new StringBuilder(25);
System.out.println(sb2.length());
System.out.println(sb2.capacity());

StringBuilder sb3 = new StringBuilder("Hello world!");
System.out.println(sb3.length());
System.out.println(sb3.capacity());

System.out.println(" "+sb3.append("......") );

StringBuilder sb4 = new StringBuilder("Prograaming Java");
System.out.println(" " +sb4.insert(12,"in "));

System.out.println(" "+sb4);
System.out.println(" "+sb4.delete(12,15));

System.out.println(" "+sb4.reverse());
System.out.println(" "+sb4);










}}