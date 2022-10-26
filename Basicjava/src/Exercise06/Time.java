package Exercise06;

public class Time {
	private int hour;
	private int minute;
	private int second;
	
	public Time(){
		
	}
	
	public Time(int hour, int minute, int second){
		if(hour>= 0 && hour<24) {
			this.hour = hour;
		}
		if(minute>=0 && minute<60) {
			this.minute = minute;
		}
		if(second>=0 && second<60) {
			this.second = second;
		}else {
			this.minute = 0;
			this.second = 0;
		}
	}
	public String toString() { //클래스 안에 데이터가 뭐가 들었는지 확인하기 위해 사용
		return String.format("%02d:%02d:%02d",hour,minute,second);
	}//현재 필드의 값을 확인하기 위해서 사용
}
