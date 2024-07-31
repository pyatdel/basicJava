package kr.or.ddit.study06.sec06;

public class Prod {

//	alt + shift + s , setter -> click
		// 이름, 설명, 가격, 생산일자
	
	
	
//	__________________________________________________________________________(직접 만들어보기)
	
	private String Name;
	private String Menual;
	private int Price;
	private int ManuDate;
	
	public void SetName(String name) {
		this.Name = name;
	}
	
	public void setMenual(String Menual) {
		this.Menual=Menual;
	}
	
	public int getPrice(int price) {
		return price;
	}
	
	public int getManuDate(int manudate) {
		return manudate;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getManuDate() {
		return ManuDate;
	}

	public void setManuDate(int manuDate) {
		ManuDate = manuDate;
	}

	public String getMenual() {
		return Menual;
	}
}
