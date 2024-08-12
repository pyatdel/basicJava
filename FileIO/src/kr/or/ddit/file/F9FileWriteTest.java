package kr.or.ddit.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F9FileWriteTest {
	public static void main(String[] args) {
		File folder = new File("//192.168.141.3/JAVA/파일 입출력 테스트/양형운");
		
		if(!folder.exists()) {
			folder.mkdirs();
		}
		
		File f = new File(folder, "test.txt");
		
		FileOutputStream fos = null; 
		try {
			fos = new FileOutputStream(f);
			String str = "test";
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
