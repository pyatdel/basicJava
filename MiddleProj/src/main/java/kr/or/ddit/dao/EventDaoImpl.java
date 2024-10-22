package kr.or.ddit.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.mybatis.MyBatisDao;
import kr.or.ddit.vo.EventVo;

public class EventDaoImpl extends MyBatisDao implements iEventDao {
	
	
	private static EventDaoImpl instance;

	private EventDaoImpl() {

	}

	public static EventDaoImpl getInstance() {
		if (instance == null) {
			instance = new EventDaoImpl();
		}

		return instance;
	}

	
	@Override
	public List<EventVo> eventList() {

		return selectList("event.eventList");
	}

	@Override
	public EventVo eventDetail(String boardNo) {
		
		return selectOne("event.eventDetail", boardNo);
	}

	@Override
	public EventVo eventUpdate(EventVo event) {
		
		return selectOne("event.eventUpdate", event);
	}

	@Override
	public EventVo eventInsert(EventVo event) {

	
		return selectOne("event.eventInsert", event);
	}

	@Override
	public EventVo eventDelete(EventVo event) {
		
		return selectOne("event.eventDelete", event);
	}

	@Override
	public EventVo eventCnt(String boardNo) {
		
		return selectOne("event.eventCnt", boardNo);
	}
	
	

}
