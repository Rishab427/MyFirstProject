import java.io.*;
import java.util.*;
class ReadStudent 
{
public static void main(String [] ar) throws Exception
{
FileInputStream f1= new FileInputStream ("a.txt");
ObjectInputStream o1 = new ObjectInputStream(f1);


for(int i =0;i<5;i++)
{
Student s= (Student)o1.readObject();
System.out.println(s.name +" "+ s.roll);
}
o1.close();
}
}