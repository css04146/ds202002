import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // ó�� ����
		int array[] = new int[n]; 
		int index = 0; // ����
		int top = 0;
		
		int stack[] = new int[1000]; // ���� ���� ����
		String x[] = new String[10000]; // +, - ���� ����
		// +, - ���� ���ڿ� �迭 10000�ڸ� ����
		
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

/* ���ͳݿ� ���ͼ� ������� �����غ����� �� ��
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
