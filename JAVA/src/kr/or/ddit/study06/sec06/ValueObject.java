package kr.or.ddit.study06.sec06;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @Data || Getter, Setter, ToString 사용하지 않고도 사용이 가능!
//@Getter
//@Setter
//@ToString
@Data
public class ValueObject {
	private String filed1;
	private int filed2;
	
}

	

	
/*
 * // alt + shift + s , check(x) public ValueObject() { super(); }
 * 
 * // alt + shift + s , using field click public ValueObject(String filed1, int
 * filed2) { super(); this.filed1 = filed1; this.filed2 = filed2; }
 * 
 * // alt + shift + s , getter ans setter click public String getFiled1() {
 * return filed1; }
 * 
 * public void setFiled1(String filed1) { this.filed1 = filed1; }
 * 
 * public int getFiled2() { return filed2; }
 * 
 * public void setFiled2(int filed2) { this.filed2 = filed2; }
 * 
 * // alt + shift + s , toString click
 * 
 * @Override public String toString() { return "ValueObject [filed1=" + filed1 +
 * ", filed2=" + filed2 + "]"; }
 * 
 * }
 */