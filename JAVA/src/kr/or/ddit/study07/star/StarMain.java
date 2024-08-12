package kr.or.ddit.study07.star;

import kr.or.ddit.util.ScanUtil;

public class StarMain {
	public static void main(String[] args) {

		while (true) {
			System.out.println("1. 뮤탈");
			System.out.println("2. 저글링");
			int sel = ScanUtil.nextInt("유닛 선택 : ");

			Unit unit = null;
			if (sel == 1) unit = new Mutal();
			if (sel == 2) unit = new Zuggling();

			System.out.println("1. 이동");
			System.out.println("2. 공격");
			sel = ScanUtil.nextInt("행동 선택 : ");
			if (sel == 1) unit.move();
			if (sel == 2) unit.attack();
		}
	}
}
