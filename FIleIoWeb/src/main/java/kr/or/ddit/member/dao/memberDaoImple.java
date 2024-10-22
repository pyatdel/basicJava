package kr.or.ddit.member.dao;

import kr.or.ddit.file.vo.AttachFileVo;
import kr.or.ddit.member.vo.MemberVo;
import kr.or.ddit.mybatis.MyBatisDao;

public class memberDaoImple extends MyBatisDao implements memberDao {

	private static memberDaoImple instance;

	private memberDaoImple() {

	}

	public static memberDaoImple getinstance() {
		if (instance == null) {
			instance = new memberDaoImple();
		}
		return instance;
	}

	@Override
	public int insetMember(MemberVo memberVo) {
		return insert("memberVo",memberVo);
		
	}

	@Override
	public int getMaxFileNo() {
		// TODO Auto-generated method stub
		return selectOne("member.getMaxFileNo");
	}

	@Override
	public int getMexMemNo() {
		// TODO Auto-generated method stub
		return selectOne("member.getMaxMemNo");
	}

	@Override
	public MemberVo getMember(int memNo) {
		// TODO Auto-generated method stub
		return selectOne("member.getMember",memNo);
	}

	@Override
	public AttachFileVo getFile(int fileNo) {
		// TODO Auto-generated method stub
		return selectOne("member.getFile",fileNo);
	}

	
}
