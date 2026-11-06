package chapter5.program1;

import java.util.ArrayList;

public class Engineer extends Employee {
	ArrayList<String> languageUsed = new ArrayList<String>();
	
	public Engineer(String name, ArrayList<String> lang) {
		super(name, "エンジニア");
		languageUsed = lang;
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public void develop() {
		System.out.println("開発で使用する言語を以下から番号で入力してください");
		StringBuilder sb = new StringBuilder();
		int num = 0;
		for(int i = 0; languageUsed.size() >= i + 1; i++) {
			num++;
			sb.append(num + ". " + languageUsed.get(i));
			if(i + 1 != languageUsed.size()) { // 文末までは", "をつける
				sb.append(", ");
			}
		}
		System.out.println(sb);
		
		int num2 = 0;
		StringBuilder sb2 = new StringBuilder();
		while (num2 < languageUsed.size()) {
			int input = new java.util.Scanner(System.in).nextInt();
			sb2.append(languageUsed.get(input - 1));
			System.out.println("以上で使用言語情報の入力を終了しますか？");
			System.out.println("y はい / n いいえ、入力を続ける");
			String yn = new java.util.Scanner(System.in).nextLine();
			if (yn.equals("y")) {
				break;
			} else {
				num2++;
				sb2.append(", ");
				System.out.println("追加で開発で使用する言語を番号で入力してください");
			}
		}
		System.out.println(sb2 + "で開発を行った");
	}
	
	public void disclosure() {
		System.out.print(getName() + "：" + getDepartment() + "　使用言語:" );
		for(int i = 0; i < languageUsed.size(); i++) {
			System.out.print(languageUsed.get(i));
			if(i + 1 != languageUsed.size()) { // 文末までは", "をつける
				System.out.print(", ");
			}
		}
		System.out.println();
		
	}
}
