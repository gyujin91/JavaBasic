package sec1;

import java.util.Scanner;

public class Hello4 {

	public static void main(String[] args) {
		// 저장소(변수) 선언
		
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		math = sc.nextInt();
		System.out.println("총점은" + (kor + eng + math) + "이며"
				+ "평균 점수는" + (kor + eng + math)/3 + "입니다.");

	}

}
