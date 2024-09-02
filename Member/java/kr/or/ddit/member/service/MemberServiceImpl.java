package kr.or.ddit.member.service;

import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.dao.MemberDaoImpl;
import kr.or.ddit.member.vo.MemberVo;

public class MemberServiceImpl implements MemberService{

	private static MemberServiceImpl instance;

	private MemberServiceImpl() {

	}

	public static MemberServiceImpl getInstacne() {
		if (instance == null) {
			instance = new MemberServiceImpl();
		}
		return instance;
	}

	MemberDao memberDao = MemberDaoImpl.getInstacne();
	
	
	@Override
	public MemberVo login(MemberVo member) {
		return memberDao.login(member);
	}

	@Override
	public void join(MemberVo member) {
		memberDao.join(member);
	}

}
