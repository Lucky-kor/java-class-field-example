package step04_method_overloading;

/** 메서드 오버로딩과 가변 인자를 확인하기 위한 계산기 클래스입니다. */
public class Calculator {

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    /** 이름은 같지만 매개변수 타입이 다르므로 오버로딩할 수 있습니다. */
    public double add(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /** int...는 int 인자를 0개 이상 받을 수 있는 가변 인자입니다. */
    public int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    /* 반환 타입만 다른 메서드는 오버로딩할 수 없습니다. */
    // public double add(int firstNumber, int secondNumber) {
    //     return firstNumber + secondNumber;
    // }
}
