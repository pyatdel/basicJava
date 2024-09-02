package kr.or.ddit.member.service;

import kr.or.ddit.member.vo.MemberVo;

public interface MemberService {
	
	public MemberVo login(MemberVo member);
	
	public void join(MemberVo member);
}
