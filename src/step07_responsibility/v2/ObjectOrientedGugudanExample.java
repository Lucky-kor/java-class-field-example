package step07_responsibility.v2;

/**
 * 계산 역할과 출력 역할을 나눈 객체를 조합해 구구단을 실행합니다.
 */
public class ObjectOrientedGugudanExample {

    public static void main(String[] args) {
        GugudanPrinter printer = new GugudanPrinter();
        GugudanCalculator calculator = new GugudanCalculator();

        /*
         * main은 전체 실행 순서만 조정합니다.
         * 계산은 GugudanCalculator, 출력은 GugudanPrinter가 담당합니다.
         */
        for (int dan = 2; dan <= 4; dan++) {
            printer.printTitle(dan);

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                int result = calculator.multiply(dan, multiplier);
                printer.printCalculation(dan, multiplier, result);
            }

            printer.printBlankLine();
        }
    }
}
