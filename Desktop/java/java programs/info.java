import java.util.*;
class person
{
String name;
String address;

void getinfo(String s1,String s2)
{
name =s1;
address=s2;
}
void printinfo()
{
System.out.println("Name = "+name);
System.out.println("Address = "+address);

}
}

class student extends person
{
int regdNo;
int numOfCourse;
void getStuinfo(String s1,String s2,int c,int d)
{
getinfo(s1,s2);
regdNo=c;
numOfCourse=d;
}
void printStuinfo()
{
System.out.println("Regd. no  = "+regdNo);
System.out.println("Number of courses = "+numOfCourse);

}
}

class teacher extends person
{
int uid;
String course;

void getfacinfo(String s1,String s2,int c,String d)
{
getinfo(s1,s2);
uid = c;
course=d;
}
void printfacinfo()
{
System.out.println("Uid  = "+uid);
System.out.println("Name of course = "+course);

}
}


public class info
{
public static void main(String [] rahd)
{
Scanner sc =new Scanner(System.in);
student s=new student();
System.out.println("Enter the name = ");
String name = sc.nextLine();
System.out.println("Enter the address = ");
String address = sc.nextLine();
System.out.println("Enter the regd = ");
int regd = sc.nextInt();
System.out.println("Enter the Number of courses = ");
int n= sc.nextInt();
s.getStuinfo(name,address,regd,n);

teacher t= new teacher();
sc.nextLine();
System.out.println("Enter the name = ");,55
String name1 = sc.nextLine();
System.out.println("Enter the address = ");
String address1 = sc.nextLine();
System.out.println("Enter the uid = ");
int uid = sc.nextInt();
System.out.println("Enter the Name of course = ");
sc.nextLine();
String course= sc.nextLine();
t.getfacinfo(name1,address1,uid,course);
s.printinfo();
s.printStuinfo();
t.printinfo();
t.printfacinfo();

}}

