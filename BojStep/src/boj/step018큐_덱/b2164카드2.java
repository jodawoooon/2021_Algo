package boj.step018ť_��;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class b2164ī��2 {
	//1-N������ ī��. ������ 1��, �� �Ʒ� N��
	//ī�� ���� ������ ���� -> while
	// ���� ���� ī�带 �ٴڿ� ������. �� ���� ���� ���� �ִ� ī�带 ���� �Ʒ��� �ִ� ī�� ������ �ű��
	
	//if N=4�̸�. 1 ������ 234 ����, 2�� 4������ �Űܼ� 342�� �ȴ�. 
	// �׸��� 3 ������ 42����, 4�� 2������ �ű�� 24�� �ȴ�. ���������� 2�� ������ 4�� �����´�
	
	//�̷��������ؼ� ���� �������� ���� ī���?
	static int[] q;
	static int N;
	static Queue<Integer> queue = new LinkedList<>();
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		q = new int[N+1];
		for (int n = 1; n <= N; n++) {
			q[n] = n;
			System.out.println(n);
		}

		while(true) {
			if(queue.size()==1) {
				System.out.println(queue.peek());
				return;
			}
			System.out.println(queue.peek());
			queue.poll();
			int nextTOP = queue.poll();

			
			
		}
		
	}

}
