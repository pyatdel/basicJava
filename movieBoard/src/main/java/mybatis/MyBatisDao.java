package mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

/**
 * MyBatis를 사용한 데이터베이스(CRUD) 작업을 위한 Data Access Object (DAO) 클래스
 */
public class MyBatisDao {
	
	/**
     * 매개변수가 있는 SELECT 쿼리를 실행하고 결과를 List로 반환
     * @param statement SQL 매핑 구문의 식별자
     * @param parameter 쿼리에 전달할 매개변수
     * @return 쿼리 결과를 담은 List 객체
     * @param <T> 반환될 객체의 타입
     */
	// 제네릭 메서드 : 타입 매개변수를 갖는 메서드
	public <T> List<T> selectList(String statement, Object parameter){
		SqlSession session = MybatisUtil.getInstance(true); // 자동 커밋 모드로 세션 생성
		List<T> list = null;
		try {
			list = session.selectList(statement, parameter);
		} catch (Exception e) {
			e.printStackTrace(); // 예외 발생 시 스택 트레이스 출력
		}finally {
			session.close(); // 세션 리소스 해제
		}
		return list;
	}
	
	/**
     * 매개변수가 없는 SELECT 쿼리를 실행하고 결과를 List로 반환
     * @param statement SQL 매핑 구문의 식별자
     * @return 쿼리 결과를 담은 List 객체
     * @param <T> 반환될 객체의 타입
     */
	public <T> List<T> selectList(String statement){
		SqlSession session = MybatisUtil.getInstance(true);
		List<T> list = null;
		try {
			list = session.selectList(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
	/**
     * 매개변수가 있는 SELECT 쿼리를 실행하고 단일 결과를 반환
     * @param statement SQL 매핑 구문의 식별자
     * @param parameter 쿼리에 전달할 매개변수
     * @return 쿼리 결과 객체
     * @param <T> 반환될 객체의 타입
     */
	public <T> T selectOne(String statement, Object parameter){
		SqlSession session = MybatisUtil.getInstance(true);
		T obj = null;
		try {
			obj = session.selectOne(statement, parameter);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return obj;
	}
	
	/**
     * 매개변수가 없는 SELECT 쿼리를 실행하고 단일 결과를 반환
     * @param statement SQL 매핑 구문의 식별자
     * @return 쿼리 결과 객체
     * @param <T> 반환될 객체의 타입
     */
	public <T> T selectOne(String statement){
		SqlSession session = MybatisUtil.getInstance(true);
		T obj = null;
		try {
			obj = session.selectOne(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return obj;
	}
	
	/**
     * 매개변수가 있는 UPDATE 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @param parameter 쿼리에 전달할 매개변수
     * @return 영향받은 행의 수
     */
	public int update(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(); // 수동 커밋 모드로 세션 생성
		try {
			cnt = session.update(statement, parameter);
			session.commit(); // 수동으로 트랜잭션 커밋
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback(); // 예외 발생 시 롤백
		}finally {
			session.close();
		}
		return cnt;
	}
	
	/**
     * 매개변수가 없는 UPDATE 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @return 영향받은 행의 수
     */
	public int update(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance();
		try {
			cnt = session.update(statement);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	/**
     * 매개변수가 있는 INSERT 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @param parameter 쿼리에 전달할 매개변수
     * @return 영향받은 행의 수
     */
	public int insert(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance();
		try {
			cnt = session.insert(statement, parameter);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	/**
     * 매개변수가 없는 INSERT 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @return 영향받은 행의 수
     */
	public int insert(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance();
		try {
			cnt = session.insert(statement);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	/**
     * 매개변수가 있는 DELETE 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @param parameter 쿼리에 전달할 매개변수
     * @return 영향받은 행의 수
     */
	public int delete(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance();
		try {
			cnt = session.delete(statement, parameter );
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	/**
     * 매개변수가 없는 DELETE 쿼리를 실행
     * @param statement SQL 매핑 구문의 식별자
     * @return 영향받은 행의 수
     */
	public int delete(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance();
		try {
			cnt = session.delete(statement);
			session.commit();
		}catch (Exception e) {
			e.printStackTrace();
			session.rollback();
		}finally {
			session.close();
		}
		return cnt;
	}
}
