package javaPractise;

public class Const {

	int a;
	int b;
	int result;

	public Const(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int add() {
		result = a + b;
		return result;

	}

	public int subs() {
		result = a - b;
		return result;
	}

	public int multiple() {
		result = a * b;
		return result;
	}

	public int Divide() {
		result = a / b;
		return result;

	}

}
