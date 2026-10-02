package step05_static_field;

/** 객체별 필드와 모든 객체가 공유하는 static 필드를 비교하는 클래스입니다. */
public class Student {

    /** 학교 이름은 특정 학생이 아니라 Student 클래스 전체가 공유합니다. */
    public static String schoolName = "코덱스 고등학교";

    /** 이름과 점수는 학생 객체마다 별도로 저장됩니다. */
    public String name;
    public int score;

    public void printInformation() {
        System.out.println(name + " / " + schoolName + " / " + score + "점");
    }
}
