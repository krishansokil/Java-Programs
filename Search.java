import java.util.*;
public class Search
{
public static int linearSearch(int[] arr, int key)
{
for(int i=0;i<arr.length;i++)
{
if(arr[i]==key)
{
return i;
}
}
return -1;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int arr[] = new int[5];
int key;
System.out.println("enter the values: ");
for(int i=0; i<5; i++)
{
arr[i]=sc.nextInt();
}
System.out.println("enter key value: ");
key = sc.nextInt();
System.out.println(key+" is found at index: "+linearSearch(arr,key));
}
}