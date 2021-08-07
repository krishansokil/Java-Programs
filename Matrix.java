import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
int i,j,R,C;
System.out.println("enter the row and column: ");
Scanner sc = new Scanner(System.in);
R=sc.nextInt();
C=sc.nextInt();
int a[][] = new int[R][C];

for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
System.out.println("a["+i+"]["+j+"]=");
a[i][j]=sc.nextInt();
}
}
for(i=0;i<R;i++)
{
for(j=0;j<C;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
}
}

