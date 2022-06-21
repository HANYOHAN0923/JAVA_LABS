package variableMethod;



public class Method {
    // 매개변수도 메서드 내에 선언된 것으로 지역변수이다.
    // 매개변수의 개수에는 제한이 없지만, 많을 경우 배열이나 참조변수를 사용하자. 값을 입력받을 필요가 없다면 ()에 아무것도 작성하지 않는다
    // 메서드의 이름은 메서드의 기능을 쉽게 알 수 있도록 함축적이면서 의미있는 이름을 짓자
    // 반환 값이 업슨 경우 반환타입으로 'void'를 작성한다
    // 반환타입이 void가 아닌 경우 구현부 안에 반드시 return문이 작성되어야한다 (void 함수에서는 return을 생략 가능 컴파일러가 자동 인식함)
    // 반환타입과 return하는 매개변수의 타입이 같아야 한다
    // 입력 값은 여러개일 수도 있지만, 반환 값은 하나여야한다.
    // {} 안에 작성하는 실행되는 코드들은 메서드의 구현부라고 한다. {} 앞부분은 메서드의 선언부라고 한다.
    static int add(int x, int y) { // 반환(return)타입 메서드이름 (매개변수 선언) { 실행할 코드 }
        int result = x + y; // 지역변수
        return result;
    }

    // add, multiply에 각기 선언된 변수 x, y, result는 이름만 같을 뿐 서로 독립적이며, 다른 변수이다.
    static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    public static void main(String[] args) {
        // 메서드를 정의했어도 호출되지 않으면 아무 일도 일어나지 않는다.
        // 매서드는 메서드이름(값);으로 호출할 수 있다
        // 메서드를 호출할 때 ()안에 들어가는 지정된 값들을 인자 또는 인수라고 한다. 이때 인자의 개수와 순서는 반드시 호출된 메서드에 선언된 매개변수(순서, 타입)와 일치해야한다
        System.out.println(add(1,1));
       int result = multiply(2,2);
       System.out.println(result);
    }
}
