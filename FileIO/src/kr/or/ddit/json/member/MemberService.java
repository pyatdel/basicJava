package kr.or.ddit.json.member;

import java.util.List;
import java.util.Map;

public class MemberService {
	private static MemberService instance;

	private MemberService() {

	}

	public static MemberService getInstance() {
		if (instance == null) {
			instance = new MemberService();
		}
		return instance;
	}

	
	MemberDao dao = MemberDao.getInstance();
	
	public Map<String, Object> getMember(List<Object> param){
		return dao.getMember(param);
	}
	
	public MemberVo getMember2(List<Object> param) {
		return dao.getMember2(param);
	}
}
