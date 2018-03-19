import java.util.*;
class wrapperclass2
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
al.add("hello");
al.add("demo");
al.add(1,"test");

System.out.println(al);
System.out.println(al.get(1));

al.remove(1);

System.out.println(al.get(1));
System.out.println(al);

al.add(23);

System.out.println(al);

}
}
