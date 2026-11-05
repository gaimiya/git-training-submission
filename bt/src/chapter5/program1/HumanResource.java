package chapter5.program1;

public class HumanResource extends Employee {

	public HumanResource(String name, String department) {
		super(name, department);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public void interview() {
		System.out.println("面接を行い、結果は");
	}
	
	public void payroll() {
		
	}
	
	public void disclosure() {
		System.out.println(getName() + "：" + getDepartment());
	}
}
