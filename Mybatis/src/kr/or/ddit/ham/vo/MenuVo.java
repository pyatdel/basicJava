package kr.or.ddit.ham.vo;

import lombok.Data;

@Data
public class MenuVo {
	private int menu_no;
	private String menu_name;
	private int group_no;
	private String memu_image;
	private int memu_price;
	
	// menu_group 조인된 컬럼
	private String group_name;
	
}
