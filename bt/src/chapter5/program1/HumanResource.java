package chapter5.program1;

public class HumanResource extends Employee {

	public HumanResource(String name) {
		super(name, "人事");
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void interview() {
		System.out.println("面接結果を(1.採用, 2.不採用)で数字で入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input) {
			case 1 -> {
				System.out.println("面接を行い、結果は採用でした");
				BT bt = new BT();
				bt.createEmp(1);
			}
			case 2 -> {
				System.out.println("面接を行い、結果は不採用でした");
			}
		}
	}
	
	public void payroll() {
		System.out.println("給与計算を行った");
	}
	
	public void disclosure() {
		System.out.println(getName() + "：" + getDepartment());
	}
}
