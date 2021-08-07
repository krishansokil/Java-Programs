import java.util.*;
public class ArrayLinked
{
	public static void main(String args[])
	{
	List<String> l1 = new ArrayList<String>();
	l1.add("Krishan");
	l1.add("Bharat");

	List<String> l2 = new LinkedList<String>();
	l2.add("Krishan");
	l2.add("Shubham");

	System.out.println("Arraylist: "+l1);
	System.out.println("Linkedlist: "+l2);
	}
}
