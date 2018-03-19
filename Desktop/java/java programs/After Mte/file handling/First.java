import java.io.*;
class basics
{
public static void main(String [] ar)
{
try{
File f = new File("a.txt");//it is not created if it is not exist
if(!f.exists())
{
f.createNewFile();
}
System.out.println(f.getName());
System.out.println(f.getAbsolutePath());

System.out.println(f.getPath());
System.out.println(f.length());
System.out.println(f.isFile());
System.out.println(f.isDirectory());
}catch(IOException e)
{
System.out.println("Exception Caught..");
}
}}