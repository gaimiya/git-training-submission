
public class Main {
	public static void main(String[] args) {
		Line l = new Line(1, 1, 20, 2);
		double x = l.getPerimeter();
		System.out.println(x);
		l.draw();
	}
}
