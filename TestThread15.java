public class TestThread15
{
public static Object Lock1 = new Object();
public static Object Lock2 = new Object();
public static Object Lock3 = new Object();
public static Object Lock4 = new Object();
public static void main(String args[])
{
ThreadDemo1 T1 = new ThreadDemo1();
ThreadDemo2 T2 = new ThreadDemo2();
ThreadDemo3 T3 = new ThreadDemo3();
ThreadDemo4 T4 = new ThreadDemo4();
T1.start();
T2.start();
T3.start();
T4.start();
}


private static class ThreadDemo1 extends Thread
{
public void run()
{
synchronized(Lock1)
{
System.out.println("Thread1: Holding lock 1...");
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{ }
System.out.println("Thread1: Waiting for lock 2...");
synchronized(Lock2)
{
System.out.println("Thread1:Holding lock 1 & 2...");
}
}
}
}


private static class ThreadDemo2 extends Thread
{
public void run()
{
synchronized(Lock2)
{
System.out.println("Thread2:Holding lock 2..");
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{ }
System.out.println("Thread2: Waiting for lock 3...");
synchronized(Lock3)
{
System.out.println("Thread2: Holding lock 2 & 3...");
}
}
}
}


private static class ThreadDemo3 extends Thread
{
public void run()
{
synchronized(Lock3)
{
System.out.println("Thread3: Holding lock 3...");
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{ }
System.out.println("Thread3: Waiting for lock 4...");
synchronized(Lock4)
{
System.out.println("Thread3:Holding lock 3 & 4...");
}
}
}
}


private static class ThreadDemo4 extends Thread
{
public void run()
{
synchronized(Lock4)
{
System.out.println("Thread4: Holding lock 4...");
try
{
Thread.sleep(3000);
}
catch(InterruptedException e)
{ }
System.out.println("Thread4: Waiting for lock 1...");
synchronized(Lock1)
{
System.out.println("Thread1:Holding lock 1 & 4...");
}}
}}
}