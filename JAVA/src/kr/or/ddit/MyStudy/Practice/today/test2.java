package kr.or.ddit.MyStudy.Practice.today;

public class test2 {
    int a;
    int b;

    // 생성자
    public test2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 인스턴스 변수 a를 설정하는 메서드
    public void setA(int a) {
        this.a = a;  // 인스턴스 변수 a에 매개변수 a를 할당
    }

    // 인스턴스 변수 a를 출력하는 메서드
    public void printA() {
        System.out.println("a : " + this.a);  // 인스턴스 변수 a를 출력
    }
    
    public static void main(String[] args) {
        test2 example = new test2(1, 2);  // 생성자를 통해 객체 생성
        example.setA(10);  // 인스턴스 변수 a를 10으로 설정
        example.printA();  // 인스턴스 변수 a를 출력
    }
    
}


    

