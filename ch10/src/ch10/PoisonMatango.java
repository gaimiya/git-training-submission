package ch10;

public class PoisonMatango extends Matango {
	int poison = 5;
	
	public PoisonMatango(char a) {
		super('a');
	}
	
	public void attack(Hero h) {
		if (poison > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int hhp = h.hp;
			hhp /= 5;
			h.hp -= hhp;
			System.out.println(hhp + "ポイントのダメージ！");
			poison -= 1;
		}
	}
}
