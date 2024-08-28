package kr.or.ddit.ham.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.ham.dao.HamDao;
import kr.or.ddit.ham.dao.HamDaoImpl;
import kr.or.ddit.ham.vo.MenuVo;

public class HamServiceImpl implements HamService {
	
	private static HamServiceImpl instance;

	private HamServiceImpl() {

	}

	public static HamServiceImpl getInstacne() {
		if (instance == null) {
			instance = new HamServiceImpl();
		}
		return instance;
	}

	private HamDao hamDao = HamDaoImpl.getInstacne();
	
	
	@Override
	public List<Map<String, Object>> getSetMenu() {
		return hamDao.getSetMenu();
	}

	@Override
	public List<MenuVo> getSetSingle(MenuVo menu) {
		return hamDao.getSetSingle(menu);
	}

	@Override
	public void ineserMenu(MenuVo menu) {
		hamDao.ineserMenu(menu);
	}

	@Override
	public List<Map<String, Object>> getGroup() {
		return hamDao.getGroup();
	}

	
	
}
