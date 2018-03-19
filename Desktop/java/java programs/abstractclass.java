abstract class Assignment 
{
String name;
double CGPA;

abstract boolean placement();

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
boolean placement()
{
return false;
}
}
class student2 extends Assignment
{
student2()
{
name ="SHYAM";
CGPA=9.5;
}
boolean placement()
{
return true;
}
}

class assigning1
{
public static void main(String [] ae)
{
student1 arr=new student1();
System.out.println(arr.getname());
System.out.println(arr.getcgpa());
System.out.println(arr.placement());


student2 arr1=new student2();
System.out.println(arr1.getname());
System.out.println(arr1.getcgpa());
System.out.println(arr1.placement());
}}