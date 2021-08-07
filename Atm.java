import java.util.*;
class Atm
{
int current_bal = 10000;
int password;
Scanner sc = new Scanner(System.in);


Atm()
{
System.out.println("Please give your authentication...");
System.out.println("enter password ");
password=sc.nextInt();	
if(password==123)
{
System.out.println("Access");
display();
}
else
{
System.out.println("Invalid");
}


}
void  display()
{
int ch;

	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
	System.out.println("4");
	ch=sc.nextInt();

switch(ch)
{
case 1: 
System.out.println(current_bal);
break;
case 2: 
withdrawbal();
break;
case 3:
depositbal();
break;
case 4:
System.exit(0);
default:
        System.out.println("error"); 
	
}
}

 void withdrawbal()
{
System.out.println("going to withdraw...");
try
{
wait();
}
catch(Exception e)
{
System.out.println(e);
}

this.current_bal-=current_bal;
System.out.println("withdraw completed...");
}

 void depositbal()
{
System.out.println("going to deposit...");
this.current_bal+=current_bal;
System.out.println("deposit completed...");
notify();
}

public static void main(String args[])
{
Atm obj = new Atm();
}
}

