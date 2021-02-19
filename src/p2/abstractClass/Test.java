package p2.abstractClass;

public class Test {
	public static void main(String[] args) {
		                   
		Calculator c = new MyCalculatorImp();
		
		c.add(5);
		
		System.out.println(c.getCurrResult());

	}
}
