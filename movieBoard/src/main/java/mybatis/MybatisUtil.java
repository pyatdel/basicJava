package mybatis;

import java.io.Reader;
import java.nio.charset.Charset;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//MyBatis 설정을 초기화하고 SqlSession 객체를 제공하는 유틸리티 클래스
public class MybatisUtil {
	
	// SqlSessionFactory 객체를 저장하는 정적 변수
	// SqlSessionFactory는 무거운 작업이므로 한 번만 생성
	private static SqlSessionFactory sessionFactory;
	
	// 정적 초기화 블록: 클래스가 로딩될 때 한 번만 실행됨
	static {
		try 
		// MyBatis 설정 파일 경로 지정 및 읽기
					//  { Reader rd = Resources.getResourceAsReader("config/mybatis-config.xml");
		(Reader rd = Resources.getResourceAsReader("config/mybatis-config.xml")) {
			
		
			// MyBatis 설정 파일을 읽어오는 과정 
			
			// 현재 사용 중인 클래스 로더 정보 출력 (디버깅 목적)
			// try - catch문에서 오류를 확인할 수 있게 하기 위함
			System.out.println(Resources.getDefaultClassLoader());
			
			// UTF-8 인코딩 설정 (한글 처리를 위함)
			// mybatis-config.xml
			Charset charSet = Charset.forName("UTF-8");
			Resources.setCharset(charSet);
			
			// 읽어온 설정 정보로 SqlSessionFactory 객체 생성
			/* 내부 동작 순서:
			 * 1. XML 설정 파일 파싱
			 * 2. 환경 설정 및 데이터베이스 연결 정보 로드
			 * 3. 매퍼 XML 파일 로드 및 파싱
			 * 4. 설정 정보 객체화
			 * 5. SqlSessionFactory 인스턴스 생성
			 */
			sessionFactory = new SqlSessionFactoryBuilder().build(rd);
			
			// 사용이 끝난 Reader 객체 닫기 (리소스 해제)
			// rd.close();
			
		} catch (Exception e) {
			// 예외 발생 시 스택 트레이스 출력
			e.printStackTrace();
		}
	}
	
	/**
	 * SqlSession 객체를 제공하는 팩토리 메소드 
	 * @return SqlSession 객체
	 */
	public static SqlSession getInstance() {
		// 기본 값은 autocommit : false
		return sessionFactory.openSession();
	}
	
	
	/**
	 * SqlSession 객체를 제공하는 팩토리 메소드 
	 * @param autoCommit 오토커밋 여부
	 * @return SqlSession 객체
	 */
	public static SqlSession getInstance(boolean autoCommit) {
		return sessionFactory.openSession(autoCommit);
	}
	
	/**
	 * SqlSession 객체를 제공하는 팩토리 메소드
	 * @param autoCommit 오토커밋 여부, 기본값은 false
	 * @return SqlSession 객체
	 */
	
	/*
	 * 위 두 개 생략
	public static SqlSession getInstance(boolean autoCommit = false) {
	    return sessionFactory.openSession(autoCommit);
	}
	*/
}
