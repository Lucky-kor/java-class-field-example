# 자바 클래스와 객체 학습 가이드

이 프로젝트는 자바의 클래스와 객체, 필드와 메서드, `static`, 객체의 역할 분리를 순서대로 학습하기 위한 예제입니다.
이번 학습 범위에서는 생성자와 캡슐화를 다루지 않습니다. 객체를 직접 만들고 필드에 값을 넣어 보면서 **객체가 상태와 행동을 함께 가진다**는 점을 이해하는 데 집중합니다.

각 코드를 실행하기 전에 출력 결과와 필드 값의 변화를 먼저 예상해 보세요. 실행 후에는 어떤 객체의 어떤 필드가 바뀌었는지 말로 설명해 보는 것이 좋습니다.

## 학습 목표

이 프로젝트를 모두 학습하면 다음 내용을 설명할 수 있어야 합니다.

- 클래스와 객체의 차이를 설명할 수 있다.
- 클래스로 여러 객체를 만들고 각 객체에 서로 다른 값을 저장할 수 있다.
- 필드와 지역 변수의 차이를 설명할 수 있다.
- 객체의 필드와 메서드를 사용해 상태와 행동을 표현할 수 있다.
- 매개변수, 인자, 반환값, `void`를 구분할 수 있다.
- 메서드 오버로딩과 가변 인자를 사용할 수 있다.
- 인스턴스 필드와 `static` 필드의 차이를 설명할 수 있다.
- `static` 메서드와 `static` 초기화 블록의 실행 방식을 설명할 수 있다.
- 계산과 출력처럼 서로 다른 역할을 별도 클래스로 나눌 수 있다.

## 권장 학습 순서

| 순서 | 실행 클래스 | 핵심 주제 |
| --- | --- | --- |
| 1 | `step01_class_object.ClassAndObjectExample` | 클래스, 객체, 필드, 메서드 |
| 2 | `step02_object_state.ObjectStateExample` | 객체의 상태와 행동, 필드 기본값 |
| 3 | `step03_method_basic.MethodBasicExample` | 매개변수, 인자, 반환값, `void` |
| 4 | `step04_method_overloading.MethodOverloadingExample` | 오버로딩과 가변 인자 |
| 5 | `step05_static_field.StaticFieldExample` | 인스턴스 필드와 `static` 필드 |
| 6 | `step06_static_method.StaticMethodExample` | `static` 메서드와 초기화 블록 |
| 7-1 | `step07_responsibility.v1.ProceduralGugudanExample` | 한 메서드에 모인 계산과 출력 |
| 7-2 | `step07_responsibility.v2.ObjectOrientedGugudanExample` | 계산 역할과 출력 역할 분리 |

핵심 단계를 마친 뒤에는 다음 두 예제를 선택해서 볼 수 있습니다.

| 추가 예제 | 실행 클래스 | 살펴볼 내용 |
| --- | --- | --- |
| 참조값 복사 | `supplementary.reference_copy.ReferenceCopyExample` | 두 변수가 같은 객체를 가리키는 경우 |
| 싱글턴 | `supplementary.singleton.SingletonExample` | `static`을 이용한 객체 하나의 공유 |

> 싱글턴 예제에는 다음 주에 배울 생성자와 접근 제어자가 일부 등장합니다. 이번에는 필수 단계가 아니며, `getInstance()`가 같은 객체를 돌려준다는 결과만 가볍게 관찰해도 충분합니다.

## 예제 실행 방법

### IntelliJ IDEA에서 실행

1. `src` 폴더에서 학습할 패키지를 순서대로 엽니다.
2. 이름이 `Example`로 끝나는 Java 파일을 엽니다.
3. `main` 메서드 왼쪽의 실행 아이콘을 누릅니다.
4. 아래쪽 **Run** 창에서 출력 결과를 확인합니다.

### 터미널에서 실행

프로젝트 루트에서 모든 소스를 컴파일한 뒤 원하는 예제를 실행할 수 있습니다.

```bash
mkdir -p out/learning
javac -d out/learning $(find src -name "*.java")
java -cp out/learning step01_class_object.ClassAndObjectExample
```

다른 예제를 실행하려면 마지막 줄의 클래스 이름을 학습 순서 표에 있는 이름으로 바꿉니다.

## 1. 클래스와 객체

학습 파일:

- [`src/step01_class_object/Person.java`](src/step01_class_object/Person.java)
- [`src/step01_class_object/ClassAndObjectExample.java`](src/step01_class_object/ClassAndObjectExample.java)

### 클래스는 무엇인가?

