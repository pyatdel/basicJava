package kr.or.ddit.book;

import java.util.List;

public class BookService {
	private static BookService instance;

	private BookService() {

	}

	public static BookService getInstacne() {
		if (instance == null) {
			instance = new BookService();
		}
		return instance;
	}

	BookDao dao = BookDao.getInstacne();
	
	public void insertBook(List<Object> param) {
		dao.insertBook(param);
	}
	
	public List<BookVo> getList(){
		return dao.getList();
	}
	
}
