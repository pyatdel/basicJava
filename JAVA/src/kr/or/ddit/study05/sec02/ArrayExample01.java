package kr.or.ddit.study05.sec02;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayExample01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayExample01 obj = new ArrayExample01();
		obj.process();
	}

	public void process() {
//		method1();
//		method2();
//		method3();
//		method4();
//		method5();
//		method6();
//		method7();
//		method8();
//		method9();
//		method10();
//		method11();
//		method12();
		method13();
	}

	public void method1() {
//		변수 5개를 만드세요

		int a1 = 10;
		int a2 = 10;
		int a3 = 10;
		int a4 = 10;
		int a5 = 10;

		int sum = a1 + a2 + a3 + a4 + a5;
		System.out.println(sum);
	}

	public void method2() {
//		변수 5개를 만드세요

//		new => 힙 영역에 데이터를 담을 수 있는 공간을 생성
		int[] arr = new int[5];
		arr[0] = 10;
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;

		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
	}

	public void method3() {
//		배열 선언 방법

//		권장 방법
//		int a;
		int[] arr1 = new int[5];

		int arr2[] = new int[5];

//		int a = 10;
		int[] arr3 = { 1, 2, 3, 4, 5 };
	}

	public void method4() {
//		int 배열을 만들고 90, 80, 77의 값을 입력하세요

		int[] arr = new int[3];
		arr[0] = 90;
		arr[1] = 80;
		arr[2] = 77;

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

		}
		System.out.println("arr의 모든 합은: " + sum + "입니다.");
		double avg = (double) sum / arr.length;
		System.out.println("arr의 평균은: " + avg + "입니다.");
	}

	public void method5() {
//		80 90 87 65 82

		int[] arr1 = new int[5];
		int arr2[] = new int[5];
		int[] arr3 = { 80, 90, 87, 65, 82 };

		arr1[0] = 80;
		arr1[1] = 90;
		arr1[2] = 87;
		arr1[3] = 65;
		arr1[4] = 82;

		arr2[0] = 80;
		arr2[1] = 90;
		arr2[2] = 87;
		arr2[3] = 65;
		arr2[4] = 82;

//		int max = arr1[0];
		int max = Integer.MIN_VALUE;

//		int min = arr1[0];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + "\t");

		}
//		배열 값 중 최대 값 구하기
		for (int i = 0; i < arr1.length; i++) {

			if (max < arr1[i]) {
				max = arr1[i];
			}
			System.out.println("최대 값: " + max);
		}
//		배열 값 중 최소 값 구하기
		for (int i = 0; i < arr1.length; i++) {
			if (min > arr1[i]) {
				min = arr1[i];
			}
			System.out.println("최소 값: " + min);
		}
	}

	public void method6() {
		int[] coin = { 10000, 5000, 1000, 500, 100, 50, 10 };

//		77750 -> 10000*7 + 5000*1 + 1000*2 + 500*1 + 100*2 + 50*1 

		System.out.println("거스름돈 입력: ");
		int money = sc.nextInt();

		for (int i = 0; i < coin.length; i++) {
			int cnt = money / coin[i];
			if (cnt == 0)
				continue;
			if (i == coin.length - 1) {
				System.out.print(coin[i] + " " + cnt + "개, ");
				money %= coin[i];
			}
		}
	}
	
	public void method7() {
//		얕은 복사, 깊은 복사
//		얕은복사 (shallow copy) : 복사된 배열이나 원본 배열이 변경될 때
//								서로간의 값이 같이 변화
//								주소값'만' 복사
								
		int[] source = {1,2,3,4,5};
		int[] target = source;
				
		target[2] = 10;
		
		System.out.println("원본 배열");
		for(int num : source)
			System.out.print(num+"\t");
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int num : target)
			System.out.print(num+"\t");
		System.out.println();
		
	}
	
	public void method8() {
//		깊은 복사(deep copy) : 배열공간을 별도로 확보
//		
//		1. 반복문 이용
//		2. System.arraycopy()
//		3. clone()
		
		int[] source = {1,2,3,4,5};
		int[] target = new int[5];
		
//		1. 반복문 이용(값에 조건을 추가한 후, 복사할 경우..
//		for(int i=0; i<source.length; i++) {
//			target[i] = source[i];
//		}
		
//		2. System.arraycopy() (일부 배열만 복사할 경우..
//		System.arraycopy(source, 2, target, 2, 3);
		
//		3. clone
//		int[] target = source.clone();
		
//		target[2] = 10;
		
		System.out.println("원본 배열");
		for(int num : source)
			System.out.print(num+"\t");
		System.out.println();
		
		System.out.println("복사된 배열");
		for(int num : target)
			System.out.print(num+"\t");
		System.out.println();
		
	}
	
	public void method9() {
//		버블 정렬
//		최악의 경우 횟수 : 배열의 길이 - 1 
//		버블정렬, 선택정렬은 배열을 모두 검색하기 때문에
//		검색 효율이 좋지 않다.
		
		int[] array = {80, 94, 47, 64, 49};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]<array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public void method10() {
//		로또 생성 프로그램
		
		int[] temp = new int[45];
		
//		temp 1~45 숫자 담기
		for(int i=0; i<temp.length; i++) {
			temp[i] = i+1;
		}
//		temp 값 섞기
		for(int i=0; i<10000; i++) {
			int ran = (int)(Math.random()*45);
			int t = temp[0];
			temp[0] = temp[ran];
			temp[ran] = t;
		}
//		6자리 로또 값에 temp 값 0~5까지의 값 복사
		int[] lotto = new int[6];
		System.arraycopy(temp, 0, lotto, 0, 6);
		System.out.print(temp+"\t");
		System.out.print(lotto+"\t");
		
		System.out.print("[");
		for(int l : lotto) {
			System.out.print(l+",");
		}
		
//		숫자 정렬 해보기
		for(int i=0; i<lotto.length-1; i++) {
			for(int j=0; j<lotto.length-1; j++) {
				if(lotto[j] > lotto[j+1]) {
					int t = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = t;
				}
			}
		}
//		정렬 후 출력하기
		
		System.out.print("[");
		for(int l : lotto) {
			System.out.print(l+",");
		}
		System.out.println("]");
	}
	
	public void method11() {
//			stack영역에..			heap 영역에..
		String[] strArray = new String[3];
		
//		heap 영역에 주소값"abc"를 만듭니다.
		String str1 = "abc";
		
		String str2 = "def";
		String str3 = "ghi";
		
//		abc의 주소값이 들어갑니다.
		strArray[0] = str1;
	}
	
	public void method12() {
//		int[] arr = {68, 75, 42, 90, 61};
		int[] arr = {90, 75, 68, 61, 42};
		
		int cnt = 0;
		
		for(int i=0; i<arr.length-1; i++) {
			boolean chk = true;
			for(int j=0; j<arr.length-1; j++) {
				cnt++;
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					chk = false;
				}
			}
			if(chk) break;
			
		}
		System.out.println("반복문 시행 횟수: " + cnt);
		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length; j++) {
//				System.out.println();
			
		
	}
	
	public void method13() {
		int[] arr = {68, 75, 42, 90, 61};
		
		
//		배열 정렬
//		퀵 정렬로 이루어짐
//		Arrays.sort(arr);

		
//		Arrays.toString
//		배열 -> 문자열 변경
		System.out.println(Arrays.toString(arr));
	}
}
