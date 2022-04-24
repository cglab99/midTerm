package midTerm;

public class MidTerm {

	// 1. 두개의 실수값과 한개의 문자('+', '-', '*', '/')를 매개 변수로 받아 해당하는 문자에 대한 4칙연산을 수행하여 결과를 반환하는 메소드를 작성하세요. 
	private static double calc(double op1, double op2, char optr) {
		double result = 0;
		switch ( optr ) {
		case '+' :
			result = op1 + op2;
			break;
		case '-' :
			result = op1 + op2;
			break;
		case '*' :
			result = op1 * op2;
			break;
		case '/' :
			result = op1 / op2;
			break;
		}
		return result;
	}

	// 2. 삼각함수 값을 계산하는 Math.sin() 메소드를 이용하여 0도에서 180도 까지 5도 단위로 sin 값을 출력하는 프로그램을 작성하세요.
	// Math.sin()의 매개변수는 Radian 값이므로 이를 dgree(도)롤 변경하는 메소드를 다음의 공식을 이용하여 별도로 만드세요.
	// radian = 3.141519 / 180 * dgree
	private static double dgree2Radian(double i) {
		double radian;
		radian = 3.141519 / 180.0 * i  ;
		return radian;
	}
	
	// 3. 문자열로 된 4행 6열의 2차원 배열을 선언하고,  [0,0], [0,1], ... , [3,5] 와 같이 해당 배열의 인덱스 값으로 초기화하는 메소드를 만드세요.   
	private static void initString(String[][] sa) {
		for(int i=0;i<sa.length;i++) {
			for(int j=0;j<sa[i].length;j++) {
				sa[i][j] =  "[" + i + "," + j + "]";
			}
		}
	}

	public static void main(String[] args) {
		// 1. 결과 출력용...
		double op1 = 100;
		double op2 = 200;
		char optr = '+';
		double result = calc( op1, op2, optr);
		System.out.println( result );
		
		// 2. 결과 출력용...
		for(double i = 0; i <= 180 ; i+=5 ) {
			System.out.println( "sin(" + i + "도) = " + Math.sin( dgree2Radian( i ) ) );
		}
		
		// 3. 결과 출력용...
		String sa[][] = new String[4][6];
		initString(sa);
		for(int i=0;i<sa.length;i++) {
			for(int j=0;j<sa[i].length;j++) {
				System.out.print( sa[i][j] );
			}
			System.out.println();
		}
		
		// 4. 
		Circle c = new Circle( 3, 4 );
		c.setRadius(5);
		System.out.println( "둘레 = " + 2 * c.getRadius() * 3.14 );
	}
}

// 4. 원을 정의하는 class를 만드세요. 필드는 중심점 좌표 x, y 와 반지름 radius 를 가지고 이 값들은 class 내부에서만 보이도록 하세요.  
// 반지름의 값을 읽고 지정하는 getRadius와 setRadius 메소드를 만들고, 중심점의 좌표는 생성자를 이용해서 정하도록 하세요.
// 만들어진 클래스를 이용해 중심점이 3.0, 4.0 이고 반지름이 5.0 인 원의 인스턴스를 하나 생성하고 이를 이용해서 원의 둘레를 출력하세요.

class Circle {
	private double x;
	private double y;
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius( double radius ) {
		this.radius = radius;
	}
	public Circle( double x, double y) {
		this.x = x;
		this.y = y;
	}
}
