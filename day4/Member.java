package day4;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� ���");
		String name = sc.next();
		System.out.println("���� ����");
		int age = sc.nextInt();
		System.out.println("E-mail ���");
		String email = sc.next();
		Home h = new Home();
		h.setName(name);
		h.setAge(age);
		h.setEmail(email);
		System.out.println("�̸� [" + h.getName() + "]���� [" + h.getAge() + "]E-mail[" + h.getEmail() + "]");
		System.out.println(" ����� �Ϸ� �Ǿ����ϴ� ");
	}

}