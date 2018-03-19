import java.io.*;
import java.util.*;
class ReadFile
{
public static void main(String []ar) throws Exception
{
File f= new File("a.txt");
Scanner input = new Scanner(f);
while(input.hasNext())
{
String s= input.next();
System.out.println(s);
}
input.close();
}
}