package pri_ref_type_parameter;

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x ="+d.x);
        System.out.println("d2.x ="+d2.x);
    }

    static Data copy (Data d) { // copy() 내부에서 생성한 객체를 main()에서 사용하려면 새로운 객체의 주소를 반환해줘야한다.
        Data temp = new Data();
        temp.x = d.x;

        return temp;
    }
}
