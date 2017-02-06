package tailrecursion;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tailrecursion tr = new Tailrecursion();
		System.out.println(tr.FibonacciRec(9));
		System.out.println(tr.FibonacciTailRec(9, 0, 1));
	}
}
