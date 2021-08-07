import java.util.*;
class Area
{
double circle,triangle;
int rectangle;
Area(int r)
{
circle=3.14*r*r;
System.out.println(+circle);
}
Area(double b,double h)
{
triangle=0.5*b*h;
System.out.println(+triangle);
}
Area(int base,int breadth)
{
rectangle=base*breadth;
System.out.println(+rectangle);
}
public static void main(String args[])
{
Area obj = new Area(10);
Area obj1 = new Area(10.44,33.44);
Area obj2 = new Area(10,44);
}
}

