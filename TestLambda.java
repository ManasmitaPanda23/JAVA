package Lambda;

public class TestLambda {
	public static void main(String[] args) {
		ParLambda p = (x) -> System.out.println("parlambda=" + x);
		p.lambda(1);
		ParLambda p1 = (x) -> System.out.println("parlambda=" + x);
		p1.lambda(2);
	}

}
