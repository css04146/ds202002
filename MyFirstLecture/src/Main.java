public class Main {
	// public은 공개되어있다는 의미로 이 파일 이외에서 해당 클래스를 사용할 수 있음을 의미
	// 아무것도 붙이지 않으면 자동으로 private가 선언된 것으로 본다
	// private가 붙어있으면 외부 파일에서 해당 클래스를 사용할 수 없다
	// class Main은 Main이라는 클래스를 의미한다.
	// Main 클래스는 인간사회에서 보면 "학생"이라는 집합체를 규정하는 명칭이라고 보면 좋다.
	public static void main(String[] args) { // Entry Point 
		// Main 함수는 자바 프로젝트 실행하면 가장 먼저 실행되는 함수이다.
		// static이 붙은 경우네는 클래스 오브젝트와 상관없이 실행하거나 참조할 수 있음을 의미한다.
		// 핫키
		// syso + ( Ctrl + Space ) => System ~ )"
		// import 자동완성 => ( Ctrl + Shift + O )
		// Run => ( Ctrl + F11 )
		// TODO Auto-generated method stub
		
		//
		System.out.println("Hello World!"); // API
		System.out.println("한글 출력");
		System.out.println("나의 나이는 " + 20 + "입니다.");
	}

}