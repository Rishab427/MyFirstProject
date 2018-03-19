import java.util.*;
interface vechicle{
	void getcolor();
	void getprice();

}
interface Bike extends vechicle{
	void numberOfTyres();
}
class MotorBike implements Bike{
	public static void main(String[] args) {
		MotorBike obj = new MotorBike();
		obj.numberOfTyres();
		obj.noOfGears();
		obj.getprice();
		obj.getcolor();
		obj.display();
	}
	Scanner scan = new Scanner(System.in);
	int price,tyres,gears;
	String color;
	void noOfGears(){
		System.out.println("Enter numbers of Gears ");
		gears = scan.nextInt();
	}
	public void numberOfTyres(){
		System.out.println("Enter numbers of tyres ");
		tyres = scan.nextInt();		
	}
	public void getcolor(){
		scan.nextLine();
		System.out.println("Enter Color of vechicle ");
		color = scan.nextLine();	
	}
	public void getprice(){
		System.out.println("Enter Price of vechicle ");
		price = scan.nextInt();		
	}
	void display(){
		System.out.println("noOfGears "+gears+" numberOfTyres "+tyres+" color "+color+" price "+price);
	}
}