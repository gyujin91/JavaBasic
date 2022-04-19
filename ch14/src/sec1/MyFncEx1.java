package sec1;

public class MyFncEx1 {
	public static void main(String[] args) {
		
		// 람다식은 인터페이스 이므로 구현체가 반드시 필요하다.
		MyFnc1 f1;	// 매개변수X, 반환X
		f1 = () -> {
			System.out.println("MyFnc1 실행");
		};
		f1.method1();
		
		MyFnc2 f2;	// 매개변수O, 반환X
		f2 = (x) -> {
			System.out.println(x * x);
		};
		f2.method2(5);
		
		MyFnc3 f3; // 매개변수X, 반환O
		f3 = () -> {
			return "Hi~ MyFnc3";
		};
		System.out.println(f3.method3());
		
		MyFnc4 f4;	// 매개변수O, 반환O
		f4 = (x) -> {
			return x*x;
		};
		System.out.println(f4.method4(25));
	}
}