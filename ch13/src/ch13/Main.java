package ch13;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Wizard w = new Wizard();
		w.setHp(-1);
		w.setMp(-1);
		w.setName("あああ");
		System.out.println(w.getHp() + w.getMp());
		Wand wa = new Wand();
		wa.setPower(0.04);
	}

}
