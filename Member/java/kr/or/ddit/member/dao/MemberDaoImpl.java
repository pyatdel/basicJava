package kr.or.ddit.member.dao;

import kr.or.ddit.member.vo.MemberVo;
import kr.or.ddit.mybatis.MyBatisDao;

public class MemberDaoImpl extends MyBatisDao implements MemberDao{

	private static MemberDaoImpl instance;

	private MemberDaoImpl() {

	}

	public static MemberDaoImpl getInstacne() {
		if (instance == null) {
			instance = new MemberDaoImpl();
		}
		return instance;
	}
	
	@Override
	public MemberVo login(MemberVo member) {
		return selectOne("member.login", member);
	}

	@Override
	public void join(MemberVo member) {
		insert("member.join", member);
	}

}
