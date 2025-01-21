package day02.operation;

public class Operator {

	public static void main(String[] args) {
//		연산자
//		1. 최우선 연산자
//		소괄호()로 감싼 식을 가장 먼저 한다는 의미로
//		학교 수학시간에도 나오는 개념이다.
//		더 많이 감싼 소괄호()부터 먼저 계산한다.
//		int a = 3 * (1 + 2); // 3 * (3)
		
//		5. 대입(할당) 연산자, 복합할당 연산자
//		대입 연산자=는 좌항의 변수(저장공간)에
//		피연산자 우항 값이 저장된다.
		int b1 = 3;
//		이때 좌항의 저장공간에 담긴 값은 새로운 우항의 값으로
//		덮어쓰기 된다. -> 변수:값 = 1:1
		
//		기존변수에 담긴 값에 연산을 할 수는 없을까?
		b1 = b1 + 2; // 3 + 2
//		System.out.println(b1); // 5
		
//		복합 할당 연산자
//		좌항의 변수에 담긴 값에 추가적인 연산만 작성하여
//		변수명을 중복으로 작성하는 코드를 개선하고자 만든 연산자다.
//		+=, -=, *=,...
		b1 = 3;
//		b1 = b1 + 2;
		b1 += 2;
//		System.out.println(b1); // 5
		
//		2. 증감 연산자
//		단항 연산자의 한 종류로
//		변수의 앞이나 뒤에 붙어 그 값을 1씩 증가/감소 시킨다.
//		증감 뿐만 아니라 하나의 값으로 취급되어 사용되기 한다.
		int num1 = 3;
//		num1 = num1 + 1;
//		num1 += 1;
//		단순 변수의 값 1 증감
		++num1; // 전위
//		혹은
		num1++; // 후위

//		전위 증감 연산자
//		변수의 앞에 ++ 혹은 --가 붙어
//		변수를 1 증가/감소 시킨 뒤 그 값을 사용하는 연산자다.
		num1 = 1;
		
		// num1의 값을 1 증가 시킨 결과값을
		// num2의 값으로 대입한다.
		int num2 = ++num1; // 2
		// 선 증감, 후 사용
		
		// 후위 연산자
		num1 = 1;
		
		// num1의 값을 사용한 후
		// num1의 값을 1 증가시킨다.
		num2 = num1++;
		// 선 사용, 후 증감
		
//		3. 산술 연산자
//		기본적으로 이항 연산자에 속한 연산자들로,
//		덧셈, 뺄셈, 곱셈 등 사칙 연산을 포함한
//		산술 연산을 하는 연산자들을 통칭하는 말이다.
//		덧셈, 뺄셈
//		+ -
//		곱셈, 나눗셈(몫)
//		* /
//		덧셈 뺄셈보다 먼저 연산하는 산술 연산자로
//		나눗셈의 경우 정수 나눗셈은 몫 연산자로도 불린다.
//		실수 나눗셈은 단순 나눗셈이다.
		int b = 3 * 2; // 3 x 2 => 6
//		System.out.println(b); // 6
		
//		정수 나눗셈 -> 몫
		int c = 10 / 3; // 3...1
		System.out.println("10 / 3 = "+ c); // 3
		
//		실수 나눗셈 -> 단순 나눗셈
		double d = 10.0 / 3.0; // 3.33333333333..5
		System.out.printf("%.2f", d); // 3.33
		
//		나머지
//		%
//		a에서 b를 나눴을 때, 딱 떨어지는 몫과
//		b보다 작게 남는 나머지 값 중 나머지를 반환한다.
//		※ 주로 a가 b의 배수인지 여부를 판별할 때 사용한다.
//		a % b == 0 -> a가 b의 배수다.(배수관계)
		System.out.println(12 % 3); // 0
//		음수 연산의 경우 나머지가 음수가 될 수 있다.
		System.out.println(-12 % 5); // -2
		
//		4. 관계 연산자(비교 연산자)
//		두 값이 같은지, 다른지, 큰지, 작은지 등
//		두 값의 관계를 true와 false로 결과값을 반환하는
//		연산자들을 가리킨다.
		
//		같니? 다르니?
//		==, !=
		System.out.println("3 == 3 = " + (3 == 3)); // true
		System.out.println("3.0 != 3 = "+ (3.0 != 3)); // false
		
//		문자열의 경우
//		문자열은 ==이나 !=으로 비교할 수 없다.
//		.equals(비교할 문자열)
//		위의 함수를 사용하여 문자열간의 동일 여부를 판단할 수 있다.
		String s = new String("홍길동"); // 문자열 선언(길게 쓰는 방식)
		System.out.println("홍길동" == s); // false
		// 문자열 ==은 주소값을 비교한다.
		
		// 문자열의 실제값 비교
		System.out.println(s.equals("홍길동"));
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2);
		
//		크니? 작니?(초과, 미만)
//		>, <
		System.out.println(10 > 5); // 네 -> true
		System.out.println(10 < 3); // 아니오 -> false
		System.out.println(10 > 10);// 아니오 -> false 
		
//		이상 이하
//		>=, <=
//		같은지 여부도 포함한다.
//		같니? 도 같이 물어본다.
		System.out.println(10 >= 5); // 네 -> true
		System.out.println(10 <= 5); // 아니오 -> false
		System.out.println(10 >= 10);// 네 -> true
		
//		5. 논리연산자
//		5-1. 논리부정연산자
//		!를 논리값 앞에 붙여 그 값을 반전시키는 단항 연산자의 일종이다.
//		예) !true == false, !false == true
		boolean isTrue = true;
		System.out.println(!isTrue); // true의 반전인 false가 출력된다.
		
//		5-2. AND
//		논리곱이라고도 불리는 연산자로, 엠퍼샌드(&)를 두 번 적은 것을 의미하며
//		A && B 와 같이 두 항을 좌우 두고 연산을 하는 이항 연산자다.
//		이때, 두 값(A, B)이 모두 참(true)이면 그 결과 참이고
//		그 외의 경우는 모두 거짓이다.(A와 B는 반드시 논리값이어야 한다.)
//		집합의 개념으로는 교집합, 기계어 입장에서는 논리곱의 연산과 같다.
//		즉, 1x1 = 1이기 때문에 모두 참(1)이어야 결과가 참(1)이 나온다
//		하나라도 거짓이면 0x1=0 거짓(0)이 된다.
		boolean and1 = true && true; // true
		System.out.printf("and1 %s\n", and1);
		boolean and2 = true && false; // false
		System.out.printf("and2 %s\n", and2);
		boolean and3 = false && false; // false
		System.out.printf("and3 %s\n", and3);
		
//		5-3. OR
//		논리합이라고도 불리는 연산자로, shift와 Enter 위에 있는 \를 누르면
//		나오는 |(버티컬 바)를 두 번 쓰면 된다.
//		논리합은 연산자를 중심으로 두 항 중 하나라도 참이면 그 결과 참
//		모두 거짓이어야 비로소 거짓을 반환한다.
//		집합으로는 합집합의 개념과 유사하며 기계어 입장에서는 논리합(합연산)과
//		그 결과가 같다.
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || false); // false
		
//		삼항 연산자
//		주어지는 조건식의 결과에 따라 그 반환값을 사용자가 직접 지정하는
//		조금은 특별한 연산자다.
//		[조건식] ? [참일 경우 반환될 값] : [거짓일 경우 반환될 값]
		num1 = 5; num2 = 15; 
		// 두 값을 비교하여 더 큰 값을 반환하는 삼항 연산자 예제
		int bigOne = num1 > num2 ? num1 : num2;
		System.out.println(bigOne);
		
//		그외 배우지 않은 연산자
//		비트 연산자, 쉬프트 연산자
	}

}
