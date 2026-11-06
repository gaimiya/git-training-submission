
public class Rectangle extends Polygon {
	protected Point p;
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y, int width, int height) {
		this.p = new Point(x, y);
		this.width = width;
		this.height = height;
		this.angle = 4;
	}
	
	public void draw() { // 次のようなメッセージを表示する→[長方形(短型)を描画]点(0,0)を基準として幅100、高さ50の正方形
		
	}
	public double getPerimeter() {
		return (this.width + this.height) * 2; 
	}
}
