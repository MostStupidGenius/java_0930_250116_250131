package day05.functional.lambda;

public class AnonymousFunction {

	public static void main(String[] args) {
		// 함수형 프로그래밍
		// 같은 값을 넣으면 항상 같은 값이 나오는 함수를
		// 순수함수라고 한다.
		// 이러한 순수함수에서 다음 순수함수로 연계된 형태로
		// 데이터가 전달되고 정제되어 결과값을 내놓는 형태의
		// 프로그래밍 방식을 함수형 프로그래밍이라고 한다.

		// 함수형 프로그래밍의 시작은
		// 익명 함수, 익명 메서드인 람다식으로 시작한다.
		// 람다식이란
		// 메서드, 함수를 간단하고 직관적으로 필요한 정보만 기재하여
		// 이름이 없는 형태로 작성된 함수를 가리킨다.
		// 이름이 없어서 익명 메서드라고도 부른다.
		// 이름이 없기 때문에 기본적으로 재사용이 불가능하다.

		// 람다식 표현방법
		// (param1, param2,...) -> {로직 작성}
		// 위와 같이 선언부 중 반환값과 메서드 이름을 작성하지 않고
		// 매개변수의 이름과 타입을 적고
		// 화살표연산자->의 뒤에 바디{}를 작성하는 방식으로
		// 함수를 선언, 사용할 수 있다.

		// 람다식은 익명 함수이기 때문에
		// 단독으로 선언 후 사용을 할 수 없다.
		// 함수를 인수로 요구하는 함수에 인수로 전달되거나
		// 인터페이스를 통해 익명 클래스의 메서드로 구현될 때
		// 사용될 수 있다.

		// 람다식의 인터페이스를 통한 선언
		// Runnable 인터페이스를 이용해야 한다.
		// Runnable 인터페이스는 매개변수 없이 기능만 수행한 후
		// 종료하는 추상 메서드를 보유한 인터페이스이다.
		Runnable r = () -> {
			System.out.println("내용 출력");
		};
		r.run();
		// 추상 메서드의 이름이 run이다.

	}

}
