package kr.or.ddit.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F5FileInputStream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis =new FileInputStream("E:/test/abcd.txt");
			
			int data =0; 
			while((data = fis.read()) != -1) {
				System.out.println((char)data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
