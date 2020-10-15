import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int top = -1;
		
		for(int i = 0; i < a; i++) {
			
			String pp = scan.next();
			if(isValid(pp)) System.out.println("Yes");
			else System.out.println("No");

		}
	}
	
	public static boolean isValid(String pp) {
		
		char stack[] = new char[1024];
		int top = -1;
		
		for(int i = 0; i < pp.length(); i++) {
			char ch = pp.charAt(i);
			if(ch == '(') {
				stack[++top] = ch;
			}
			
			else if(ch == ')') {
				if(top == -1|| stack[top]!='(') return false;
				
				top--;
			}
			
		}
		
		return top == -1;
	}
}
