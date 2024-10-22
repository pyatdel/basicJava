package kr.or.ddit.vo;

public class ScheduleVo {
    private String schNo;            // 스케줄 번호
    private String roomName;         // 상영관 이름
    private int totalSeats;          // 총 좌석 수
    private String movieStartTime;   // 상영 시작 시간
    private String movieEndTime;     // 상영 종료 시간
    private int soldOutSeats;        // 판매된 좌석 수
    private int availableSeats;       // 남은 좌석 수 (계산할 수 있는 경우)

    // Getters and Setters
    public String getSchNo() {
        return schNo;
    }

    public void setSchNo(String schNo) {
        this.schNo = schNo;
    }
    
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public String getMovieStartTime() {
        return movieStartTime;
    }

    public void setMovieStartTime(String movieStartTime) {
        this.movieStartTime = movieStartTime;
    }

    public String getMovieEndTime() {
        return movieEndTime;
    }

    public void setMovieEndTime(String movieEndTime) {
        this.movieEndTime = movieEndTime;
    }

    public int getSoldOutSeats() {
        return soldOutSeats;
    }

    public void setSoldOutSeats(int soldOutSeats) {
        this.soldOutSeats = soldOutSeats;
    }

    public int getAvailableSeats() {
        return totalSeats - soldOutSeats; // 남은 좌석 수 계산
    }
}
