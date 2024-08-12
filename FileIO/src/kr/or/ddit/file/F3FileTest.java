package kr.or.ddit.file;

import java.io.File;

public class F3FileTest {
	public static void main(String[] args) {
		File f1 = new File("test/a");

		File f2 = new File(f1.getParent()+"/b");
		System.out.println(f2);
		System.out.println(f2.getAbsolutePath());
		// ..<- 상위 폴더 
		// .<- 현재 폴더 
	}
}
