class Car
{
	String color;
	double weight;
	Car() //构造方法
	{
		color = "red";
		weight = 125.1;
		System.out.println("Constructing Car");
	}
	String printColor()
	{
		return color;
	}
}
class CarDemo
{
	public static void main(String args[])
	{
		Car car1 = new Car ();//Car类型 car1对象名 new实例化 Car类 ()创建一个对象同时执行
		Car car2 = new Car ();
		String c;
		c= car1.printColor();//对对象的引用加.
		System.out.println("car1 color is " + c);
		c= car2.printColor();
		System.out.println("car2 color is " + c);
	}
}

/*
 * 定义对象
 * 1.生命对象
 * 2.创建对象
 * 3.执行构造方法
*/