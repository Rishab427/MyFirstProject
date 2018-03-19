class Assignment 
{
String name;
double CGPA;

boolean placement()
{ 
return false;
}

String getname()
{
return name;
}

double getcgpa()
{
return CGPA;
}
}
class student1 extends Assignment
{

student1()
{
name ="RAM";
CGPA =7.5;
}
}
class student2 extends Assignment
{
student2()
{
name ="SHYAM";
CGPA=9.5;
}
}

public class assigning
{
public static void main(String [] ae)
{
student1 [] arr=new student1[5];
for(int i=0;i<5;i++)
{
arr[i]=new student1();
System.out.println(arr[i].getname());
System.out.println(arr[i].getcgpa());
System.out.println(arr[i].placement());
}
}}