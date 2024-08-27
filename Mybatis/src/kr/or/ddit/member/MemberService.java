package kr.or.ddit.member;

import java.util.HashMap;
import java.util.List;

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

	MemberDao memberDao = MemberDao.getInstacne();
	
	public List<MemberVo> getAll(){
		return memberDao.getAll();
	}
	
	
	public MemberVo getMember(MemberVo member) {
		return memberDao.getMember(member);
	}
	
	public int insertMember(MemberVo member) {
		return memberDao.insertMember(member);
	}
	public void updateMember(MemberVo member) {
		memberDao.updateMember(member);
	}
	
	public void deleteMember(MemberVo member) {
		return memberDao.deleteMember(member);
	}
}
