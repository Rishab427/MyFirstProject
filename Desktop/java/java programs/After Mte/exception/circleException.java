import java.util.*;
class NegativeCircleRadiusException extends Exception
{
public String toString()
{
return "Negative Circle Radius Exception..";
}
}


class circle
{
double r;
circle(double r)
{
this.r = r;
}
void area(double r) throws NegativeCircleRadiusException
{
if(r<0)
throw new NegativeCircleRadiusException();
else
System.out.println("Area is "+(3.14*r*r));
}

}

class circleException
{
public static void main(String [] ar)
{
Scanner sc = new Scanner(System.in);

//int r = sc.nextInt();
double r =(Math.random())*50;
circle c = new circle(r);
try{
c.area(r);
}
catch(NegativeCircleRadiusException e)
{
System.out.println(e);
}
}
}
