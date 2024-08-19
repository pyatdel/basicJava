package kr.or.ddit.file;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class F10BufferInputStream {
	public static void main(String[] args) {
		// BufferInputSteam 
		// 하드디스크에 자주 접촉 하는것은 물리적 손상을 일으킬수 있으며 속도가 느리다. 
		// 따라서 한번 접촉 할때 많은 값을 가져오는것이 속도랑, 물리적으로도 유리하다. 
		
		// 기본적으로 8192 바이트 크기를 가지며 사이즈를 수정할수도 있다.
		
		try {
			FileInputStream fis = new FileInputStream("E:/test/javaCopy.txt");
			
			// 지정 하지 않으면 기본 사이즈 8192, 설정하면 처리속도가 빨라진다
			BufferedInputStream bis = new BufferedInputStream(fis);
			int data =0; 
			while((data = bis.read()) !=-1) {
				System.out.println((char)data);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
