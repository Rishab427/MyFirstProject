class Mysingleton
{
private Mysingleton(){}
private static Mysingleton ob;
public static Mysingleton getinstance()
{
if(ob==null)
{
ob = new Mysingleton();
}
return ob;
}
}
class anyw
{
public static void main(String[] ard)
{
Mysingleton ms = getinstance();
}}
