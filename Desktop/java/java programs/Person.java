import java.util.*;
class Person
{
int age;
String name;
String address;
int phoneNo;
void getvalues()
{
Scanner sc =new Scanner(System.in);
System.out.println("Enter the name = ");
name = sc.nextLine();
System.out.println("Enter the age = ");
age = sc.nextInt();
System.out.println("Enter the address = ");
sc.nextLine();
address = sc.nextLine();
System.out.println("Enter the phone number = ");
phoneNo = sc.nextInt();
}
void printvalues()
{
System.out.println("name = "+name);
System.out.println("Age = "+age);
System.out.println("Address = "+address);
System.out.println("Phone number = "+phoneNo);
}


public static void main(String [] args)
{
Person p1=new Person();
Person p2=new Person();
Person p3= new Person();
ArrayList <Person> al= new ArrayList<Person>();
al.add(p1);
al.add(p2);
al.add(p3);
for(int i=0;i<3;i++)
al.get(i).getvalues();
for(int i=0;i<3;i++)
al.get(i).printvalues();


System.out.println(al.size());// return how much objects are created
if(al.contains(p2)==true)
{
System.out.println("P2 exists");
}
al.remove(p2);//remove the given object from a list
if(al.contains(p2)==true)
{
System.out.println("P2 exists");
}
else
{System.out.println("P2 doesnt exist");
}
al.remove(al.size()-1);//remove the last object from a list



}
}