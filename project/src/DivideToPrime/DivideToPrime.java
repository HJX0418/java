package DivideToPrime;

import java.util.*;

public class DivideToPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������1��������");
		int num = sc.nextInt();
		divideToPrime(num);
	}
	
	public static void divideToPrime(int n) {
		System.out.print(n + " = " );
		//������ɸ÷���
		int i;
		if(isPrime(n)||n == 2) {
			System.out.print(n);
		}
		else {
			for(i=2;i<=n;i++) {
				if(n%i == 0 && (isPrime(i)||i == 2)) {				
					n /=i;			
					if(n == 1) {
						System.out.print(i);
						break;
					}	
					System.out.print(i+"*");
					i = 1;				
				}
	
			}
		}
	}
	
	public static boolean isPrime(int n) {
		boolean res = true;
		for(int i=2; i<n; i++) {
			if(n%i == 0) {
				res = false;
				break;
			}
		}
		return res;
	}

}
