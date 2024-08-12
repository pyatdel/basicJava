package kr.or.ddit.study13.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapExample02 {

	
	public static void main(String[] args) {
		MapExample02 me = new MapExample02();
		me.process();
	}
	
	public void process() {
		List<Map<String, Object>> list = insertData();
		printData(list);
		int max = maxSalary(list);
		int min = minSalary(list);
		System.out.println("월급 최대 값은: "+max);
		System.out.println("월급 최소 값은: "+min);
		selectOne(list, 7521);
		selectDept(list, 30);
		sumDeptSal(list);
	}
	
	public void sumDeptSal(List<Map<String, Object>> list) {
		// 부서별 월급 총합을 구하고 출력하시오.
		Map<Integer, Integer> sumMap = new HashMap();

		for (Map<String, Object> map : list) {
			int    sal    = (int)map.get("SAL");
			int    deptno = (int)map.get("DEPTNO");
			if(sumMap.containsKey(deptno)) {
				sal+=sumMap.get(deptno);
			}
			sumMap.put(deptno, sal);
		}
		
		Iterator<Integer> it = sumMap.keySet().iterator();
		while(it.hasNext()) {
			int key    = it.next();
			int value = sumMap.get(key);
			System.out.println(key+"\t"+value);
		}
		
		
		
	}
	
	public void selectDept(List<Map<String, Object>> list, int dept) {
		// 출력이 안된다.
		for(Map<String, Object> map : list) {
			int empno = (int)map.get("EMPNO");
			String ename = (String)map.get("ENAME");
			String job = (String)map.get("JOB");
			int sal = (int)map.get("SAL");
			int deptno = (int)map.get("DEPTNO");
			if(dept !=deptno) continue;
			System.out.print(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+deptno);
		}
	}
	
	public void selectOne(List<Map<String, Object>> list, int empno) {
//		한 사람의 정보 모두 출력 하기
		
		for(Map<String, Object> map : list) {
			int empno_ = (int)map.get("EMPNO");
			String ename = (String)map.get("ENAME");
			String job = (String)map.get("JOB");
			int sal = (int)map.get("SAL");
			int deptno = (int)map.get("DEPTNO");
			if(empno !=empno_) continue;
			System.out.print(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+deptno);
		}
		
	}
	
	public int minSalary(List<Map<String, Object>> list) {
//		최소값 구하기
		
		int min = Integer.MAX_VALUE;
		for(Map<String, Object> map : list) {
			int sal = (int)map.get("SAL");
			if(min>sal) min = sal;
		}
				
		return min;
	}
	
	public int maxSalary(List<Map<String, Object>> list) {
//		최대값 구하기
		
//		현재 값을 비교해서 더 큰 값일때 저장
		int max = Integer.MIN_VALUE;
		for(Map<String, Object> map : list) {
			int sal = (int)map.get("SAL");
			if(max<sal) max = sal;
		}
		return max;
	}
	public void printData(List<Map<String, Object>> list) {
//		출력해보기
		for(int i=0; i<list.size(); i++) {
// 			System.out.println(list.get(i));
			
			
 				Map<String, Object> emp = list.get(i);
//				System.out.println(emp);
			
			int empno = (int)emp.get("EMPNO");
			String ename = (String)emp.get("ENAME");
			String job = (String)emp.get("JOB");
			int sal = (int)emp.get("SAL");
			int deptno = (int)emp.get("DEPTNO");
			
			System.out.println(empno+"\t"+ename+"\t"+job+"\t"+sal+"\t"+deptno);
			
			
			
		}
		
		
	}

	public List<Map<String, Object>> insertData(){
//		db 데이터를 가져온 형식과 동일
		List<Map<String, Object>> list = new ArrayList();
		
//		Map<String, Object
//		key		-> String 값 컬럼 이름
//		value	-> Object 값 컬럼 실제 값
		
		
		Map<String, Object> emp1 = new HashMap();
		emp1.put("EMPNO", 7369);
		emp1.put("ENAME", "장길동");
		emp1.put("JOB", "프로그래머");
		emp1.put("SAL", 600);
		emp1.put("DEPTNO", 50);
		
		Map<String, Object> emp2 = new HashMap();
		emp2.put("EMPNO", 7499);
		emp2.put("ENAME", "고영우");
		emp2.put("JOB", "시장조사");
		emp2.put("SAL", 550);
		emp2.put("DEPTNO", 20);
		
		Map<String, Object> emp3 = new HashMap();
		emp3.put("EMPNO", 7521);
		emp3.put("ENAME", "구기현");
		emp3.put("JOB", "영업사원");
		emp3.put("SAL", 250);
		emp3.put("DEPTNO", 30);
		
		Map<String, Object> emp4 = new HashMap();
		emp4.put("EMPNO", 7566);
		emp4.put("ENAME", "김동혁");
		emp4.put("JOB", "관리자");
		emp4.put("SAL", 375);
		emp4.put("DEPTNO", 40);
		
		Map<String, Object> emp5 = new HashMap();
		emp5.put("EMPNO", 7654);
		emp5.put("ENAME", "김민욱");
		emp5.put("JOB", "영업사원");
		emp5.put("SAL", 350);
		emp5.put("DEPTNO", 30);

		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		return list;
	}
}
