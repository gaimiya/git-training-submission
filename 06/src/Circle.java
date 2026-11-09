
public class Circle extends Shape {
	private Point center;
	private int radius;
	
	public Circle() {
		Point center = new Point();
		this.center = center;
	}
	public Circle(int x, int y, int r) {
		Point center = new Point(x, y); 
		this.center = center;
		setRadius(r);
	}
	
	public int getRadius() {
		return this.radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public void draw() {
		System.out.println("\"[円を描画]中心点(" + center.getX() + ", " + \")";
	}
	
}
