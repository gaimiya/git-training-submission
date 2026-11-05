package chapter5.program1;

import java.util.ArrayList;

public class Engineer extends Employee {
	ArrayList<String> languageUsed = new ArrayList<String>();
	
	public Engineer(String name, String department, ArrayList<String> lang) {
		super(name, department);
		languageUsed = lang;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void develop() {
		for(int i = 0; i < languageUsed.size(); i++) {
			System.out.print(languageUsed.get(i));
			if(i + 1 < languageUsed.size()) {
				System.out.println(", ");
			}
		}
	}
	
	public void disclosure() {
		System.out.print(getName() + "：" + getDepartment() + "　使用言語:" );
		for(int i = 0; i < languageUsed.size(); i++) {
			System.out.print(s);
		}
		
	}
}
