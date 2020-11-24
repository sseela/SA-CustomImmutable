
final class CustomImmutable {
	private int i;
	public CustomImmutable(int i) {
		this.i = i;
	}
	public CustomImmutable modify(int i) {
		if(this.i == i) {
			return this;
		} else {
			return new CustomImmutable(i);
		}
	}
}

public class mainImpl {
	public static void main(String[] args) {
		CustomImmutable c1 = new CustomImmutable(10);
		CustomImmutable c2 = c1.modify(10);
		CustomImmutable c3 = c1.modify(100);
		System.out.println(c1 == c2);
		System.out.println(c1 == c3);
	}
}
