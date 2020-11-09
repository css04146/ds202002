import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random r = new Random();
		int a = r.nextInt(50); // a는 0부터 50까지의 숫자 중 무작위
		System.out.println(a); // 구간을 설정하기 위해 생성된 범위 확인
		int b[] = new int[a];
		for(int i = 0; i < a; i++) {
			b[i] = r.nextInt(40); // b[i]에 0부터 40까지의 숫자 저장
		}
		
		int min = 50; // 임시 최소값
		int max = -1; // 임시 최대값
		
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
