package exam02;

public class Ex04 {
    public static void main(String[] args) {

        Transpotation BUS =Enum.valueOf(Transpotation.class, "BUS");
        //valueOf 메서드 Enum.valueOf() 메서드는 Enum 클래스의 정적 메서드이므로 모든 열거형 클래스에서 사용할 수 있습니다
// Transpotation.class은 Java에서 클래스 리터럴(class literal)을 나타냅니다. 클래스 리터럴은 클래스의 메타데이터에 대한 참조를 나타내며, 해당 클래스의 타입 정보를 가져올 수 있습니다.
      //  클래스 리터럴(class literal)은 Java에서 특정 클래스의 타입 정보를 나타내는 특별한 형태의 표현입니다. 클래스 리터럴은 클래스의 이름을 사용하여 해당 클래스의 메타데이터에 대한 참조를 나타냅니다.

        Transpotation TAXI = Transpotation.valueOf("TAXI");
        //valueOf() 메서드는 특정 열거형 클래스에서만 사용할 수 있는 메서드입니다.

    }
}// 리플렉션(reflection)은 자바 프로그램이 런타임(runtime)에 자신의 구조를 검사하고 수정할 수 있는 능력을 의미합니다. 이것은 클래스, 인터페이스, 메서드, 필드 및 배열 등의 요소들에 대한 정보를 동적으로 가져오고 조작할 수 있는 기능을 제공합니다.
//리플렉션은 java.lang.reflect 패키지에 포함되어 있으며, 다음과 같은 주요 기능을 제공합니다:
