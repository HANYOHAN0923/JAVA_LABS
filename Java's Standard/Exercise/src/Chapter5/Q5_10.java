package Chapter5;

public class Q5_10 {
    public static void main(String[] args) {
        char[] abcCode =
                {
                        '`','~','!','@','#','$','%','^','&','*',
                        '(',')','-','_','+','=','|','[',']','{',
                        '}',';',':',',','.','/'
                };

        char[] numCode = {'q','w','e','r','y','u','i','o','p'};

        String src = "abc123";
        String result = "";

        // UNICODE: 'a' = 97, '0' = 48
        // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch > 96) result += abcCode[ch - 97];    //  - 97 대신 - ''a' 사용도 가능하다
            else result += numCode[ch - 48];    // 동일하기 - '0' 사용가능
        }

        System.out.println("src:"+src);
        System.out.println("result:"+result);
    }
}
