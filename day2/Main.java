package day2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // Ÿ�� �ν��Ͻ� ���� = new Ÿ�Ը�();

		System.out.println("#### ȸ������ ####");
		join();

	}

	public static void join() {
		Scanner sc = new Scanner(System.in);
		System.out.println("## ȸ������ â ##");
		System.out.println("ID ���");
		String id = sc.next();
		System.out.println("PW ���");
		String pw = sc.next();
		User u = new User();
		u.setId(id);
		u.setPw(pw);
		System.out.println("[���� ����] ID : " + u.getId() + ", PW : " + u.getPw());
		login(u);
	}

	public static void login(User u) {
		Scanner sc = new Scanner(System.in);
		System.out.println("# �α��� â #");
		//System.out.println("ID �Է�");
		//System.out.println("PW �Է�");

		String id = u.getId();
		String pw = u.getPw();
		System.out.println("[���� ����] ID : " + id + ", PW : " + pw);
		String result = "0";
		String worng = "Ʋ���ϴ�";

		if (id.equals("lee") && pw.equals("1")) {
			result = "�α��� ����";
		} else if (!id.equals("lee") && pw.equals("1")) {
			result = "ID��" + worng;
		} else if (id.equals("lee") && !pw.equals("1")) {
			result = "PW��" + worng;
		} else {
			result = "�α��� ����";
		}
		System.out.println(result);

	}
}
