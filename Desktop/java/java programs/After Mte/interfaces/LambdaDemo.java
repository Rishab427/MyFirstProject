interface NumericTest
{
boolean test(int n);
}
class LambdaDemo2
{
public static void main(String[] ar)
{
NumericTest isEven = n->(n%2)==0;
if(isEven.test(10)) System.out.println("10 is even");
if(!isEven.test(9)) System.out.println("9 is not even");
}}