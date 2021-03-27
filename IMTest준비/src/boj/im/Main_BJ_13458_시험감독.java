package boj.im;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BJ_13458_���谨�� {
	static int N,A,B,C,res;
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); //N���� ������
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] A = new int[N+1];
		for (int n = 1; n <= N; n++) {
			A[n] = Integer.parseInt(st.nextToken());
		}
		
		
		st = new StringTokenizer(br.readLine());
		B = Integer.parseInt(st.nextToken()); //�Ѱ������� �� �����忡�� ������ �� �ִ� �������� ��
		C = Integer.parseInt(st.nextToken()); //�ΰ������� �� �����忡�� ������ �� �ִ� �������� ��
	
		//�Ѱ������� ���� 1�� �־�� �ϰ�, �ΰ������� ���� �� �־ �ȴ�.
		
		//�� �����帶�� ���û��� ��� �����ϱ� ���� �ʿ��� �������� �ּ� ���� ����Ѵ�.
		
		res = 0;
		for (int n = 1; n <= N; n++) {
			A[n] -= B;
			res++;
			
			if(A[n]>0) {
				res+=A[n]/C;
				
				A[n]%=C;
				if(A[n]>=1) res++;
				
			}

		}
		
		System.out.println(res);
	}
}
