package sec1;

import java.util.Scanner;

public class Hello3 {
	public static void main(String[] args) {
		
		String name;	// ���ڿ� ����� ���� - name
		int age; 		// ���� ����� ���� - age
		double height; 	// �Ǽ� ����� ���� - height
		
		Scanner sc = new Scanner(System.in);// Ű���� ����
		System.out.println("�̸� �Է� : ");
		// Ű����� �Է��� ������ ���ڿ��� name�� ����
		name = sc.next();
		System.out.println("���� �Է� : ");
		// Ű����� �Է��� ������ ������ age�� ����
		age = sc.nextInt();
		System.out.println("Ű �Է� : ");
		// Ű����� �Է��� ������ �Ǽ��� height�� ����
		height = sc.nextDouble();
		
		// ��ü ������ ������ ���
		System.out.println("�̸���" + name + "�̰�, ���̴� " + age + "�� �̸�,"
				+ "Ű��" + height + "�Դϴ�.");
	}
}
