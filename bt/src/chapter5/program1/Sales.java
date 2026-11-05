package chapter5.program1;

public class Sales extends Employee {

	public Sales(String name, String department) {
		super(name, department);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void weeklyReport() {
		System.out.println("週報の返信をした");
	}
	
	public void arrangeInterview(Engineer e) {
		System.out.println(e.getName() + "の面談を組んだ");
	}
	
	public void meeting() {
		System.out.println("新規の打ち合わせをした");
	}
	
	public void disclosure() {
		System.out.println(getName() + "：" + getDepartment());
	}
}
