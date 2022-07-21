package Chapter6;

class Student {
    String name;
    int room;
    int num;
    int kor;
    int eng;
    int math;

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() {
        /* float 리터럴
        
         */
        return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
    }
}

public class Q6_3and4 {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.room = 1;
        s.num = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("평균:"+s.getAverage());
    }
}
