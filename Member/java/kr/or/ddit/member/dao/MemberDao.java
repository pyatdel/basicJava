package kr.or.ddit.member.dao;

import kr.or.ddit.member.vo.MemberVo;

public interface MemberDao {
	public MemberVo login(MemberVo member);
	
	public void join(MemberVo member);
	
}
