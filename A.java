class B
{

public void show()
{
System.out.println("method 1");
}

private void show1()
{
System.out.println("method 2");
}

protected void show2()
{
System.out.println("method 3");
}

}

public class A
{

public static void main(String args[])
{
B obj = new B();
obj.show();
//obj.show1();
obj.show2();
}
}

