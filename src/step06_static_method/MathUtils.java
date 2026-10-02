package step06_static_method;

/** 객체별 상태 없이 공통으로 사용할 계산 기능을 제공하는 클래스입니다. */
public class MathUtils {

    public static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int square(int number) {
        return number * number;
    }
}
