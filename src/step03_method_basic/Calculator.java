package step03_method_basic;

/** 매개변수로 값을 받고 결과를 반환하는 계산기 클래스입니다. */
public class Calculator {

    /** 두 정수를 더한 값을 호출한 곳으로 반환합니다. */
    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    /** 반환할 값이 없는 메서드는 반환 타입으로 void를 사용합니다. */
    public void printWelcomeMessage() {
        System.out.println("계산을 시작합니다.");
    }
}
