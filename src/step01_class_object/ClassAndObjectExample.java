package step01_class_object;

/**
 * 클래스, 객체, 인스턴스, 참조 변수의 관계를 확인하는 첫 번째 예제입니다.
 */
public class ClassAndObjectExample {

    public static void main(String[] args) {
        /* new Person()은 Person 설계도를 바탕으로 사용할 객체를 만듭니다. */
        Person person1 = new Person();
        person1.name = "김러키";
        person1.age = 20;

        /* 같은 클래스로 객체를 하나 더 만들면 서로 독립된 필드 공간을 가집니다. */
        Person person2 = new Person();
        person2.name = "이라떼";
        person2.age = 18;

        System.out.println("=== 서로 다른 두 객체 ===");
        person1.introduce();
        person2.introduce();

        System.out.println();
        System.out.println("=== 객체의 상태 변경 ===");
        person1.celebrateBirthday();
        person2.celebrateBirthday();

        /* 한 객체의 필드가 바뀌어도 다른 객체의 필드는 영향을 받지 않습니다. */
        System.out.println("person1의 나이: " + person1.age);
        System.out.println("person2의 나이: " + person2.age);
    }
}
