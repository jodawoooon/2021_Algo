package swea.im;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_SWEA_1860_�������ְ�޺ؾ {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//0�ʺ��ͽ���, M�ʸ� K�� ����
		
		int T = sc.nextInt();
		for (int t = 0; t <= T; t++) {
			int N = sc.nextInt(); //N��
			int M = sc.nextInt(); 
			int K = sc.nextInt();
			
			
			int num = M*K;
			int[] arr = new int[N];
			//2 2 2 ��� 2��, 2�ʿ� 2������
			// 3�� 4�ʿ� �´�
			for (int n = 0; n < N; n++) {
				arr[n] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			boolean flag =true;
			for (int i = 0; i < N; i++) {

				int sum = K*(arr[i]/M); 
				if(sum-(i+1)<0) {
					
					flag = false;
					break;
				}
			}
			
			if(flag) {
				System.out.println("#"+t+" Possible");
			}else {
				System.out.println("#"+t+" Impossible");
			}
		}
	}
}
