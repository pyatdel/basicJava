package kr.or.ddit.study07.ani;

import kr.or.ddit.util.ScanUtil;

public class AnimalMain {
	public static void main(String[] args) {
		
		System.out.println("1. 고양이");
		System.out.println("2. 강아지");
		System.out.println("3. 소");
		int sel = ScanUtil.nextInt("선택 : ");
		
		/*if(sel ==1) {
			Cat cat = new Cat();
			cat.cry();
			cat.sing();
		}
		if(sel == 2) {
			Dog dog = new Dog();
			dog.cry();
			dog.sing();*/
		
		
//		다형성
//		부모 클래스를 자식 클래스로 바꿔준다.
//		타입 변환이 자동으로 되기 때문에 가능!
		Animal ani = null;
		if(sel ==1) {
//			Cat cat = new Cat();
//			cat.cry();
//			cat.sing();
			ani = new Cat();
		}
		if(sel == 2) {
//			Dog dog = new Dog();
//			dog.cry();
//			dog.sing();
			ani = new Dog();
		}
		if(sel==3) ani = new Cow();
		ani.cry();
		ani.sing();
		
		
//		강제 형변환 예제
		Cow cow = (Cow)ani;
		
//		큰 값으로 <- 작은 값이 자동 타입 변환
		int i=10;
		long l1 = i;
		
//		작은 값이 <- 큰 값으로 강제 타입 변환
		long l2 = 10;
		int i2 = (int)l2;
	}
}
