class Fan
{
private int speed;
private boolean on;
private double radius = 5;
String color ="blue";

Fan()
{
speed=0;
on =false;
radius=5;
color = "blue";
}
 
void setSpeed(int s)
{
speed=s;
}

int getSpeed()
{
return speed;
}

void setOn(boolean o)
{
on=o;
}
void setRadius(double r)
{
radius=r;
}

void setColor(String s)
{
color=s;
}

boolean getOn()
{
return on;
}

void toString1()
{Fan f1=new Fan();
System.out.println("Fan color = "+color);
System.out.println("Fan Radius = "+radius);
if(f1.getOn()==false)
{
System.out.println("Fan is off");
}
else
System.out.println("Fan is on and the speed is "+speed);
}
}
class fn1
{
public static void main(String [] ar)
{
Fan f= new Fan();
f.setSpeed(3);
f.setColor("Yellow");
f.setOn(true);
f.setRadius(5);
f.toString1();
}}