클래스는 객체가 어떤 데이터를 가지고 어떤 동작을 할 수 있는지 코드로 정의한 것입니다.

```java
public class Person {
    public String name;
    public int age;

    public void introduce() {
        System.out.println("안녕하세요. 저는 " + name + "입니다.");
    }
}
```

- `name`, `age`: 객체가 기억할 상태인 필드
- `introduce()`: 객체가 실행할 행동인 메서드

### 클래스로 객체 만들기

```java
Person person1 = new Person();
person1.name = "김러키";
person1.age = 20;
```

`new Person()`을 실행하면 `Person` 클래스에 정의된 필드와 메서드를 사용할 수 있는 객체가 만들어집니다. 점(`.`)을 이용해 객체의 필드와 메서드에 접근합니다.

같은 클래스로 여러 객체를 만들 수 있습니다.

```java
Person person1 = new Person();
Person person2 = new Person();
```

`person1`과 `person2`는 서로 다른 객체입니다. 따라서 한 객체의 나이를 바꾸어도 다른 객체의 나이는 바뀌지 않습니다.

### 직접 해보기

- 두 사람의 이름과 나이를 원하는 값으로 바꿉니다.
- 세 번째 `Person` 객체를 만들고 자기소개를 실행합니다.
- `person1.celebrateBirthday()`만 두 번 호출한 뒤 두 객체의 나이를 비교합니다.
- `Person`에 `String hobby` 필드와 취미를 출력하는 메서드를 추가합니다.

## 2. 객체의 상태와 행동

학습 파일:

- [`src/step02_object_state/Car.java`](src/step02_object_state/Car.java)
- [`src/step02_object_state/ObjectStateExample.java`](src/step02_object_state/ObjectStateExample.java)

### 필드는 객체의 현재 상태를 나타낸다

`Car` 객체는 다음과 같은 상태를 가집니다.

```java
public String model;
public String color;
public int price;
public boolean running;
public int speed;
```

객체를 만든 직후 값을 직접 넣지 않은 필드는 타입에 맞는 기본값을 가집니다.

| 필드 타입 | 기본값 |
| --- | --- |
| `int` 등 숫자 타입 | `0` |
| `boolean` | `false` |
| `String` 등 참조 타입 | `null` |

따라서 새 자동차 객체의 `running`은 `false`, `speed`는 `0`입니다.

### 메서드는 객체의 상태를 사용하거나 바꾼다

```java
public void accelerate() {
    if (!running) {
        System.out.println("먼저 시동을 켜세요.");
        return;
    }

    speed += 10;
}
```

`accelerate()`는 같은 객체의 `running`을 확인하고 `speed`를 바꿉니다. 호출할 때 `car.accelerate()`라고 작성하면 `car`가 가리키는 자동차 객체의 필드가 사용됩니다.

예제에서는 다음 순서로 상태가 변합니다.

1. 자동차 객체를 만들면 시동은 꺼져 있고 속도는 0이다.
2. 시동을 켜지 않은 가속 요청은 속도를 바꾸지 않는다.
3. `start()`가 `running`을 `true`로 바꾼다.
4. `accelerate()`를 호출할 때마다 속도가 10씩 증가한다.
5. 속도가 0이 된 뒤 `stop()`을 호출하면 시동이 꺼진다.

### 직접 해보기

- 각 메서드 호출 뒤 `running`과 `speed` 값을 종이에 적습니다.
- `accelerate()` 호출 횟수를 바꾸고 마지막 속도를 예상합니다.
- `brake()`를 한 번 더 호출해도 속도가 음수가 되지 않는지 확인합니다.
- 자동차 객체를 하나 더 만들고 두 자동차의 속도가 따로 변하는지 확인합니다.

## 3. 메서드 기본

학습 파일:

- [`src/step03_method_basic/Calculator.java`](src/step03_method_basic/Calculator.java)
- [`src/step03_method_basic/MethodBasicExample.java`](src/step03_method_basic/MethodBasicExample.java)

### 메서드의 구조

```java
public int add(int firstNumber, int secondNumber) {
    int result = firstNumber + secondNumber;
    return result;
}
```

- `public`: 메서드에 접근할 수 있는 범위
- `int`: 반환하는 값의 타입
- `add`: 메서드 이름
- `firstNumber`, `secondNumber`: 전달된 값을 받을 매개변수
- `return result`: 계산 결과를 호출한 곳으로 돌려주는 부분

### 인자와 매개변수

```java
int result = calculator.add(10, 20);
```

