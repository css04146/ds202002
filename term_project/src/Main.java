import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int a = r.nextInt(50); // a�� 0���� 50������ ���� �� ������
		System.out.println(a); // ������ �����ϱ� ���� ������ ���� Ȯ��
		int b[] = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = r.nextInt(40); // b[i]�� 0���� 40������ ���� ����
		}
		
		int min = 50; // �ӽ� �ּҰ�
		int max = -1; // �ӽ� �ִ밪
		
		Scanner scan = new Scanner(System.in);
		int c = scan.nextInt();
		int d = scan.nextInt();
		
		
		for(int i = c; i <= d; i++) {
			if(b[i] > max)
				max = b[i];
			if(b[i] < min)
				min = b[i];
		}
		
		System.out.println("min : " + min);
		System.out.println("max : " + max);
		
		System.err.println(max + min);
		
	}

}
