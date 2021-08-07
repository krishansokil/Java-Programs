import java.util.Scanner;
class M
{
Scanner sc = new Scanner(System.in);
M()
{
display();
}
void  display()
{
int ch;

	System.out.println("1");
	System.out.println("2");
	ch=sc.nextInt();

switch(ch)
{
case 1: 
addition();
  break;
case 2: 
        subtraction();
        break;
default:
        System.out.println("error"); 
	
}
}

void addition()
{
int i,j,a,b;
System.out.println("enter the row and column: ");
a=sc.nextInt();
b=sc.nextInt();	
int m[][] = new int[a][b];
int n[][] = new int[a][b];
int nn[][] = new int[a][b];
System.out.println("first  mat");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.println("m["+i+"]["+j+"]=");
m[i][j]=sc.nextInt();
}
}
System.out.println("sec  mat");
for(i=0;i<a;i++)
{
for(j=0;j<b;j++)
{
System.out.println("n["+i+"]["+j+"]=");
n[i][j]=sc.nextInt();
}
}

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

void subtraction()
{
int i,j,a,b;
System.out.println("enter the row and column: ");
a=sc.nextInt();
b=sc.nextInt();	
int m[][] = new int[a][b];
int n[][] = new int[a][b];
//int nn[][] = new int[a][b];
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
nn[i][j]=m[i][j]-n[i][j];
System.out.print(nn[i][j]+" ");
}
System.out.println();
}
}

public static void main(String args[])
{
M obj = new M();

}
}
	
	

