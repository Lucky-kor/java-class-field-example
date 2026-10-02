package step07_responsibility.v2;

/**
 * 이미 계산된 구구단 결과를 어떤 형식으로 보여 줄지 담당하는 클래스입니다.
 */
public class GugudanPrinter {

    public void printTitle(int dan) {
        System.out.println("[" + dan + "단]");
    }

    public void printCalculation(int dan, int multiplier, int result) {
        System.out.printf("%d x %d = %d%n", dan, multiplier, result);
    }

    public void printBlankLine() {
        System.out.println();
    }
}
