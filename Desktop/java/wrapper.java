/*Wap to change each char in string*/

import java.util.*;
class wrapper
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
if(Character.isUpperCase(c[i]))
c[i]=(Character.toLowerCase(c[i]));
else
c[i]=(Character.toUpperCase(c[i]));
}
System.out.println(c);
}
}