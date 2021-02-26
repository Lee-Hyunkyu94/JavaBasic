package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 타입 인스턴스 변수 = new 타입명();

		System.out.println("#### 회원관리 ####");
		join();

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("## 회원가입 창 ##");
		System.out.println("ID 등록");
		String id = sc.next();
		System.out.println("PW 등록");
		String pw = sc.next();
		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[가입 정보] ID : " + u.getId() + ", PW : " + u.getPw());
		login(u);
	}

	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("# 로그인 창 #");
		//System.out.println("ID 입력");
		//System.out.println("PW 입력");

		String id = u.getId();
		String pw = u.getPw();
		System.out.println("[가입 정보] ID : " + id + ", PW : " + pw);
		String result = "0";
		String worng = "틀립니다";

		if (id.equals("lee") && pw.equals("1")) {
			result = "로그인 성공";
		} else if (!id.equals("lee") && pw.equals("1")) {
			result = "ID가" + worng;
		} else if (id.equals("lee") && !pw.equals("1")) {
			result = "PW가" + worng;
		} else {
			result = "로그인 실패";
		}
		System.out.println(result);

	}
}
