package typeConversion;

public class ForEx1 {
	public static void main(String[] args) {
		// 반복할 횟수를 알고 찍는 경우 for문을 사용
		
		// 3번 이라는 값을 정수를 저장할 방이름을 지어주셔야 함.
		// 무조건 방이름을 i로 지으세요. 여기서의 i라는 것은
		// 색인(순서 매겨서 찾아간다.) 몇번째(1번째, 2번째, 3번째)
		// 어딘가에 이 방(변수명)을 초기화 해놔야 함.
		
		// for(조;조;) {}
		
		//for(int i=1; i<=3; i++) {
		//	System.out.println("hi");
		//}
		
		for(int i=0; i<3; i++) {
			System.out.println("hi");
		}
		
		System.out.println("for밖의 영역");
	}

}
