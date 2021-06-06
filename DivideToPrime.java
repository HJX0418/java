package whut.info.homework;

import java.util.Scanner;

public class DivideToPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入大于1的正整数");
		int num = sc.nextInt();
		divideToPrime(num);
	}
	
	public static void divideToPrime(int n) {
		System.out.print(n + " = " );
		//补充完成该方法
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
