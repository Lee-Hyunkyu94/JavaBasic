package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("로그인");
		Scanner sc = new Scanner(System.in); // 타입 인스턴스 변수 = new 타입명();
		System.out.println("ID [    ]"); // ID 입력
		String id = sc.next(); // sc = new Scanner
		System.out.println("PW [    ]");
		String pw = sc.next();
		String result = "0";
		final String WORNG = "틀립니다";


		if (id.equals("kim") && pw.equals("1")) {
			result = "로그인성공";
		} else if (!id.equals("kim") && pw.equals("1")) {
			result = "ID가 " + WORNG;
		} else if (id.equals("kim") && !pw.equals("1")) {
			result = "PW가 " + WORNG;
		} else {
			result = "로그인실패";
		}
		System.out.println(result);
	}
}
