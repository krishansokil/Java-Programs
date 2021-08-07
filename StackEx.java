import java.util.*;
class StackEx
{
public static void main(String args[])
{
Stack<String> s = new Stack<String>();
s.push("Ravi");
s.push("Vijay");
s.push("Ravi");
s.push("Ajay");
s.pop();
s.pop();
Iterator<String> itr = s.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}