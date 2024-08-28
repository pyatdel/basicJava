package kr.or.ddit.ham.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.ham.vo.MenuVo;

public interface HamService {
	public List<Map<String, Object>> getSetMenu();
	
	public List<MenuVo> getSetSingle(MenuVo menu);
	
	public void ineserMenu(MenuVo menu);
	
	public List<Map<String, Object>> getGroup();
	
}