호출할 때 전달하는 `10`, `20`을 인자라고 합니다. 메서드가 이 값을 받기 위해 선언한 `firstNumber`, `secondNumber`를 매개변수라고 합니다.

호출 흐름은 다음과 같습니다.

1. `10`이 `firstNumber`에 전달된다.
2. `20`이 `secondNumber`에 전달된다.
3. 두 값을 더해 `result`에 저장한다.
4. `return`으로 결과를 호출한 곳에 돌려준다.
5. 돌려받은 값이 실행 클래스의 `result`에 저장된다.

### void 메서드

호출한 곳에 돌려줄 값이 없는 메서드는 반환 타입으로 `void`를 사용합니다.

```java
public void printWelcomeMessage() {
    System.out.println("계산을 시작합니다.");
}
```

출력도 메서드가 할 수 있는 동작이지만, 출력한 문장을 호출한 곳에 값으로 반환하지는 않습니다.

### 직접 해보기

- 두 수를 빼는 `subtract` 메서드를 추가합니다.
- 두 수를 곱하는 `multiply` 메서드를 추가합니다.
- `calculator.add(-10, 3)`의 결과를 예상합니다.
- 반환값을 변수에 저장하는 방식과 바로 출력하는 방식을 각각 사용합니다.

## 4. 메서드 오버로딩과 가변 인자

학습 파일:

- [`src/step04_method_overloading/Calculator.java`](src/step04_method_overloading/Calculator.java)
- [`src/step04_method_overloading/MethodOverloadingExample.java`](src/step04_method_overloading/MethodOverloadingExample.java)

### 메서드 오버로딩

이름이 같아도 매개변수의 타입, 개수 또는 순서가 다르면 여러 메서드를 선언할 수 있습니다.

```java
public int add(int firstNumber, int secondNumber)
public double add(double firstNumber, double secondNumber)
```

정수를 전달하면 첫 번째 메서드가, 실수를 전달하면 두 번째 메서드가 호출됩니다.

반환 타입만 바꾸는 것은 오버로딩이 아닙니다.

```java
// 두 메서드의 매개변수가 같으므로 함께 선언할 수 없습니다.
int add(int firstNumber, int secondNumber)
double add(int firstNumber, int secondNumber)
```

### 가변 인자

```java
public int sum(int... numbers) {
    int result = 0;
    for (int number : numbers) {
        result += number;
    }
    return result;
}
```

`int...`를 사용하면 호출할 때 `int` 인자를 0개 이상 전달할 수 있습니다. 메서드 안에서 `numbers`는 배열처럼 사용할 수 있습니다.

```java
calculator.sum();
calculator.sum(1, 2, 3);
calculator.sum(1, 2, 3, 4, 5);
```

### 직접 해보기

- `add(int, int, int)`를 추가하고 오버로딩되는지 확인합니다.
- 여러 `double` 값을 더하는 `sum(double... numbers)`를 추가합니다.
- `sum()`이 왜 `0`을 반환하는지 반복문의 실행 횟수로 설명합니다.
- 반환 타입만 다른 `add`의 주석을 해제해 컴파일 오류를 확인한 뒤 되돌립니다.

## 5. 인스턴스 필드와 static 필드

학습 파일:

- [`src/step05_static_field/Student.java`](src/step05_static_field/Student.java)
- [`src/step05_static_field/StaticFieldExample.java`](src/step05_static_field/StaticFieldExample.java)

### 객체마다 따로 가지는 필드

`name`과 `score`는 객체마다 별도로 존재하는 인스턴스 필드입니다.

```java
Student firstStudent = new Student();
firstStudent.name = "김러키";
firstStudent.score = 90;

Student secondStudent = new Student();
secondStudent.name = "이라떼";
secondStudent.score = 85;
```

첫 번째 학생의 점수를 바꿔도 두 번째 학생의 점수는 바뀌지 않습니다.

### 클래스가 하나만 가지는 필드

`schoolName`은 `static`이 붙은 클래스 필드입니다.

```java
public static String schoolName = "코덱스 고등학교";
```

`Student` 객체를 여러 개 만들어도 `schoolName`은 하나이며 모든 객체가 공유합니다. 값을 바꾸면 두 학생을 출력할 때 모두 변경된 학교 이름이 나타납니다.

```java
Student.schoolName = "자바 고등학교";
```

static 필드는 객체 변수로도 접근할 수 있지만 클래스 소속이라는 점이 잘 보이도록 `Student.schoolName`처럼 클래스 이름으로 접근하는 것이 좋습니다.

### 직접 해보기

