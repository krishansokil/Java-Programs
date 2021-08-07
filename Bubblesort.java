import java.util.Scanner;
public class Bubblesort
{
public static void main(String args[])
{
int n,c,i,swap;
Scanner sc = new Scanner(System.in);
System.out.println("enter the number of integers: ");
n = sc.nextInt();
int array[] = new int[n];
System.out.println("enter integers: ");
for(c=0;c<5;c++)
array[c]=sc.nextInt();

for(c=0;c<n-1;c++)
{
for(i=0;i<n-c-1;i++)
{
if(array[i]>array[i+1])
{
swap=array[i];
array[i]=array[i+1];
array[i+1]=swap;
}
}
}
System.out.println("sorting integers: ");
for(c=0;c<n;c++)
System.out.println(array[c]);
System.out.println("minimum: "+array[0]);
System.out.println("maximum: "+array[n-1]);
}
}
