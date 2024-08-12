package service;

import java.util.List;

import controller.MainController;
import dao.MemberDao;
import vo.MemberVo;

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
	
	public boolean login(List<Object> param) {
		MemberVo member = dao.login(param);
		if(member == null) return false;
		MainController.session.put("member", member);
		
		return true;
	}
	
	
}
