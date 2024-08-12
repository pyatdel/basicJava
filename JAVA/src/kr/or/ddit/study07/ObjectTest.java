package kr.or.ddit.study07;

public class ObjectTest {

	/*
	 * 기본적으로 object를 상속받는다 
	 * 모든 클래스의 최상위 클래스
	 * 
	 * override 부모에서 만든 메소드 재정의 오버라이딩과 오버로딩의 차이점
	 * 
	 * 오버로딩 파라미터에 따라 호출 되는 메소드, 생성자가 달라짐 오버라이딩 부모에서 만든 메소드 재정의
	 * 
	 * alt + shift + s > override
	 */
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
