class palindrome
{
public static void main(String args[])
{
StringBuilder sb=new StringBuilder(args[0]);
sb.reverse();
if(args[0].equals(sb.toString()))
{
System.out.println("Pallindrome");
}
else
{
System.out.println("Not A Pallindrome");
}
}
}