package kr.or.ddit.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class F8FileCopy {
	public static void main(String[] args) {
		Path source = Paths.get("E:/test/abcd.txt");
		Path target = Paths.get("E:/test/javaCopy.txt");
		
		try {
			for(String str: Files.readAllLines(source)) {
				System.out.println(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		try {
//			Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
