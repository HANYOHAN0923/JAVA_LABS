package initializeVariable;

class Document {
    static int count = 0;
    String name;

    Document() {    // 문서 생성 시 문서명이 없을 때
        this("untitled" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println("문서 " + this.name + "가 생성되었습니다.");
    }
}

public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("Java.txt");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
