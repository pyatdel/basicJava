package kr.or.ddit.member.dao;

import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.vo.MemberVo;

public interface memberDao {

	public int insetMember(MemberVo memberVo);

	public int getMaxFileNo();

	public int getMexMemNo();

	public MemberVo getMember(int memNo);
	
	public AttachFileVo getFile(int fileNo);

	public MemberVo login(MemberVo member);

}
