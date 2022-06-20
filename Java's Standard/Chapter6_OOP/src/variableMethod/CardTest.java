package variableMethod;

class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "spade";
        c2.number = 4;

        System.out.printf("c1.width: %d, c1.height: %d\n",c1.width,c1.height);
        System.out.printf("c2.width: %d, c2.height: %d\n",c2.width,c2.height);

        // c1의 width만을 대상으로 값을 바꾸었지만 width와 height는 클래스 변수이므로, c2도 바뀐 값이 출력된다.
        // 즉 Card.width, c1.width, c2.width(height도) 모두 같은 저장공간을 참조하기 때문에 같은 값을 갖는 것이다.
        // 클래스 변수의 값을 바꿀 때는 아래 방법처럼 해도 되지만, 일반적으로 아래 방법은 인스턴스 변수를 사용한다고
        // 오해의 소지가 있기 때문에, 클래스이름.클래스변수(Card.width)식으로 접근을 하는 것이 좋다
        c1.width = 50;
        c1.height = 100;

        System.out.printf("c1.width: %d, c1.height: %d\n",c1.width,c1.height);
        System.out.printf("c2.width: %d, c2.height: %d\n",c2.width,c2.height);
    }
}
