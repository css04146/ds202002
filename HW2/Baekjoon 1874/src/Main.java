import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // 처음 숫자
		int array[] = new int[n]; 
		int index = 0; // 수열
		int top = 0;
		
		int stack[] = new int[1000]; // 숫자 넣을 스택
		String x[] = new String[10000]; // +, - 넣을 스택
		// +, - 넣을 문자열 배열 10000자리 생성
		
		for(int i = 0; i <= n; i++) {
			array[i] = scan.nextInt();
		}
		
		for(int i = 1; i <= n; i++) {
			stack[i] = i;
			
			while(stack != null && array[index] == (int)stack[top]) {
				
			}
		}
		if(stack != null) {
			System.out.println("No");
		}
		else
			for(int j = 0; j < x.length; j++) {
				System.out.println(x[j]);
			}
		
		
	}

}

/* 인터넷에 나와서 나름대로 이해해보려고 한 것
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Stack st = new Stack();
		ArrayList array = new ArrayList();
		int index = 0;
		
		int n = scan.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			st.add(i); array.add('+');
			while(!st.isEmpty() && arr[index] == (int)st.peek()) {
				index++;
				st.pop();
				array.add('-');
			}
		}
		if(!st.isEmpty())
			System.out.println("No");
		else
			for(int i = 0; i < array.size(); i++)
				System.out.println(array.get(i));
	}
}
*/
