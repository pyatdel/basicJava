package kr.or.ddit.member;

import java.util.HashMap;
import java.util.List;

import comm.dao.MyBatisDao;

public class MemberDao extends MyBatisDao {
	
	private static MemberDao instance;

	private MemberDao() {

	}

	public static MemberDao getInstacne() {
		if (instance == null) {
			instance = new MemberDao();
		}
		return instance;
	}

	
	public List<MemberVo> getAll(){
		return selectList("member.getAll" );
	}
	
	
	public MemberVo getMember(MemberVo member) {
		return selectOne("member.getMember", member);
	}
	
	public int insertMember(MemberVo member) {
		return insert("member.insertMember", member);
		
	}
	
	public void updateMember(MemberVo member) {
		update("member.updateMember", member);
	}
}
