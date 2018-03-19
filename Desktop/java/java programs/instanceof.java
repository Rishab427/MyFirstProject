class vehicle
{
String s ;
double price;
void display()
{
System.out.println("Inside Vehicle");
}
}
class car extends vehicle
{
car(String s1,double p1)
{
s=s1;
price =p1;

}
void display1()
{
System.out.println("Inside Car");
System.out.println("Name "+s);
System.out.println("Price "+price);
}
}
class jeep extends vehicle
{
jeep(String s1,double p1)
{
s=s1;
price =p1;
}
void display2()
{
System.out.println("Inside Jeep");
System.out.println("Name "+s);
System.out.println("Price "+price);
}
}
class instanceoF
{
public static void main(String [] ars)
{
vehicle [] arr =new vehicle[4];
arr[0]=new car("Ferrari",1500000);
arr[1]=new car("X",200000);
arr[2]=new jeep("Safaari",116000);
arr[3]=new car("Fms",156000);
for (int i=0;i<4;i++)

{
if(arr [i] instanceof car)
{
((car)arr[i]).display1();
}
if(arr [i] instanceof jeep)
{
((jeep)arr[i]).display2();
}}}}