- 학생 객체를 하나 더 만들고 세 객체의 학교 이름을 출력합니다.
- 첫 번째 학생의 이름만 바꾸고 다른 학생에게 영향이 없는지 확인합니다.
- `schoolName`을 두 번 변경하면서 모든 객체의 출력이 어떻게 달라지는지 확인합니다.
- `static int studentCount`를 추가하고 값을 직접 증가시켜 봅니다.

## 6. static 메서드와 초기화 블록

학습 파일:

- [`src/step06_static_method/MathUtils.java`](src/step06_static_method/MathUtils.java)
- [`src/step06_static_method/AppConfig.java`](src/step06_static_method/AppConfig.java)
- [`src/step06_static_method/StaticMethodExample.java`](src/step06_static_method/StaticMethodExample.java)

### static 메서드

static 메서드는 특정 객체가 아니라 클래스에 속합니다. 따라서 객체를 만들지 않고 클래스 이름으로 호출합니다.

```java
int result = MathUtils.add(3, 5);
int square = MathUtils.square(4);
```

`MathUtils`의 계산은 객체마다 다른 필드 값을 사용하지 않습니다. 이처럼 공통으로 사용할 동작을 static 메서드로 만들 수 있습니다.

### static 초기화 블록

```java
static {
    version = "1.0.0";
    System.out.println("AppConfig 클래스 초기화 완료");
}
```

static 초기화 블록은 클래스가 처음 사용될 때 한 번 실행됩니다. 예제에서는 `AppConfig.version`을 처음 읽기 직전에 초기화 메시지가 출력됩니다. 같은 프로그램 안에서 다시 읽어도 초기화 블록은 반복 실행되지 않습니다.

### 직접 해보기

- `MathUtils`에 두 수 중 큰 값을 반환하는 `max` 메서드를 추가합니다.
- `AppConfig`에 static 필드 `appName`을 추가하고 초기화 블록에서 값을 넣습니다.
- `AppConfig.version`을 출력하기 전과 후에 문장을 출력해 초기화 시점을 확인합니다.
- 프로그램을 다시 실행하면 초기화 메시지가 다시 나타나는 이유를 생각해 봅니다.

## 7. 계산 역할과 출력 역할 분리

비교할 파일:

- [`src/step07_responsibility/v1/ProceduralGugudanExample.java`](src/step07_responsibility/v1/ProceduralGugudanExample.java)
- [`src/step07_responsibility/v2/GugudanCalculator.java`](src/step07_responsibility/v2/GugudanCalculator.java)
- [`src/step07_responsibility/v2/GugudanPrinter.java`](src/step07_responsibility/v2/GugudanPrinter.java)
- [`src/step07_responsibility/v2/ObjectOrientedGugudanExample.java`](src/step07_responsibility/v2/ObjectOrientedGugudanExample.java)

### v1: 한 메서드가 모든 일을 하는 코드

v1의 `main` 메서드는 다음 일을 모두 합니다.

1. 몇 단을 출력할지 결정한다.
2. 반복문을 실행한다.
3. 두 수를 곱한다.
4. 출력 문장을 만든다.
5. 결과를 출력한다.

프로그램이 작을 때는 충분히 이해하기 쉬운 구조입니다. 그러나 계산 방법이나 출력 형식이 복잡해지면 한 메서드의 코드가 계속 길어질 수 있습니다.

### v2: 역할을 나눈 코드

v2에서는 계산과 출력을 서로 다른 클래스가 담당합니다.

| 클래스 | 담당 역할 |
| --- | --- |
| `GugudanCalculator` | 전달받은 두 수를 곱한다. |
| `GugudanPrinter` | 제목, 계산식, 빈 줄을 출력한다. |
| `ObjectOrientedGugudanExample` | 반복문을 실행하고 두 객체를 함께 사용한다. |

```java
int result = calculator.multiply(dan, multiplier);
printer.printCalculation(dan, multiplier, result);
```

실행 클래스는 계산기 객체에게 계산을 요청하고, 출력 객체에게 결과 출력을 요청합니다. 객체가 서로의 메서드를 호출하며 하나의 프로그램을 완성하는 것을 객체의 협력이라고 볼 수 있습니다.

v1이 틀린 코드이고 v2만 정답이라는 뜻은 아닙니다. 프로그램의 크기와 변경 가능성을 고려해 역할을 나눌 필요가 있는지 판단해야 합니다.

### 직접 해보기

- v1과 v2의 출력 결과가 같은지 확인합니다.
- 2단부터 4단이 아니라 5단부터 7단을 출력하도록 바꿉니다.
- 출력 기호를 `x`에서 `*`로 바꿀 때 어느 클래스를 수정하는지 확인합니다.
- `GugudanCalculator`에 제곱을 계산하는 메서드를 추가합니다.
- `GugudanPrinter`에 구분선을 출력하는 메서드를 추가합니다.

