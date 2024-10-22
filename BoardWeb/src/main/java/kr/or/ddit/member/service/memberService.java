package kr.or.ddit.member.service;

import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.vo.MemberVo;

public interface memberService {

	public int insertMember(MemberVo memberVo);
	
	public int insertFile(AttachFileVo file);
	
	public int getMaxFileNo();

	public int getMaXMemNo();
	
	public MemberVo getMember(int memNo);
	
	public AttachFileVo getFile(int fileNo);
	
	public MemberVo login(MemberVo member);
}
