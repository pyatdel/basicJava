package service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import dao.BoardDao;
import vo.BoardVo;	

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

	public List<Map<String, Object>> codeList(){
		return dao.codeList();
	}
	
	public List<Map<String, Object>> boardList(List<Object> param){
		return dao.boardList(param);
				
	}
	
	public List<BoardVo> boardList2(List<Object> param){
		return dao.boardList2(param);
	}
	
	public int lastNum(List<Object> param){
		// 서비스 로직 처리 
		Map<String, Object> map = dao.lastNum(param);
		BigDecimal lastNum = (BigDecimal) map.get("LASTNUM");
		return lastNum.intValue();
	}

	public void insertBoard(List<Object> param) {
		dao.insertBoard(param);
	}
	
	
	
}
