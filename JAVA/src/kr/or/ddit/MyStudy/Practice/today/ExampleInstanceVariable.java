package kr.or.ddit.MyStudy.Practice.today;

public class ExampleInstanceVariable {
    int a;
    int b;

    // 생성자
    public ExampleInstanceVariable(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("생성자 호출: a = " + this.a + ", b = " + this.b);
    }

    // 인스턴스 변수 a를 설정하는 메서드
    public void setA(int a) {
        this.a = a;
        System.out.println("setA 호출: a = " + this.a);
    }

    // 인스턴스 변수 a를 출력하는 메서드
    public void printA() {
        System.out.println("printA 호출: a = " + this.a);
    }

    public static void main(String[] args) {
        // 생성자를 통해 초기화
        ExampleInstanceVariable obj = new ExampleInstanceVariable(1, 2);
        obj.printA();  // 

        // 메서드를 통해 값 변경
        obj.setA(10);
        obj.printA();  // 
    }
}
