package sec1;

// Generic<T> {} => 데이터의 타입과 관계없이 그 값을 저장할 목적 - 다목적
// Generic<T,M> {} => 데이터의 타입과 값을 저장 및 전달할 목적 - 다목적(키,값)
// 키(Key) => 객체의 주소, 객체의 멤버이름
// 값(Value) => 객체가 가지는 값

class Product<T,M> { // T라 쓰는게 관례
	// lee.name = "이규진";
	private T kind;	// key(Field) - 객체를 다룬다.
	private M model;	// value(Field가 가진 값) - 일반 데이터를 다룬다.
	public T getKind() {
		return kind;
	}
	public void setKind(T kind) {
		this.kind = kind;
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}
class Tv {
	String model;
}
class Human {
	String name;
}
	
	
	
}
public class ProductEx {

	public static void main(String[] args) {
		
		Product<Tv, String> p1 = new Product<Tv, String>();
	}

}
