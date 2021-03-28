package boj.step013��Ʈ��ŷ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class b9663NQueen {
	static int N;
	static int[][] arr;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		
		arr = new int[N][N];
		/*
		 * N-Queen ������ ũ�Ⱑ N �� N�� ü���� ����  �� N���� ���� ������ �� ���� ���� �����̴�.

			N�� �־����� ��, ���� ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
			
			���� �����¿� �밢������ �Ÿ����� ���� �� �������� �̵��Ѵ�.
			�� ������ ��ġ�� �ʰ� �� �ٸ� ���� ���� ��ġ�ؾ��Ѵ�.
			
			=> �� �ະ�� ������ �ִ� ��ġ�� ���� �� ���ȣ��. ��� ��ġ�Ǹ� cnt�� ����Ǽ� ã��
			
			
			1. ���ȣ�� 
			2. �� ������ �ִ��� ���ǹ�
		 */
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
