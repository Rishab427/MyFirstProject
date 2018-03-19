public class prac1
{
public static void main(String ar[])
{
char ch=ar[0].charAt(0);
System.out.println(ch);
System.out.println(ar[0]);
System.out.println(ar.length);

String s=ar[1];
char ch1=s.charAt(3);
System.out.println(ch1);

System.out.println(ch+ch1);

char ch2=(char)(ch+ch1);
System.out.println(ch2);
System.out.println(ch+" "+ch1);
}
}