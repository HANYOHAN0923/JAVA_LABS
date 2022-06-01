public class ArrayCopyExample2 {
    public static void main(String[] args) {
        char[] abc = {'A','B','C','D'};
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};

        System.out.println(abc);
        System.out.println(num);


        // 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다
        char[] result = new char[abc.length+num.length];    // 길이 먼저 만들어주기
        System.arraycopy(abc, 0, result, 0, abc.length);    // abc[0]에서부터의 데이터를 result[0]으로 abc.length개 복사
        System.out.println(result);
        System.arraycopy(num, 0, result, abc.length, num.length);     // num[0]에서부터의 데이터를 result[abc.length]으로 num.length개 복사
        System.out.println(result);

        System.arraycopy(abc, 0, num, 0, abc.length);   // abc[0]에서부터의 데이터를 num[0]위치부터 배열 abc의 길이만큼 데이터를 복사
        System.out.println(num);

        System.arraycopy(abc, 0, num, 6, 3);    // num의 인덱스 6위치부터 abc의 데이터를 차례대로 3개 복사
        System.out.println(num);

        // 다른 배열과 달리 char배열은 for문을 사용하지 않고 print()나 println()으로 배열에 모든 요소들을 출력할 수 있다
    }
}
