
public class StackMemoryTest {
	
	public static void main(String[] args) {

		StackMemory fat = new StackMemory();
		
		long n = 5;
		long fatorial = fat.fatorial(n);
		
		System.out.println("Fatorial = "+fatorial);
	}
}
