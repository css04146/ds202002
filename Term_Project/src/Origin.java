import java.util.Random;
import java.util.Scanner;
// �����ϱ� ������ �ҽ��ڵ�
public class Origin {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random(1000000);
		int a = scan.nextInt();
		
		int b[] = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = r.nextInt();
		}
		int c = scan.nextInt();
		
		System.out.println("�������� ���� : " + a);
		System.out.println("������ ���� : " + c);
		
		int[] d = new int[c]; // ������ ���� ����
		int[] e = new int[c]; // ������ ����
		
		for(int i = 0; i < c; i++) {
			d[i] = scan.nextInt();
			e[i] = scan.nextInt();
		}
		
		long[] min = new long[c]; // ������ �ּҰ�
		long[] max = new long[c]; // ������ �ִ밪
		long[] sum = new long[c]; // ������ �հ�
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < c; i++) {
			
			int temp_max = 0; // �ӽ� �ִ밪
			int temp_min = 100000; // �ӽ� �ּҰ�
			int temp_sum = 0; // �ӽ� �հ�
			
			for(int j = d[i]; j <= d[i] + e[i] - 1; j++) {
				if(temp_max < b[j]) {
					temp_max = b[j];
				}
			}
			for(int j = d[i]; j <= d[i] + e[i] - 1; j++) {
				if(temp_min > j) {
					temp_min = b[j];
				}
			}
			for(int j = d[i]; j <= d[i] + e[i] - 1; j++) {
				temp_sum += b[j];
			}
			
			min[i] = temp_min;
			max[i] = temp_max;
			sum[i] = temp_sum;
			
		}
		for(int k = 0; k < c; k++) {
			System.out.println("�ּҰ� : " + min[k] + ", �ִ밪 : " + max[k] + ", �հ� : " + sum[k]);
		}
		long t2 = System.currentTimeMillis() - t1;
		System.out.println(t2);
		// K�� ����, N�� ��ȭ
		// N�� ����, K�� ��ȭ
		
	}
	
}
