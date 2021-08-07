import java.util.Scanner;
public class Matrixadd
{
public static void main(String args[])
{
int i,j,a,b;
System.out.println("enter the row and column: ");
Scanner sc = new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
int m[][] = new int[a][b];
int n[][] = new int[a][b];

for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.println("m["+i+"]["+j+"]=");
m[i][j]=sc.nextInt();
}
}

for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.println("n["+i+"]["+j+"]=");
n[i][j]=sc.nextInt();
}
}
int nn[][] = new int[a][b];
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
nn[i][j]=m[i][j]+n[i][j];
System.out.print(nn[i][j]+" ");
}
System.out.println();
}
}
}
