package step03_method_basic;

/** 메서드의 선언과 호출, 매개변수와 반환값을 확인하는 예제입니다. */
public class MethodBasicExample {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printWelcomeMessage();

        /* 10과 20은 인자이고, 메서드가 값을 받을 변수는 매개변수입니다. */
        int result = calculator.add(10, 20);

        System.out.println("10 + 20 = " + result);

        /* 반환값은 변수에 저장하지 않고 바로 사용할 수도 있습니다. */
        System.out.println("3 + 5 = " + calculator.add(3, 5));
    }
}
