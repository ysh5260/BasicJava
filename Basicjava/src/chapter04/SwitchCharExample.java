package chapter04;

public class SwitchCharExample {
	public static void main(String[] args) {
		char grade = 'B';
		//boolean,float,double switch문안에 들어갈 수 없는 타입
		//byte,short,char,int,long,String(jdk1.5)
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("우수회원입니다.");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다.");
				break;
			default:
				System.out.println("손님입니다.");
		}
	}
}
