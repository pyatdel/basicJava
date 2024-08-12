package kr.or.ddit.study13.list;

public class CustumArrayList {

	private String[] strList;
	private int size;
	
	public CustumArrayList() {
		strList = new String[10];
	}
	
	public CustumArrayList(int size) {
		strList = new String[size];
		this.size = size;
	}
	
	public void add(String str) {
		// 자동 확장
		if(size == strList.length) {
			String[] tempList = new String[size+10];
			System.arraycopy(strList, 0, tempList, 0, size);
			strList = tempList;
		}
		strList[size++] = str;
	}
	
	public String get(int num) {
		return strList[num];
	}
	
	public int size() {
		return size;
	}
	
	// 1 2 3 4 5
	// 1 2 x  4 5
	public String remove(int num) {
		String result = get(num);
		String[] tempList = new String[strList.length];
		System.arraycopy(strList, 0, tempList, 0, num);
		System.arraycopy(strList, num+1, tempList, num, strList.length-num-1);
		strList = tempList;
		size--;
		return result;
	}
	
	
	
	
}
