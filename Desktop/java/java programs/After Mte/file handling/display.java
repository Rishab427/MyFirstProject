import java.io.*;
import java.util.*;
class byteinput
{
public static void main(String [] ar)
{
Scanner sc =new Scanner(System.in);
try
{
FileOutputStream fos = new FileOutputStream("b.txt");
FileInputStream fis = new FileInputStream("a.txt");
int a;
while((a=fis.read())!=-1)
{
if((char)a=='a')
a=(int)'K';
fos.write(a);

}
}
catch(IOException e)
{
}

}}