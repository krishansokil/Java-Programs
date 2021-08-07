class ThreadDemo extends Thread //implements runnable
{
private Thread t; //reference
private String threadName;
ThreadDemo(String name)
{
threadName = name;
System.out.println("Creating " + threadName );
}
public void run()
{
System.out.println("Running " + threadName );
try
{
for(int i=4;i>0;i--)
{
System.out.println("Thread: " + threadName + ", " + i);
Thread.sleep(5000);
}
}
catch(InterruptedException e)
{
System.out.println("Thread " + threadName + " interrupted.");
}
System.out.println("Thread " + threadName + " exiting.");
}
public void start()
{
System.out.println("Starting " + threadName );
if(t==null)
{
t=new Thread(this, threadName);
t.start(); //go to the run method
}
}
}
class TestThread12
{
public static void main(String args[])
{
ThreadDemo T1 = new ThreadDemo("Thread-1");
T1.start();
ThreadDemo T2 = new ThreadDemo("Thread-2");
T2.start();
}
}