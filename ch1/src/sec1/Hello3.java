package sec1;

import java.util.Scanner;

public class Hello3 {
	public static void main(String[] args) {
		
		String name;	// 문자열 저장소 선언 - name
		int age; 		// 정수 저장소 선언 - age
		double height; 	// 실수 저장소 선언 - height
		
		Scanner sc = new Scanner(System.in);// 키보드 생성
		System.out.println("이름 입력 : ");
		// 키보드로 입력한 내용을 문자열로 name에 저장
		name = sc.next();
		System.out.println("나이 입력 : ");
		// 키보드로 입력한 내용을 정수로 age에 저장
		age = sc.nextInt();
		System.out.println("키 입력 : ");
		// 키보드로 입력한 내용을 실수로 height에 저장
		height = sc.nextDouble();
		
		// 전체 저장한 정보를 출력
		System.out.println("이름은" + name + "이고, 나이는 " + age + "세 이며,"
				+ "키는" + height + "입니다.");
	}
}
