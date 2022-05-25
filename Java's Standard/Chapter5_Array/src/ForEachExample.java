public class ForEachExample {
    public static void main(String[] args) {
        String[] member = {"chaewon","yuri","yena"};

        // 일반적인 for문
        for (int i = 0; i < member.length; i++) {
            System.out.println(member[i]);
        }

        // forEach => for (type var : iterate) {} (var은 매개변수 파라미터)
        for (String i : member) {
            System.out.println(i);
        }
    }
}
