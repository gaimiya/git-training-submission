package ch13;

public class Wand {
	private String name;
	private double power;
	
	public void setName(String name) {
		if(name == null || name.length() < 3) {
			throw new IllegalArgumentException
			("名前は3文字以上で入力してください");
		}
	}
	public String getName() {
		return this.name;
	}
	public void setPower(double power) {
		if(power > 100.0 || power < 0.5) {
			throw new IllegalArgumentException
			("powerの値は10以下、0.05以上で入力してください");
		}
		this.power = power;
	}
	public double getPower() {
		return this.power;
	}
}
