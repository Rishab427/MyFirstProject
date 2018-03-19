class stringMethods
{
public static void main(String [] ard)
{
String s1="Welocme to Java";
String s2 = new String("Welocme to Java");
String s3="Welocme to Java";

System.out.println("s1 == s2 "+ (s1==s2));
System.out.println("s1 == s3 "+ (s1==s3));
System.out.println("s1.equals(s2) "+ (s1.equals(s2)));
System.out.println("s1.equals(s3) "+ (s1.equals(s3)));
System.out.println("s1 == s2 "+ s1==s2);//here first concatination is occured
}}