## 추가 예제 1. 참조값 복사

학습 파일: [`src/supplementary/reference_copy/ReferenceCopyExample.java`](src/supplementary/reference_copy/ReferenceCopyExample.java)

이 예제는 핵심 학습 단계를 마친 뒤 보는 보충 자료입니다.

```java
Person original = new Person();
Person copiedReference = original;
```

두 번째 줄에는 `new`가 없습니다. 새 객체를 만드는 대신 `original`이 가진 참조값을 `copiedReference`에 복사합니다. 따라서 두 변수는 같은 `Person` 객체를 가리킵니다.

```java
copiedReference.name = "김행운";
System.out.println(original.name); // 김행운
```

`copiedReference`를 통해 필드를 바꾸었지만 `original`로 읽어도 변경된 값이 보입니다. 두 개의 변수가 있을 뿐, 실제 `Person` 객체는 하나이기 때문입니다.

### 직접 해보기

- `original == copiedReference`가 `true`인 이유를 설명합니다.
- `Person another = new Person();`을 추가하고 `original == another`를 비교합니다.
- 종이에 객체 하나와 그 객체를 가리키는 변수 두 개를 그려 봅니다.

## 추가 예제 2. 싱글턴

학습 파일:

- [`src/supplementary/singleton/AppSettings.java`](src/supplementary/singleton/AppSettings.java)
- [`src/supplementary/singleton/SingletonExample.java`](src/supplementary/singleton/SingletonExample.java)

싱글턴은 프로그램에서 객체 하나를 만들어 공유하는 방식입니다. 기존 프로젝트의 `static` 응용 예제를 보존하되 핵심 단계에서는 제외했습니다.

```java
AppSettings first = AppSettings.getInstance();
AppSettings second = AppSettings.getInstance();
```

두 호출은 같은 객체를 반환하므로 `first == second`의 결과는 `true`입니다. 첫 번째 변수를 통해 `theme`을 바꾸면 두 번째 변수에서도 변경된 값이 보입니다.

이 예제에 있는 `private AppSettings()`의 정확한 의미와 외부에서 객체 생성을 제한하는 방법은 다음 주 생성자·캡슐화 학습에서 자세히 다루는 것이 좋습니다. 지금은 필수 실습으로 진행하지 않아도 됩니다.

## 핵심 용어 정리

| 용어 | 의미 |
| --- | --- |
| 클래스 | 객체가 가질 필드와 메서드를 정의한 코드 |
| 객체 | 클래스를 바탕으로 실제 사용할 수 있게 만든 대상 |
| 필드 | 객체 또는 클래스가 저장하는 값 |
| 인스턴스 필드 | 객체마다 따로 만들어지는 필드 |
| static 필드 | 클래스에 하나만 존재하며 모든 객체가 공유하는 필드 |
| 메서드 | 값을 받아 처리하거나 객체의 상태를 사용하는 코드 묶음 |
| 매개변수 | 메서드가 호출될 때 값을 받는 변수 |
| 인자 | 메서드를 호출할 때 실제로 전달하는 값 |
| 반환값 | 메서드가 처리를 마치고 호출한 곳에 돌려주는 값 |
| 오버로딩 | 같은 이름으로 매개변수가 다른 메서드를 여러 개 선언하는 것 |

## 전체 학습을 마친 뒤 확인할 질문

1. 클래스와 객체는 무엇이 다른가?
2. 같은 클래스로 만든 두 객체의 필드 값이 서로 다른 이유는 무엇인가?
3. `Car`의 `accelerate()`는 어떤 필드를 읽고 어떤 필드를 바꾸는가?
4. 인자와 매개변수는 어떤 차이가 있는가?
5. 반환 타입이 `int`인 메서드와 `void`인 메서드는 무엇이 다른가?
6. 메서드 이름이 같을 때 오버로딩이 가능하려면 무엇이 달라야 하는가?
7. `Student.schoolName`을 바꾸면 모든 학생에게 같은 값이 보이는 이유는 무엇인가?
8. static 메서드는 왜 객체를 만들지 않고 호출할 수 있는가?
9. 구구단 v2에서 계산 클래스와 출력 클래스는 각각 어떤 일을 담당하는가?

답하기 어려운 질문이 있다면 해당 예제를 다시 실행하고, 메서드를 호출하기 전후의 필드 값을 직접 출력해 확인해 보세요.
