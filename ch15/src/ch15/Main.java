package ch15;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// Instantの生成
		Instant i1 = Instant.now();
		
		// Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		
		// ZoneDateTimeの生成
		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime
				.of(2023, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		// InstantとZonedDateTimeの相互変換
		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));
		
		// ZonedDateTimeの利用方法
		System.out.println("東京:" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン:" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		
		if(z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
		
		// 文字列からLocalDateを作成
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2023/09/22", fmt);
		
		// 1000日後を計算する
		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt);
		System.out.println("1000日後は" + str);
		
		// 現在日付との比較
		LocalDate now = LocalDate.now();
		if(now.isAfter(ldatep)) {
			System.out.println("本日は、その日より未来です。");
		}
		
		LocalDate d1 = LocalDate.of(2023, 1, 1);
		LocalDate d2 = LocalDate.of(2023, 1, 4);
		
		// 3日間を表すPeriodを2通りの方法で生成
		Period p1 = Period.ofDays(3);
		Period p2 = Period.between(d1, d2);
		
		// d2のさらに3日後を計算する
		LocalDate d3 = d2.plus(p2);
		
		//練習15-1
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <= 99; i++) {
			sb.append(i);
			sb.append(",");
		}
		String a = sb.toString();
		System.out.println(a);
		
		//練習15-4
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		System.out.println(c);
		int day = c.get(Calendar.DAY_OF_MONTH);
		System.out.println(day);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH, day);
		Date dd = new Date();
		dd = c.getTime();
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String s = f.format(dd);
		System.out.println(s);
		
		//練習15-4
		Instant ii = Instant.now();
		ZonedDateTime z = ii.atZone(ZoneId.of("Asia/Tokyo"));
		LocalDate l3 = z.toLocalDate();
		LocalDate d4 = l3.plusDays(100);
		DateTimeFormatter fmg = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(d4.format(fmg));
	}
}

//練習15-2
//		String folder;
//		String file;
		//連結して完全なファイル名を表す文字列を組み立てる「c:\javadev\readme.txt」
//		public boolean isValidFileName(String fileName) {
//			return name.matches();
//		}

//練習15-3
//public boolean メソッド名(String name) {
//	return name.matches("[A-Z]");