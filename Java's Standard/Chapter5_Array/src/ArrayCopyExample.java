public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] arr = new int[5]; // 길이가 5인 배열을 갖는 변수 arr 선언 및 초기화

        // 배열 값에 1~5를 저장
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println("[변경전]");
        System.out.printf("arr.length: %d%n",arr.length); // %n은 개행문자
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d%n", i, arr[i]);
        }

        // arr배열보다 길이가 2배긴 새로운 배열 생성
        int[] temp = new int[arr.length*2];

        // 배열 arr에 저장된 값을 temp배열에 복사
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = temp; // temp에 저장된 값을 arr에 저장

        System.out.println("[변경후]");
        System.out.println("arr.length: "+arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]: %d%n",i,arr[i]);
        }
    }
}
