package comm.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.util.MybatisUtil;

public class MyBatisDao {
	
	public <T> List<T> selectList(String statement, Object parameter){
		SqlSession session = MybatisUtil.getInstance(true);
		List<T> list = null;
		try {
			list = session.selectList(statement, parameter);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
	
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
	
	public int update(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.update(statement, parameter);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	public int update(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.update(statement);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	public int insert(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.insert(statement, parameter);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	public int insert(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.insert(statement);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	public int delete(String statement, Object parameter) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.delete(statement, parameter );
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	public int delete(String statement) {
		int cnt = 0; 
		SqlSession session = MybatisUtil.getInstance(true);
		try {
			cnt = session.delete(statement);
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	
	
	
	
	
	
}
