
public abstract class Polygon extends Shape {
	protected int angle; // 内角(辺)の数を表す 
	
	public abstract void draw(); // 図形描画機能の定義
	public abstract double getPerimeter(); // 長さ測定機能の定義
	public int getIntermalAngle() { // 内角の和を算出
		return (angle - 2) * 180;
	}
}
