package step05_static_field;

/** 인스턴스 필드와 static 필드가 저장되고 공유되는 방식을 비교합니다. */
public class StaticFieldExample {

    public static void main(String[] args) {
        Student firstStudent = new Student();
        firstStudent.name = "김러키";
        firstStudent.score = 90;

        Student secondStudent = new Student();
        secondStudent.name = "이라떼";
        secondStudent.score = 85;

        System.out.println("=== 변경 전 ===");
        firstStudent.printInformation();
        secondStudent.printInformation();

        /* static 필드는 클래스 이름으로 접근해야 클래스 소속이라는 의미가 잘 드러납니다. */
        Student.schoolName = "자바 고등학교";

        System.out.println();
        System.out.println("=== 공유 필드 변경 후 ===");
        firstStudent.printInformation();
        secondStudent.printInformation();

        /* 이름과 점수는 한 객체에서 바꿔도 다른 객체에 영향을 주지 않습니다. */
        firstStudent.score = 100;
        System.out.println("첫 번째 학생 점수: " + firstStudent.score);
        System.out.println("두 번째 학생 점수: " + secondStudent.score);
    }
}
