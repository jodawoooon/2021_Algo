package boj.step007���ڿ�;

import java.util.Scanner;

public class b2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for (int t = 0; t < T; t++) {
			int R = sc.nextInt();
			String S = sc.next();
			for (int i = 0; i < S.length(); i++) {
				for (int j = 0; j < R; j++) {
					System.out.print(S.charAt(i));
				}
			}System.out.println();
			
		}
		
	}
}
