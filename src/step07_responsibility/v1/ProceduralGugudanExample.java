package step07_responsibility.v1;

/**
 * 계산, 반복, 출력이 main 메서드 한곳에 모여 있는 구구단 예제입니다.
 */
public class ProceduralGugudanExample {

    public static void main(String[] args) {
        /*
         * 작은 프로그램에서는 이해하기 쉽지만, 출력 형식이나 계산 규칙이 복잡해지면
         * main 메서드가 여러 책임을 떠안아 수정하고 테스트하기 어려워질 수 있습니다.
         */
        for (int dan = 2; dan <= 4; dan++) {
            System.out.println("[" + dan + "단]");

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                int result = dan * multiplier;
                System.out.printf("%d x %d = %d%n", dan, multiplier, result);
            }

            System.out.println();
        }
    }
}
