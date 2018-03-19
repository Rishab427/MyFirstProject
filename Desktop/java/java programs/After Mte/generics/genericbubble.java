class genericbubble
{
public static void main(String[] ar)
{ Integer in []={2,5,6,4,1};
Testbub<Integer> i = new Testbub<Integer>(in);
i.sort();
i.display();

String in1 []={"a","c","b","f","e"};
Testbub<String> i1 = new Testbub<String>(in1);
i1.sort();
i1.display();
}

}

class Testbub<T extends Comparable<T>>
{
T [] num;
Testbub(T [] o)
{
num =o;
}
void display()
{
System.out.println("Sorted list is as :-");
for(int i=0;i<num.length;i++)
{
System.out.println(num[i]);
}
}
void sort()
{
for(int i=0;i<num.length-1;i++)
{
for(int j=0;j<(num.length-1)-i;j++)
{
if(num[j].compareTo(num[j+1])>0)
{
T temp = num[j];
num[j]=num[j+1];
num[j+1]=temp;
}
}
}
}
}