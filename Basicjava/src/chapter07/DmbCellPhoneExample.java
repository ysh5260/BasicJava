package chapter07;

public class DmbCellPhoneExample {
	public static void main(String[] args) {
		
		DmbCellphone dmbCellphone = new DmbCellphone("자바폰","검정",10);
		
		System.out.println("모델: " + dmbCellphone.model);
		System.out.println("색상: " + dmbCellphone.color);
		
		System.out.println("채널: " + dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요.");
		dmbCellphone.receiveVoice("안녕하세요! 저는 홍길동인데요.");
		dmbCellphone.sendVoice("아~ 예 반갑습니다.");
		dmbCellphone.hangUp();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.changeChannelDmb(12);
		dmbCellphone.turnOffDmb();
	}
}
