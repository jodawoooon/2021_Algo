package boj.step014������ȹ��1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main_BJ_1520_�������� {
	/*
	������ ������ ���� ���� �� �������� ����Ͽ� ���� ������
	�Ʒ� �������� �׻� ��������θ� �̵��ϴ� ����� ������ ���ϴ� ���α׷�
	*/
	static int map[][], M,N;
	static long ans;
	static int dx[] = {-1,1,0,0}; //4��Ž���� �ϱ����� ����迭
	static int dy[] = {0,0,-1,1};
	public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner(System.in);
			ans = 0; //����� ����
			M = sc.nextInt(); //�� ���α���
			N = sc.nextInt(); //�� ���α���
			
			map = new int[M][N]; //���� ������ ������ map �迭
			
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					map[i][j] = sc.nextInt();//���� ���� ����
				}
			} 
			
			bfs(); //bfs�� ���Ž��
			
			System.out.println(ans); //������
		
	}
	
	private static void bfs() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(new Node(0,0,map[0][0])); 
		//�ʱ���ġ : ���� ���� �� �������� ���
		
		while(!queue.isEmpty()) {
			Node n = queue.poll(); //queue���� ������ ��ġ�� ���� ���̸� ������
			
			int x = n.x; //������ x��ǥ
			int y = n.y; //������ y��ǥ
			int h = n.h; //������ ���� ����
			
			if(x==M-1&&y==N-1) { //�������� ���������� : ���� ������ �Ʒ� ����
				ans++; //ī��Ʈ ����
			}
			
			for (int d = 0; d < 4; d++) { //���Ž��
				int nx = x + dx[d];
				int ny = y + dy[d];
				
				if(!isIn(nx,ny)) continue; //�� ���� �ȿ� �־����
				
				if(h>map[nx][ny]) { //���� ����(nx,ny)�� ���������̸�
					queue.add(new Node(nx,ny,map[nx][ny])); //�̵��Ѵ�
				}
			}
			
		}
	}
	
	private static boolean isIn(int nx, int ny) {
		//���� ���� �ȿ� �ִ��� üũ�ϴ� �޼ҵ�
		if(nx<0||ny<0||nx>=M||ny>=N) return false;
		return true;
	}

	static class Node{ //������ ������ ������ class
		int x,y,h; //(x,y)��ǥ�� ������ ���� ����

		public Node(int x, int y, int h) {
			super();
			this.x = x;
			this.y = y;
			this.h = h;
		}
		
	}
}
