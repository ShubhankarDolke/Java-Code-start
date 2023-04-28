interface Shape
{
	void area(int r);
	float pi=3.14f;
}
class Circle implements Shape
{
	public void area(int r)
	{
	System.out.println("area of circle"+pi*r*r);
	}
}
class Sphere implements Shape
{
	public void area(int r)
	{
	System.out.println("area of sphere"+4*pi*r*r);
	}
}
class Slip22
{
	public static void main(String arg[])
	{
	Shape c=new Circle();
	c.area(3);
	Shape s=new Sphere();
	s.area(4);
	}
}