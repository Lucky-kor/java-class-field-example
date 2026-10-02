package step02_object_state;

/**
 * 자동차의 상태를 필드로, 자동차가 할 수 있는 일을 메서드로 표현한 클래스입니다.
 */
public class Car {

    /* 객체를 만들면 참조 타입은 null, 숫자는 0, boolean은 false로 시작합니다. */
    public String model;
    public String color;
    public int price;
    public boolean running;
    public int speed;

    /** 시동이 꺼져 있으면 켜고, 이미 켜져 있으면 현재 상태를 알려 줍니다. */
    public void start() {
        if (running) {
            System.out.println("이미 시동이 켜져 있습니다.");
            return;
        }

        running = true;
        System.out.println("시동을 켭니다.");
    }

    /** 자동차가 정차한 경우에만 시동을 끕니다. */
    public void stop() {
        if (speed > 0) {
            System.out.println("주행 중입니다. 먼저 정차하세요.");
            return;
        }

        running = false;
        System.out.println("시동을 끕니다.");
    }

    /** 시동이 켜져 있으면 속도를 10km/h 높입니다. */
    public void accelerate() {
        if (!running) {
            System.out.println("먼저 시동을 켜세요.");
            return;
        }

        speed += 10;
        System.out.println("가속합니다. 현재 속도: " + speed + "km/h");
    }

    /** 속도를 10km/h 낮추되 0보다 작아지지 않게 합니다. */
    public void brake() {
        if (speed >= 10) {
            speed -= 10;
        } else {
            speed = 0;
        }
        System.out.println("감속합니다. 현재 속도: " + speed + "km/h");
    }
}
