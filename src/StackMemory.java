
public class StackMemory {

	public StackMemory() {
		super();

	}

	public long fatorial(long n) {

		System.out.println(n);
		long proximo = n - 1;
		return n * fatorial(proximo);

	}
}
