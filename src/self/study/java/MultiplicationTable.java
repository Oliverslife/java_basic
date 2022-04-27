package self.study.java;

public class MultiplicationTable {
	
	void Multi() {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
		}		
	}	
	
	void Multi(int n) {
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}		
	}
	
	void Multi(int n, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}		
	}
}

