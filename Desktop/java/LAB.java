import java.util.Scanner;
class Vehicle{
 Scanner sc=new Scanner(System.in);
 double mileage;
 double fuel;
 public void getter()
 {
  System.out.println("ENTER THE MILEAGE:");
  mileage=sc.nextDouble();
  System.out.println("ENTER THE TOTAL FUEL:");
  fuel=sc.nextDouble();
 }
}

class Bike extends Vehicle{
 Scanner sc=new Scanner(System.in);
 String name;
 int maxSpeed;
 double remfuel;
 public void getBike()
 {
  System.out.println("ENTER THE NAME:");
  name=sc.next();
  System.out.println("ENTER MAX SPEED:");
  maxSpeed=sc.nextInt();
 }
 public void remfuelbike(int trackDistance)
 {
  remfuel=b.fuel-(mileage*trackDistance);
  System.out.println("REMIANING FUEL IN BIKE IS:"+remfuel);
 }
}

class Car extends Vehicle{
 Scanner sc=new Scanner(System.in);
 String name;
 int maxSpeed;
 double remfuel;
 public void getCar()
 {
  System.out.println("ENTER THE NAME:");
  name=sc.next();
  System.out.println("ENTER MAX SPEED:");
  maxSpeed=sc.nextInt();
 }
 public static void remfuelcar(int trackDistance)
 {
  remfuel=c.fuel-(mileage*trackDistance);
  System.out.println("REMIANING FUEL IN CAR IS:"+remfuel);
 }
}

class Race{
 public static void main(String []args)
 {
  Scanner sc=new Scanner(System.in);
  int trackDistance;
  int choice;
  Bike b=new Bike();
  Car c=new Car();
  System.out.println("********CHOOSE ANY ONE OF THE FOLLOWING******");
  System.out.println("1.BIKE");
  System.out.println("2.CAR");
  choice=sc.nextInt();
  switch(choice)
  {
   case 1:
         {
	   System.out.println("ENTER THE DISTANCE FOR BIKE:");
           trackDistance=sc.nextInt();
           b.getter();
           b.getBike();
           b.remfuelbike(trackDistance);
           break;
         }
   case 2:
         {
	   System.out.println("ENTER THE DISTANCE FOR BIKE:");
           trackDistance=sc.nextInt();
           c.getter();
           c.getCar();
           c.remfuelcar(trackDistance);
           break;
         }
   default:
         {
	   System.out.println("INVALID INPUT");
         }
}
}
}