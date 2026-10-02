package step02_object_state;

/**
 * 한 객체 안의 필드와 메서드가 함께 자동차의 상태를 표현하는 예제입니다.
 */
public class ObjectStateExample {

    public static void main(String[] args) {
        Car car = new Car();

        /* 만들어진 객체의 필드에 자동차의 상태를 저장합니다. */
        car.model = "Model 3";
        car.color = "Blue";
        car.price = 55_000_000;

        System.out.println("=== 자동차 정보 ===");
        System.out.println("모델: " + car.model);
        System.out.println("색상: " + car.color);
        System.out.println("가격: " + car.price + "원");
        System.out.println("처음 시동 상태: " + car.running); // false
        System.out.println("처음 속도: " + car.speed + "km/h"); // 0

        System.out.println();
        System.out.println("=== 자동차의 행동 ===");
        car.accelerate();
        car.start();
        car.accelerate();
        car.accelerate();
        car.stop();
        car.brake();
        car.brake();
        car.stop();
    }
}
