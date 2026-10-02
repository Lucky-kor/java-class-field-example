package step06_static_method;

/** 클래스가 처음 사용될 때 실행되는 static 초기화 블록을 보여 줍니다. */
public class AppConfig {

    public static String version;

    static {
        version = "1.0.0";
        System.out.println("AppConfig 클래스 초기화 완료");
    }
}
