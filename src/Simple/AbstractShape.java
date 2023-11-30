package Simple;

abstract class shape{
	public abstract void calculatearea();
	public abstract void calculatePerimeter();
	
}
abstract class circle extends shape{
	abstract void calculatearea() { 
		System.out.print("Area of the Circle: ");
		
	}
	
	
}
public class AbstractShape {

	public static void main(String[] args) {
		
	}

}
