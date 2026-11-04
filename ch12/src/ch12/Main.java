package ch12;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		
		Y[] y = new Y[2];
		y[0] = a;
		y[1] = b;
		
		for (Y yy : y) {
			yy.b();
		}
	}
}
