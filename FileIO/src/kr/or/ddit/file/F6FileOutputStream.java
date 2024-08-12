package kr.or.ddit.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F6FileOutputStream {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		
		try {
			fos = new  FileOutputStream("E:/test/javaWrite.txt");
			String str = "abcde";
			fos.write(str.getBytes());
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
