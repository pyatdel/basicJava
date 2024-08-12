package kr.or.ddit.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F7FileCopy {
	public static void main(String[] args) {
		FileInputStream fis = null;

		String fileStr = "";
		try {
			fis = new FileInputStream("E:/test/abcd.txt");
			int data =0; 
			while((data = fis.read())!=-1) {
				fileStr+=(char)data;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(fileStr);
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("E:/test/javaCopy.txt");
			fos.write(fileStr.getBytes());
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
