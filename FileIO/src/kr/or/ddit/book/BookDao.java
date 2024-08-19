package kr.or.ddit.book;

import java.util.List;

import kr.or.ddit.util.JDBCUtil;

public class BookDao {
	private static BookDao instance;

	private BookDao() {

	}

	public static BookDao getInstacne() {
		if (instance == null) {
			instance = new BookDao();
		}
		return instance;
	}

	JDBCUtil jdbc = JDBCUtil.getInstance();
	
	public void insertBook(List<Object> param) {
		String sql =
//				  " MERGE INTO YES24_BOOK \r\n"
//				  + "    USING DUAL\r\n"
//				  + "     ON ( ISBN13 = ?)\r\n"
//				  + "WHEN NOT MATCHED THEN\r\n"
				   "    INSERT YES24_BOOK \r\n"
				  + "    VALUES ( ?, ?, ?, ? ,?, ?, ?, ?,?,?,?,?)  ";
		jdbc.update(sql, param);
	}
	
	public List<BookVo> getList(){
		String sql = "SELECT * FROM YES24_BOOK";
		
		return jdbc.selectList(sql, BookVo.class);
	}
	
	
	
	
}
