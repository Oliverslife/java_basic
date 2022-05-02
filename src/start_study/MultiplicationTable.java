package start_study;

public class MultiplicationTable {
	
	void Multi() {
		Multi(5);
	}	
	
	void Multi(int n) {
		Multi(n, 1, 10);
	}
	
	void Multi(int n, int from, int to) {
		for(int i=from; i<=to; i++) {
			System.out.printf("%d * %d = %d", n, i, n * i).println();
		}		
	}
}

