import java.util.*;
public class LinkedList2
{
public static void main(String args[])
{
LinkedList<String> l1 = new LinkedList<String>();
System.out.println("Initial list of elements: "+l1);
l1.add("Krishan");
l1.add("Monu");
System.out.println("After invoking add(E e) method: "+l1);
l1.add(1,"Gaurav");
System.out.println("After invoking add(int index, E element) method: "+l1);

LinkedList<String> l2 = new LinkedList<String>();
l2.add("Sonu");
l2.add("Motu");
l1.addAll(l2);
System.out.println("After invoking addAll(Collection<? extends E>c) method: "+l1);

LinkedList<String> l3 = new LinkedList<String>();
l3.add("Golu");
l3.add("Molu");
l1.addAll(1,l3);
System.out.println("After invoking addAll(int index, Collection<? extends E>c) method: "+l1);
l1.addFirst("Lokesh");
System.out.println("After invoking addFirst(E e) method: "+l1);
l1.addLast("Harsh");
System.out.println("After invoking addLast(E e) method: "+l1);
}
}