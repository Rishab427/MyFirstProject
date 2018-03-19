import java.io.*;
import java.util.*;
class byteinput
{
public static void main(String [] ar)
{
Scanner sc =new Scanner(System.in);
try
{
String s= sc.nextLine();
FileOutputStream fos = new FileOutputStream("a.txt");
byte [] b = s.getBytes();
fos.write(b,0,10);
fos.close();
}
catch(IOException e)
{
}

}}