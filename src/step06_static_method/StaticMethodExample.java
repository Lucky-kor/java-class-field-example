package step06_static_method;

/** static 메서드의 호출 방법과 static 초기화 블록의 실행 시점을 확인합니다. */
public class StaticMethodExample {

    public static void main(String[] args) {
        /* static 메서드는 객체를 만들지 않고 클래스 이름으로 호출합니다. */
        System.out.println("3 + 5 = " + MathUtils.add(3, 5));
        System.out.println("4의 제곱 = " + MathUtils.square(4));

        System.out.println();
        System.out.println("AppConfig를 처음 사용합니다.");

        /* 첫 static 필드 접근 직전에 AppConfig의 static 블록이 한 번 실행됩니다. */
        System.out.println("버전: " + AppConfig.version);
        System.out.println("버전 재확인: " + AppConfig.version);
    }
}
