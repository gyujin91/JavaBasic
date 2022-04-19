package sec1;

//함수적인터페이스의 람다식 모체가 된다.
@FunctionalInterface
public interface MyFnc1 {
	public void method1();
	// Bulk Type
	
	// 매개변수X, 반환타입X
	// 람다식은 하나만 선언
	// public void method2();
	// public int method3();
	
	// 매개변수가 있다? - 받을게 있다.
	// 반환타입이 있다? - 줄게 있다.
	
	// Function Type : 매개값을 타입변환하여 반환
	// Operator Type : 매개값을 연산하여 반환
	// Predicate Type : 매개값을 비교하여 true/false로 반환
} 