package kr.or.ddit.file;

import java.io.File;

public class F01FileTest {
	public static void main(String[] args) {
		// File 객체 만들기 
		
		// 1. new File(String 파일 또는 경로명) 
		//  => 디렉토리와 디렉토리 사이 또는 디렉토리와 파일을 구분자는 
		//       '\', 사용하거나 '/'를 사용할수 있다.
		
		File file = new File("E:/test");
		System.out.println("파일 명 : "+file.getName());
		System.out.println("파일 여부 : "+file.isFile());
		System.out.println("디렉토리(폴더) 여부 : "+file.isDirectory());
		System.out.println("=======================================");
		
		// abcd 파일 , efgh 파일 가져오기 
		File abcd = new File("E:/test/abcd.txt");
		System.out.println("파일 이름 : "+abcd.getName());
		System.out.println("부모(폴더) 이름 : "+abcd.getParent());
		System.out.println("파일 크기 : "+abcd.length());
		System.out.println("===============================");
		
		File efgh = new File(file, "efgh.txt");
		System.out.println("파일 이름 : "+efgh.getName());
		System.out.println("부모(폴더) 이름 : "+efgh.getParent());
		System.out.println("파일 크기 : "+efgh.length());
		
		
		// 디렉토리 만들기 
		// 1. mkdir  -> File 객체의 경로 중 마지막 위치의 디렉토리를 만든다 
		//              중간 경로가 모두 미리 만들어져 있어야 한다. 
		// 2. mkdirs -> 중간 경로가 없으면 중간 경로도 새롭게 만든 후 마지막 위치의 
		//              디렉토리를 만들어 준다. 
		
		// 위 두 메소드 모드 만들기 성공하면 true 실패하면 false를 반환함.
		
		File dir1 = new File("E:/test/1/2");
		if(!dir1.exists()) {
			if(dir1.mkdirs()) {
				System.out.println(dir1+"만들기 성공 ");
			}
			else {
				System.out.println(dir1+"만들기 실패");
			}
			
		}
//		File dir2 = new File("E:/test/1");
//		if(dir2.mkdir()) {
//			System.out.println(dir2+"만들기 성공 ");
//		}
//		else {
//			System.out.println(dir2+"만들기 실패");
//		}
//		
	}
}
