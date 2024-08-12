package service;

import java.util.List;
import java.util.Map;

import dao.MemberDao;

public class MemberService {
	
	private static MemberService instance;

	private MemberService() {

	}

	public static MemberService getInstacne() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}

	MemberDao dao = MemberDao.getInstacne();
	
	public void memberJoin(List<Object> param) {
		dao.memberJoin(param);
	}
	
	public Map<String, Object> login(List<Object> param){
		return dao.login(param);
	}
	
	
}
