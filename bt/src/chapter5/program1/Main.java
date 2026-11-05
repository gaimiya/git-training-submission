package chapter5.program1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>(Arrays.asList("あ", "い", "う"));
		Engineer e = new Engineer("ミヤガイ", "エンジニア", a);
		e.disclosure();
		
//		BT bt = new BT();
//		HumanResource hr = new HumanResource("佐藤", "人事");
//		bt.createEmp(hr);
//		bt.allEmployee();
		
	}
}
