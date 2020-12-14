import java.util.Random;
import java.util.Scanner;
// 개선 이후의 알고리즘 소스코드
public class Segment {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random r = new Random(100000);
		int index = scan.nextInt();
		int a[] = new int[index];
		for(int i = 0; i < a.length; i++) {
			a[i] = r.nextInt();
		}
		int b = scan.nextInt();
		for(int i = 0; i < b; i++) {
			int c = scan.nextInt();
			int d = scan.nextInt();
			long t1 = System.currentTimeMillis();
			System.out.println(max_index(c, d, a) + ", " + min_index(c, d, a) + ", " + sum_index(c, d, a));
			long t2 = System.currentTimeMillis();
			System.out.println(t2 - t1); // 지난 시간
		}

	}
	
	static int max_index(int a, int b, int c[]) {
		if(a == b)
			return c[a];
		int mid = (a + b)/2;
		int low = mid;
		int high = mid + 1;
		int ans = max(max_index(a, low, c), max_index(high, b, c));
		
		return ans;
	}
	static int min_index(int a, int b, int c[]) {
		if(a == b)
			return c[a];
		int mid = (a + b)/2;
		int low = mid;
		int high = mid + 1;
		int ans = min(min_index(a, low, c), min_index(high, b, c));
		
		return ans;
	}
	static int sum_index(int a, int b, int c[]) {
		if(a == b)
			return c[a];
		int mid = (a + b)/2;
		int low = mid;
		int high = mid + 1;
		int ans = sum(sum_index(a, low, c), sum_index(high, b, c));
		return ans;
	}
	
	static int max(int a, int b) {
		if(a >= b)
			return a;
		else
			return b;
	}
	
	static int min(int a, int b) {
		if(a >= b)
			return b;
		else
			return a;
	}
	
	static int sum(int a, int b) {
		return a + b;
	}
}