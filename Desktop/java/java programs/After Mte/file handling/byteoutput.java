import java.io.*;
import java.util.*;
class byteoutput
{
public static void main(String [] ar)
{
Scanner sc =new Scanner(System.in);
try
{
String s= sc.nextLine();
FileOutputStream fos = new FileOutputStream("a.txt");
FileInputStream fis = new FileInputStream("a.txt");
byte [] b = s.getBytes();
fos.write(b);


fos.close();
int a;
System.out.println("Before Reading total bytes are "+fis.available());
while((a=fis.read())!=-1)
{
fis.skip(2);
System.out.print((char)a);
}

}
catch(IOException e)
{
}

}}