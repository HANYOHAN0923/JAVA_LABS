package Chapter6;

public class Q6_5 {
    public static void main(String[] args) {
        Students s = new Students("홍길동", 1, 1, 100, 60, 76);

        System.out.println(s.info());
    }
}

class Students {
    String name;
    int room;
    int num;
    int kor;
    int eng;
    int math;

    Students(String name, int room, int num, int kor, int eng, int math) {
        this.name = name;
        this.room = room;
        this.num = num;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() {
        return kor + eng + math;
    }

    float getAverage() { return (int)(getTotal() / 3f * 10 + 0.5f) / 10f; }

    String info() {
        return name + "," + room + "," + num + "," + kor + "," + eng + "," + math + "," + getTotal() + "," + getAverage();
    }
}
