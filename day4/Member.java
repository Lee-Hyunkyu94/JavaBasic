package day4;

import java.util.Scanner;

public class Member {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 등록");
		String name = sc.next();
		System.out.println("나이 기입");
		int age = sc.nextInt();
		System.out.println("E-mail 등록");
		String email = sc.next();
		Home h = new Home();
		h.setName(name);
		h.setAge(age);
		h.setEmail(email);
		System.out.println("이름 [" + h.getName() + "]나이 [" + h.getAge() + "]E-mail[" + h.getEmail() + "]");
		System.out.println(" 등록이 완료 되었습니다 ");
	}

}