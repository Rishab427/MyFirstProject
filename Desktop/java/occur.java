/*class occur
{
public static void main(String args[])
{
String s1="This is an issueless issue";
String s2="is";
int count=0,i=-1;
while((i=s1.indexOf(s2,i+1))>=0)
count=count+1;
System.out.println(count);
}
}*/


class occur
{
public static void main(String args[])
{
String s1="This is an issueless issue";
String s2="is";
int i=0,count=0;
i=s1.indexOf(s2,i);
while(i>=0)
{
count=count+1;
i=s1.indexOf(s2,i+1);
}
}
}
