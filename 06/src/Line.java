
public class Line implements Figure {
	private Point p1 = new Point(); // 線の始点を表す
	private Point p2 = new Point(); // 線の"終点"を表す
	
	public Line() {
		this.p1.setX(0);
		this.p1.setY(0);
		this.p2.setX(0);
		this.p2.setY(0);
	}
	public Line(int p1x, int p1y, int p2x, int p2y) {
		p1.setX(p1x);
		p1.setY(p1y);
		p2.setX(p2x);
		p2.setY(p2y);
	}
	
	public void draw() {		
		System.out.println("\"[線を描画]始点(" + p1.getX() + "," +  p1.getY() + ")"
				+ "から終点(" + p2.getX() + "," +  p2.getY() + ")まで\"");
	}
	
	public double getPerimeter() {
		return Math.sqrt(Math.pow(p2.getY() - p1.getX(), 2)
					+ Math.pow(p2.getY() - p1.getY(), 2));
	}
}
