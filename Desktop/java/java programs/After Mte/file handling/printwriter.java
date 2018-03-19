import java.io.*;
class PrintWriterDemo
{
public static void main(String [] ar) throws Exception
{
File f= new File("A.txt");
PrintWriter output = new PrintWriter(f);
output.print("java class");
output.println("LPU");
output.print(40);
output.println(85.5);

output.close();
}}