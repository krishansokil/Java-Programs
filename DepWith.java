import java.util.*;
class DepWith
{ 
Scanner sc = new Scanner(System.in);
void depositbal()
{
try
{
System.out.println("going to deposit...");
int dep=sc.nextInt();
System.out.println("deposit completed...");
try
{
System.out.println("enter the money that you want to withdraw ");
int withdraw=sc.nextInt();
if(withdraw>dep)
throw new ArithmeticException("insufficient balance");
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
catch(Exception e)
{
	System.out.println("Handled");
}
System.out.println("withdraw completed");
}


public static void main(String args[])
{
DepWith obj = new DepWith();
obj.depositbal();
}
}
