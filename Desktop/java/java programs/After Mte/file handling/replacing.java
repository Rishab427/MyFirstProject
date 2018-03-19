import java.io.*;
import java.util.*;
class A
{
public static void main(String [] ar)throws Exception
{String sc;
Scanner s = new Scanner(System.in);

File f= new File("a.txt");
PrintWriter input = new PrintWriter(f);
sc= s.nextLine();
input.print(sc);

input.close();

File f2= new File("a.txt");
File f1= new File("b.txt");
PrintWriter y = new PrintWriter(f1);
Scanner x = new Scanner(f2);
while(x.hasNext())
{String s1= x.next();
if(s1.equals("abc"))
{
y.print("pqr");
}
else
y.print(s1);
}
y.close();
x.close();
}
}
