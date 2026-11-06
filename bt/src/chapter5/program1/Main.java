package chapter5.program1;

public class Main {
	public static void main(String[] args) {
		BT.createEmp(1);
		BT.createEmp(1);
		HumanResource hr = new HumanResource("ダミー");
		hr = (HumanResource)BT.empList.get(0);
		hr.interview();
		Sales sl = new Sales("ダミー");
		sl = (Sales)BT.empList.get(1);
		sl.weeklyReport();
		sl.meeting();
		BT.allEmployee();
	}
}
