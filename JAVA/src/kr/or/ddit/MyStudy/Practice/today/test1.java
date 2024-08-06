package kr.or.ddit.MyStudy.Practice.today;

public class test1 {
    int a;
    int b;

    // 기본 생성자
    public test1() {
        this(0, 0);  // 생성자 체인을 통해 두 개의 매개변수를 받는 생성자를 호출
    }

    // 두 개의 매개변수를 받는 생성자
    public test1(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    public static void main(String[] args) {
        test1 example1 = new test1();         // 기본 생성자 호출
        test1 example2 = new test1(10, 20);   // 매개변수가 있는 생성자 호출
    }
}


    

