class Car
{
	String color;
	double weight;
	Car() //���췽��
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
		Car car1 = new Car ();//Car���� car1������ newʵ���� Car�� ()����һ������ͬʱִ��
		Car car2 = new Car ();
		String c;
		c= car1.printColor();//�Զ�������ü�.
		System.out.println("car1 color is " + c);
		c= car2.printColor();
		System.out.println("car2 color is " + c);
	}
}

/*
 * �������
 * 1.��������
 * 2.��������
 * 3.ִ�й��췽��
*/