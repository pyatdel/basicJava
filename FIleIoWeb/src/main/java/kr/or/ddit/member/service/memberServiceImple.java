package kr.or.ddit.member.service;

import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.dao.memberDao;
import kr.or.ddit.member.dao.memberDaoImple;
import kr.or.ddit.member.vo.MemberVo;

public class memberServiceImple implements memberService{

	private static memberServiceImple instance;

	private memberServiceImple() {

	}

	public static memberServiceImple getinstance() {
		if (instance == null) {
			instance = new memberServiceImple();
		}
		return instance;
	}

	memberDao memberDao = memberDaoImple.getinstance();

	@Override
	public int insertMember(MemberVo memberVo) {
		return memberDao.insetMember(memberVo);
		
	}

	@Override
	public int insertFile(AttachFileVo file) {

		return 0;
	}

	@Override
	public int getMaxFileNo() {
		// TODO Auto-generated method stub
		return memberDao.getMaxFileNo();
	}

	@Override
	public int getMaXMemNo() {
		// TODO Auto-generated method stub
		return memberDao.getMexMemNo();
	}

	@Override
	public MemberVo getMember(int memNo) {
		// TODO Auto-generated method stub
		return memberDao.getMember(memNo);
	}

	@Override
	public AttachFileVo getFile(int fileNo) {
		// TODO Auto-generated method stub
		return memberDao.getFile(fileNo);
	}
	
}
