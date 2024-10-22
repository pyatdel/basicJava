package kr.or.ddit.vo;

import lombok.Data;

@Data
public class MovieScheduleVO {
    private String scheduleId;   // 영화 스케줄 ID
    private String movieId;      // 영화 ID
    private String sch_date; // 상영 날짜
    private String movieStart;    // 영화 시작 시간
    private String movieEnd;      // 영화 종료 시간
    private String roomNum;      // 상영관 번호
}
    