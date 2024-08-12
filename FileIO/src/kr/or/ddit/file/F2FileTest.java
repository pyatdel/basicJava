package kr.or.ddit.file;

import java.io.File;
import java.io.IOException;

public class F2FileTest {
	public static void main(String[] args) {
		F2FileTest obj = new F2FileTest();
		obj.process();
	}
	
	public void process() {
//		File f = new File("E:\\A_TeachingMaterial\\01_Java\\workspace\\Java");
//		findFile(f);
		
		File f = new File("E:/test/java.txt");
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void findFile(File f) {
		if(f.isDirectory()) {
//			String[] fStr = f.list();
			File[] files = f.listFiles();
			for (File file : files) {
				findFile(file);
			}
		}
		else {
			if(f.getName().endsWith(".java")) {
				System.out.println(f);
			}
		}
	}
	
}
