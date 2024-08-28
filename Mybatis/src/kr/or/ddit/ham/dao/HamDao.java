package kr.or.ddit.ham.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.ham.vo.MenuVo;

public interface HamDao {
	
	public List<Map<String, Object>> getSetMenu();
	
	public List<MenuVo> getSetSingle(MenuVo menu);
	
	public void ineserMenu(MenuVo menu);
	
	public List<Map<String, Object>> getGroup();
	
}
