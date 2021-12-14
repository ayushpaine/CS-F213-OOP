
public class Lab07 {
 
 public static void main(String[] args) {
   Shape s = new Shape("amorphous shape");
   myAssert("amorphous shape", s.toString());
   myAssert(0, s.area());
 
   Rectangle tableTop = new Rectangle("Table top", 3, 4);
   myAssert("Table top, 3.0x4.0", tableTop.toString());
   myAssert(12, tableTop.area());
 
   Square tile = new Square("Tile", 2);
   myAssert("Tile, 2.0x2.0", tile.toString());
   myAssert(4, tile.area());
 
   Circle windowGlass = new Circle("Window glass", 2.5);
   myAssert("Window glass, 2.5 radius", windowGlass.toString());
   myAssert(19.625, windowGlass.area());
 }
 
 /**
  * Prints the given string on System.out.
  *
  * @param stringToPrint string to print
  */
 private static void print(String stringToPrint) {
   System.out.println(stringToPrint);
 }
 
 /**
  * A simple assert that checks if the two strings are equal and prints the appropriate message.
  *
  * @param expected The expected value
  * @param actual The actual value
  */
 private static void myAssert(String expected, String actual) {
   if (expected.equals(actual)) print("OK");
   else print("ERROR! expected: " + expected + ", actual: " + actual);
 }
 
 /**
  * A simple assert that checks if the two doubles are equal and prints the appropriate message.
  *
  * @param expected The expected value
  * @param actual The actual value
  */
 private static void myAssert(double expected, double actual) {
   if (relativeErrorUnderThreshold(expected, actual, 0.01)) print("OK");
   else print("ERROR! expected: " + expected + ", actual: " + actual);
 }
 
 /**
  * Reports if the relative error in the expected and the actual value is below the given threshold.
  * @param expected The expected value
  * @param actual The actual computed value
  * @param threshold The acceptable threshold as percentage
  * @return true iff the relative error is below the threshold
  */
 private static boolean relativeErrorUnderThreshold(double expected, double actual, double threshold) {
   if (actual == 0) return expected == actual; // why is this needed?
   return Math.abs(expected - actual) / actual * 100 < threshold;
 }
}

class Shape {
	public String name;
	
	public Shape(String name) {
		this.name = name;
	}
	public double area() {
		return 0;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class Rectangle extends Shape {
	private double length;
	private double breadth;
	
	public Rectangle(String name, double length, double breadth) {
		super(name);
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	public double area() {
		return length*breadth;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(name);
		builder.append(", ");
		builder.append(length);
		builder.append('x');
		builder.append(breadth);
		return builder.toString();
	}
}

class Square extends Rectangle {
	public Square(String name, double side) {
		super(name, side, side);
	}
}

class Circle extends Shape {
	private double radius;
	
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double area = 3.14 * radius * radius;
		return area;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(name);
		builder.append(", ");
		builder.append(radius);
		builder.append(" radius");
		return builder.toString();
		
	}
}
