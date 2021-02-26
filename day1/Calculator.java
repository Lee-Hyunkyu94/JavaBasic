package day1;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	System.out.println("°è»ê±â");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	System.out.println(System.in);
	String b = sc.next();
	int c = sc.nextInt();
	int restult = 0;
	if(b.equals("+")) {restult = a + c;}
	if(b.equals("-")) {restult = a - c;}
	if(b.equals("*")) {restult = a * c;}
	if(b.equals("/")) {restult = a / c;}
	System.out.println( a + b + c+"="+restult);
	
	
}
}
