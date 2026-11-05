package chapter5.program1;

import java.util.ArrayList;
import java.util.Arrays;

public class BT {
	static String componyName = "BT";
	ArrayList<Employee> empList  = new ArrayList<Employee>();
	ArrayList<String> departmentList = new ArrayList<String>(Arrays.asList("人事", "営業", "エンジニア"));
	
	public void createEmp(Employee employee) {
		if(!(employee.getDepartment() == "人事")) {
			System.out.println("アクセス権限がありません");
		}
		System.out.println("従業員を作成します。名前を入力してください");
		String empname = new java.util.Scanner(System.in).nextLine();
		System.out.println("つづいて所属する部署名(1.人事, 2.営業, 3.エンジニア)を番号で入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		switch(input) {
			case 1 -> {
				Employee emp = new HumanResource(empname, "人事");
				empList.add(emp);
			}
			case 2 -> {
				Employee emp = new Sales(empname, "営業");
				empList.add(emp);
			}
			case 3 -> {
				System.out.println("1つ目の使用言語を入力してください");
				String l = new java.util.Scanner(System.in).nextLine();
				ArrayList<String> lang = new ArrayList<String>();
				lang.add(l);
				System.out.println("以上で使用言語情報の入力を終了しますか？");
				System.out.println("y はい / n いいえ、入力を続ける");
				String yn = new java.util.Scanner(System.in).nextLine();
				int n = 2;
				while(yn.equals("n")) {
					System.out.println(n + "つ目の使用言語を入力してください");
					l = new java.util.Scanner(System.in).nextLine();
					lang.add(l);
					n++;
					System.out.println("以上で使用言語情報の入力を終了しますか？");
					System.out.println("y はい / n いいえ、入力を続ける");
					yn = new java.util.Scanner(System.in).nextLine();
				}
				Employee emp = new Engineer(empname, "エンジニア", lang);
				empList.add(emp);
			}
		}	
	}
	
	public void allEmployee(){
		System.out.println(empList);
	}
}
