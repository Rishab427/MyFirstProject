import java.util.*;
enum Direction
{
east ,west,north,south;
}
class enumerations
{
public static void main(String [] argd)
{
for(Direction d:Direction.values())
{
switch(d)
{
case east:
System.out.println(d);
break;
case west:
System.out.println(d);
break;
case north:
System.out.println(d);
break;
case south:
System.out.println(d);
break;
default:
System.out.println("Hello");
}}}}