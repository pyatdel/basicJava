package kr.or.ddit.ham.dao;

import java.util.List;
import java.util.Map;

import comm.dao.MyBatisDao;
import kr.or.ddit.ham.vo.MenuVo;

public class HamDaoImpl extends MyBatisDao implements HamDao {
	
	private static HamDaoImpl instance;

	private HamDaoImpl() {

	}

	public static HamDaoImpl getInstacne() {
		if (instance == null) {
			instance = new HamDaoImpl();
		}
		return instance;
	}

	@Override
	public List<Map<String, Object>> getSetMenu() {
		return selectList("ham.getSetMenu");
	}

	@Override
	public List<MenuVo> getSetSingle(MenuVo menu) {
		return selectList("ham.getSetSingle",menu);
	}

	@Override
	public void ineserMenu(MenuVo menu) {
		insert("ham.insertMenu", menu);
	}

	@Override
	public List<Map<String, Object>> getGroup() {
		return selectList("ham.getGroup");
	}

	
	
}
