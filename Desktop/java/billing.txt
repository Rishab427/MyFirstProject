class billing
{
float total;
	float computeBill(float price)
	{
		total=price+(price*(float)0.075);
                System.out.println("Single Parameter");
		return total;
	}
	float computeBill(float price, int quantity)
	{
		float y=price*quantity;
		total=y+y*(float)0.075;
		System.out.println("Two Parameter");
                return total;
	}
	float computeBill(float price, int quantity, float coupon)
	{
		float x=price*quantity;
		x=x-coupon;
		total=(x+ (x*(float)0.075));
		System.out.println("three Parameter");
		return total;
	}
public static void main(String args[])
{
	billing b=new billing();
	System.out.println(b.computeBill(20));
	System.out.println(b.computeBill(20,2));
	System.out.println(b.computeBill(50,2,20));
}
}