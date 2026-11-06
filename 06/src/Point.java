
public class Point { // 座標位置情報を表すクラス
	private int x; // x座標を表す
	private int y; // y座標を表す
	
	public Point() {
		setX(0);
		setY(0);
	}
	public Point(int x, int y) {
		setX(x);
		setY(y);
	}
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
