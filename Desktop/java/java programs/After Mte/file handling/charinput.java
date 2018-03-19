import java.io.*;
import java.util.*;
class charinput
{
public static void main(String [] ar)
{
Scanner sc =new Scanner(System.in);
try
{
String s= sc.nextLine();
FileWriter fos = new FileWriter("abc.txt");
char [] b = s.toCharArray();
fos.write(b);
fos.close();
}
catch(IOException e)
{
}

}}