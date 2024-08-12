package kr.or.ddit.study06.sec02;

public class FieldExample {
	String name=""; 
	int age=1;
	
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * public static void main(String[] args) { FieldExample obj = new
	 * FieldExample(); obj.process(); }
	 * 
	 * public void process() { int age; }
	 */
	
	public void FieldExample(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
