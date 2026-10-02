package step01_class_object;

/**
 * 사람의 상태(필드)와 행동(메서드)을 하나로 묶은 클래스입니다.
 * 클래스는 객체를 만들기 위한 설계도이고, 실제 데이터는 객체마다 따로 가집니다.
 */
public class Person {

    /* 이번 학습에서는 객체의 기본 구조에 집중하기 위해 필드에 직접 값을 넣습니다. */
    public String name;
    public int age;

    /** 현재 객체가 가진 이름과 나이를 사용해 자기소개합니다. */
    public void introduce() {
        System.out.println("안녕하세요. 저는 " + name + "이고, " + age + "살입니다.");
    }

    /** 현재 객체의 나이를 한 살 증가시킵니다. */
    public void celebrateBirthday() {
        age++;
        System.out.println(name + "의 생일입니다. 이제 " + age + "살입니다.");
    }
}
