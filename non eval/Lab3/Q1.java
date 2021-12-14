public class Q1 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 10, 20, 10);
		Rectangle r2 = new Rectangle(5,5,5,5);
		r2.translate(14, 9);
		if(overlap(r1, r2)) 
			System.out.println("OVERLAP");
		else
			System.out.println("NO OVERLAP");
	}
	
	private static boolean overlap(Rectangle r1, Rectangle r2) {
		
		if(r1.get_x() < r2.get_x()) {
			if((r1.get_x()+r1.Width) <= r2.get_x())
				return false;
		}
		else {
			if((r2.get_x()+r2.Width) <= r1.get_x())
				return false;
		}
		
		
		if(r1.get_y() > r2.get_y()) {
			if((r1.get_y()-r1.Height) >= r2.get_y())
				return false;
		}
		else {
			if((r2.get_y()-r2.Height) >= r1.get_y())
				return false;
		}
		
		return true;

	}

}

class Rectangle {
	private double x, y;
	public double Height, Width; // Coordinates are of the top-left vertex
	
	public Rectangle() {
		x=0;
		y=0;
		Height=0;
		Width=0;
	}
	
	public Rectangle(double x, double y, double Width, double Height) {
		this.x=x;
		this.y=y;
		this.Height=Height;
		this.Width=Width;
	}
	
	public double get_x() {
		return this.x;
	}
	
	public double get_y() {
		return this.y;
	}
	
	public void translate(int x_pos, int y_pos) {
		this.x += x_pos;
		this.y += y_pos;
	}
	
}
