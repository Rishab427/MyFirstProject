import java.util.*;
class Demo
{
public static void main(String ar[])
{
System.out.println("hello");
int x=10;
int y=20;
System.out.println("hello"+x+y)	;
System.out.println(x+y+"hello");
} 
}
class Demo1
{
	public static void main(String ar[])
	{
		byte b;
		int i=80;
		b=(byte) i;//possible
		 i=b+b;//possible from byte to int
		 //b=i;error possible lossy conversion
		 b=(byte)i;//possible
		 b=127;
		 System.out.println(b);
		 b=(byte)300;
		 System.out.println(b);
		 // b=b+1;not possible as considers 1 as integer
		 // b=b+(byte)1;not possible as arithematic on byte is typecasted to int data type
		 b=(byte)(b+1);
		 System.out.println(b);
		 b+=1;//works as we are just moving 1 ahead
		 //********************************************
		 //if \switch\ for\ while\ do while work here same as in c or c++
		 i=10;
		 if(i==10)
			 System.out.println(b);
		 for(int j=0;j<i-4;j++)
			 System.out.println(j);
		 while(i>4)
		 {
			 System.out.println(i);
			 i--;
		 }
		 do{
		 System.out.println(b);
		 i--;
	     }
		  while(i>4);
		  i=0;
		  i=i++;
		  
			 System.out.println(i);
    }
    }


class Demo3
{
	public static void main(String ar[])
	{
		System.out.println(ar.length);
		int x=Integer.parseInt(ar[0]);
		int y=Integer.parseInt(ar[1]);
		System.out.println(x+y);
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println(a);
		String s1=input.next();
		String s2=input.nextLine();
		System.out.println(s1);//no second time input as object "input" of Scanner class 
		System.out.println(s2);//already has some value in it
	}
}
class Demo4
{
	public static void main(String ar[])
	{
		char c=ar[0].charAt(0);
		System.out.println(c);
	}
}
		
		