package tailrecursion;

public class Tailrecursion {

	public int FibonacciRec(int n) {
		if (n < 2) {
			return n;
		}
		return FibonacciRec(n - 1) + FibonacciRec(n - 2);
	}

	public int FibonacciTailRec(int n, int res1,int res2) {
		if (n == 0) {
			return res1;
		}
		return FibonacciTailRec(n - 1, res2, res1 + res2);
	}
}
