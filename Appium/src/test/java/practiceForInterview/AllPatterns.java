package practiceForInterview;

import org.testng.annotations.Test;

public class AllPatterns {

	@Test
	public void star() {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	public void thirdQuad() {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = n; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	@Test
	public void fstQuad() {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = n; j >=0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}	
	@Test
	public void star1() {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = 0; j <i; j++) {
				System.out.print(" ");
			}
			for (int j = n; j >i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	@Test
	public void rightMix() {
	 int n=5;
	 for (int i = 0; i <=n; i++) {
		for (int j = 0; j <i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	 for (int i = 0; i <=n; i++) {
		for (int j = n; j >=i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	@Test
	public void leftMix() {
		int n=5;
	for (int i = 0; i <=n; i++) {
		for (int j = n; j >i; j--) {
		System.out.print(" ");
		}
		for (int j = 0; j <i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	for (int i = 0; i <=n; i++) {
		for (int j = 0; j <i; j++) {
			System.out.print(" ");
		}
		for (int j = n; j >i; j--) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	@Test
	public void spaceStar() {
		int n=5;
		for (int i = 0; i <=n; i++) {
			for (int j = n; j>i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	@Test
	public void pyramid() {
	int n=5;
	for (int i = 0; i <=n; i++) {
		for (int j = n; j >i; j--) {
			System.out.print(" ");
		}
		for (int j = 1; j <=i; j++) {
			System.out.print("*");
		}
		for (int k = 2; k <= i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	}
	@Test
	public void numberPattern() {
	 int n=5;
	 for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	}
	@Test
	public void continuousP() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	@Test
	public void incrementP() {
		int n=5;
		int count=0;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void decrementP() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = i; j >=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	@Test
	public void mixPattern() {
	 int n=5;
	 for (int i = 1; i <=n; i++) {
		for (int j = 1; j <=i; j++) {
			System.out.print(j+" ");
		}
		
		for (int k = i-1; k>=1; k--) {
			System.out.print(k+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void reverseP() {
	int n=5;
	for (int i = 1; i <=n; i++) {
		for (int j = n; j >=i; j--) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	}
	@Test
	public void mixPatterrn() {
		int n=5;
		for (int i = 1; i <=n; i++) {
		int number=i;
		for (int j = 1; j <=i; j++) {
			System.out.print(number+" ");
			number=number+5-j;
		}
		System.out.println();
		}
	}
	
}

