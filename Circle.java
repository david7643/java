package real자바;
public class Circle {
	int radius;
	Circle(int radius){
		this.radius = radius;
	}
	public double getarea() {
		return 3.14*this.radius*this.radius;
	}
	public static void main(String[] args){
	Circle[] array = new Circle[5];
	for(int i=0;i<array.length;i++)
	{
		array[i]=new Circle(i);
		System.out.println("radius="+i+" area="+array[i].getarea());
	}
	}
}
