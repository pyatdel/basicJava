package kr.or.ddit.study05.sec03;

public enum Month {
	JANUARY("1월"),FABRUARY("2월"), MARCH("3월"), APRIL("4월"), 
	MAY("5월"), JUNE("6월"), JULY("7월"), AUGUST("8월"), 
	SEPTEMBER("9월"), OCTOBER("10월"), NOVEMBER("11월"), DECEMBER("12월");
	
	String num;
	Month(String num){
		this.num = num;
	}
}
