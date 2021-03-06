package initializeVariable;

class Product {
    static int count = 0;   // 생성된 인스턴스의 수를 저장하기 위한 변수
    int serialNo;           // 인스턴스 고유의 번호

    {
        ++count;
        serialNo = count;
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();

        System.out.println("p1.serialNo: " + p1.serialNo);
        System.out.println("p2.serialNo: " + p2.serialNo);
        System.out.println("p3.serialNo: " + p3.serialNo);
        System.out.println("생산된 제품의 개수: " + Product.count);
    }
}
