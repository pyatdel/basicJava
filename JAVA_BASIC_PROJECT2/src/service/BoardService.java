package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dao.BoardDao;

public class BoardService {
	private static BoardService instance;

	private BoardService() {

	}

	public static BoardService getInstacne() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}

	BoardDao dao = BoardDao.getInstacne();
	
	public List<Map<String, Object>> codeList() {
		return dao.codeList();
	}
	
	public List<Map<String, Object>> boardList(List<Object> param){
		return dao.boardList(param);
	}
	
	public void boardInsert(List<Object> param) {
		dao.boardInsert(param);
	}
	
	public Map<String, Object> boardDetail(List<Object> param){
		
		List<Object> param2 = new ArrayList();
		param2.add(param.get(1));
		dao.updateCnt(param2);
		
		return dao.boardDetail(param);
	}

	public void boardUpdate(List<Object> param) {
		dao.boardUpdate(param);
	}

	public void boardDelete(List<Object> param) {
		dao.boardDelete(param);
	}
	
}
