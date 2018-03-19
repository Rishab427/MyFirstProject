class stringfunction
{
public static void main(String args[])
{
String s1="Test String";
String s2="sTRing match";
String s3="demo in class";
String s4="this is a demo";
String s5="demo";

boolean b1=s1.regionMatches(5,s2,0,6);
boolean b2=s1.regionMatches(true,5,s2,0,6);
System.out.println(b1);
System.out.println(b2);
System.out.println(s3.startsWith(s5));
System.out.println(s4.startsWith(s5));
}
}

