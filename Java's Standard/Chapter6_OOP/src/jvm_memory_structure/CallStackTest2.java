package jvm_memory_structure;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("");
        firstMethod();
        System.out.println("");
    }

    static void firstMethod() {
        System.out.println("");
        secondMethod();
        System.out.println("");
    }

    static void secondMethod() {
        System.out.println();
        System.out.println();
    }
}
