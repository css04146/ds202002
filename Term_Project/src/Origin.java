import java.util.Random;
import java.util.Scanner;
// 개선하기 이전의 소스코드
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
		
		System.out.println("데이터의 개수 : " + a);
		System.out.println("구간의 개수 : " + c);
		
		int[] d = new int[c]; // 구간별 시작 구간
		int[] e = new int[c]; // 구간별 간격
		
		for(int i = 0; i < c; i++) {
			d[i] = scan.nextInt();
			e[i] = scan.nextInt();
		}
		
		long[] min = new long[c]; // 구간별 최소값
		long[] max = new long[c]; // 구간별 최대값
		long[] sum = new long[c]; // 구간별 합계
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < c; i++) {
			
			int temp_max = 0; // 임시 최대값
			int temp_min = 100000; // 임시 최소값
			int temp_sum = 0; // 임시 합계
			
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
			System.out.println("최소값 : " + min[k] + ", 최대값 : " + max[k] + ", 합계 : " + sum[k]);
		}
		long t2 = System.currentTimeMillis() - t1;
		System.out.println(t2);
		// K를 고정, N을 변화
		// N을 고정, K를 변화
		
	}
	
}
