package step04_method_overloading;

/** 같은 이름의 메서드를 여러 입력 형태로 호출하는 예제입니다. */
public class MethodOverloadingExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int integerResult = calculator.add(10, 20);
        double decimalResult = calculator.add(1.5, 2.25);

        System.out.println("int 덧셈 결과: " + integerResult);
        System.out.println("double 덧셈 결과: " + decimalResult);

        System.out.println();
        System.out.println("1 + 2 + 3 = " + calculator.sum(1, 2, 3));
        System.out.println("1부터 5까지의 합: " + calculator.sum(1, 2, 3, 4, 5));
        System.out.println("인자가 없을 때의 합: " + calculator.sum());
    }
}
