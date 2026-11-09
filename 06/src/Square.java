
public class Square extends Rectangle {

	public Square(int x, int y, int width) {
		super(x, y, width, width);
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void draw() {
		System.out.println("\"[正方形を描画]点(" + p.getX() + ", " + p.getY() + ")を基準として幅・高さ"
				+ width + "の正方形");
	}

}
