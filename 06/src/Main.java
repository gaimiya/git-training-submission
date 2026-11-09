public class Main {
	public static void main(String[] args) {
		Line l = new Line(0, 0, 0, 1);
		l.draw();
		System.out.println(l.getPerimeter());
		
		Circle c = new Circle(2, 2, 2);
		c.draw();
		System.out.println(c.getPerimeter());
		
		Triangle t = new Triangle(1,1,2,2,3,3);
		t.draw();
		System.out.println(t.getPerimeter());
		
		Rectangle r = new Rectangle(50,50,10,5);
		r.draw();
		System.out.println(r.getPerimeter());
		
		Square s = new Square(5, 5, 5);
		s.draw();
	}

}
