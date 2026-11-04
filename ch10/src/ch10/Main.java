package ch10;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SuperHero sh = new SuperHero();
		sh.run();
		
		PoisonMatango pm = new PoisonMatango('A');
		SuperHero sh2 = new SuperHero();
		pm.attack(sh2);
		System.out.println(pm.poison);
	}

}
