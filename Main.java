class Test11 extends Thread
{
int amount;
synchronized void withdraw(int amount)
{
System.out.println("going to withdraw");
if(this.amount<amount)
{
System.out.println("less balance");
try
{
wait();
}
catch(Exception e)
{}
}
this.amount-=amount;
System.out.println("withdraw completed");
}

synchronized void deposit(int amount)
{
System.out.println("going to deposit");
this.amount+=amount;
System.out.println("deposit completed");
notify();
}
}

class Main
{
public static void main(String args[])
{
Test11 obj = new Test11();
new Thread()
{
public void run()
{
obj.withdraw(15000);
}
}.start();
new Thread()
{
public void run()
{
obj.deposit(10000);
}
}.start();
}
}