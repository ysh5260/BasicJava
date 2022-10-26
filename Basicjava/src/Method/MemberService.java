package Method;

public class MemberService {
	boolean login(String id, String password) {
		if("hong".equals(id)&&"12345".equals(password)) {
			return true;
		}else 
			return false;//else문 안 써도 가능 
	}
	// return "hong".equals(id)&&"12345".equals(password);
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
