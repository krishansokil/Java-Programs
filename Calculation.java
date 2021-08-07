import java.util.*;
class A
{
double circle,triangle;
int rectangle;
void area(int r)
{
circle=3.14*r*r;
System.out.println(+circle);
}
void area(double b,double h)
{
triangle=0.5*b*h;
System.out.println(+triangle);
}
void area(int base,int breadth)
{
rectangle=base*breadth;
System.out.println(+rectangle);
}
}
public class Calculation
{
public static void main(String args[])
{
A obj = new A();
obj.area(2);
obj.area(2.0,2.0);
obj.area(2,2);
}
}