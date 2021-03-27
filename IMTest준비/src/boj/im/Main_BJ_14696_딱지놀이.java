package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_BJ_14696_�������� {
	static int N;
	public static void main(String[] args) throws Exception {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		for (int n = 0; n < N; n++) {
			int A[] = new int[5];
			int B[] = new int[5];
			//���� 1���� A�� ���� ������ ������ �׸��� �� ���� a,  (a�� 1�̻� 100����) , a���� ������ A�� �������� �׸�
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int a = Integer.parseInt(st.nextToken());
			
			for (int i = 0; i < a; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				A[tmp]++;
			}
			
			st = new StringTokenizer(br.readLine()," ");
			int b = Integer.parseInt(st.nextToken());
			for (int i = 0; i < b; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				B[tmp]++;
			}

			for (int i = 4; i >=1; i--) {
				if(A[i]>B[i]) {
					System.out.println("A");
					break;
				}
				if(A[i]<B[i]) {
					System.out.println("B");
					break;
				}
				if(i==1) {
					System.out.println("D");
				}
			}
			
		
		}
		
		
		
	}
}
