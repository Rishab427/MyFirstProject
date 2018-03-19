import java.io.*;
import java.util.*;

class Student implements Serializable
{
String name;
/*transient*/ int roll; //transient is for not saving the value
Student(String s,int r)

{name =s;
roll =r;
}
}

class WriteStudent 
{
public static void main(String [] ar) throws Exception
{
FileOutputStream f1= new FileOutputStream ("a.txt");
ObjectOutputStream o1 = new ObjectOutputStream(f1);
Student [] s= new Student [5];
Scanner sc = new Scanner(System.in);
for(int i =0;i<5;i++)
{
System.out.println("Enter the name ");
String s1= sc.next();
s[i]=new Student(s1,(i+1));

o1.writeObject(s[i]);
}
o1.close();
}
}