package day1;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		System.out.println("�α���");
		Scanner sc = new Scanner(System.in); // Ÿ�� �ν��Ͻ� ���� = new Ÿ�Ը�();
		System.out.println("ID [    ]"); // ID �Է�
		String id = sc.next(); // sc = new Scanner
		System.out.println("PW [    ]");
		String pw = sc.next();
		String result = "0";
		final String WORNG = "Ʋ���ϴ�";


		if (id.equals("kim") && pw.equals("1")) {
			result = "�α��μ���";
		} else if (!id.equals("kim") && pw.equals("1")) {
			result = "ID�� " + WORNG;
		} else if (id.equals("kim") && !pw.equals("1")) {
			result = "PW�� " + WORNG;
		} else {
			result = "�α��ν���";
		}
		System.out.println(result);
	}
}
