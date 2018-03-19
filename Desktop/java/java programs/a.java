import java.util.*;
class Vehicle
{
String name;
double mileage;
int price;

Vehicle(String n,double m,int p)
{
name =n;
mileage =m;
price =p;
}

public int getPrice()
{
return price;
}
}
class TestVehicle
{
public static void minprice(Vehicle v1, Vehicle v2, Vehicle v3)
{
if(v1.getPrice()<v2.getPrice() && v1.getPrice()<v3.getPrice())
{
System.out.println("Name of the least price car is = "+v1.name);
}
else if(v2.getPrice()<v3.getPrice())
{System.out.println("Name of the least price car is = "+v2.name);

}
else
System.out.println("Name of the least price car is = "+v3.name);
}


public static void main(String [] ar)
{Scanner sc = new Scanner(System.in);
System.out.println("Enter Name = ");
String name1 = sc.nextLine();
System.out.println("Enter mileage  = ");
double mileage1 = sc.nextDouble();
System.out.println("Enter price = ");
int price1 = sc.nextInt();
Vehicle v1=new Vehicle(name1 , mileage1,price1);
sc.nextLine();
System.out.println("Enter Name = ");
String name2 = sc.nextLine();
System.out.println("Enter mileage  = ");
double mileage2 = sc.nextDouble();
System.out.println("Enter price = ");
int price2 = sc.nextInt();
Vehicle v2=new Vehicle(name2 , mileage2,price2);
sc.nextLine();
System.out.println("Enter Name = ");
String name3 = sc.nextLine();
System.out.println("Enter mileage  = ");
double mileage3 = sc.nextDouble();
System.out.println("Enter price = ");
int price3 = sc.nextInt();
Vehicle v3=new Vehicle(name3 , mileage3,price3);

ArrayList<Vehicle> z=new ArrayList<Vehicle>();
z.add(v1);
z.add(v2);
z.add(v3);
for (int i=0;i<3;i++)
{
System.out.println(z.get(i).getPrice());
}
minprice(v1,v2,v3);

}

}