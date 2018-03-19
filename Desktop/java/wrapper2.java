import java.util.*;
class wrapper2
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
StringBuilder sb=new StringBuilder(s);
for(int i=0;i<sb.length();i++)
{
if(Character.isUpperCase(sb.charAt(i)))
sb.setCharAt(i,Character.toLowerCase(sb.charAt(i)));
else
sb.setCharAt(i,Character.toUpperCase(sb.charAt(i)));
}
System.out.println(sb);
}
}