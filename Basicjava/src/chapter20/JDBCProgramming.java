package chapter20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCProgramming {
	public static void main(String[] args) throws Exception{
		//JDBC(Java DataBase connectivity)
		//Driver가 필요 oracle java => ojdbc 드라이버 필요
		/*
		 *Member table의 데이터 보여주기 
		 */
		//0.준비 드라이버 로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//1.DB 접속
		//123.0.0.1 == localhost
		//ip 주소 or dns:port number.serviceId
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","YSH98","java"); 
		
		//2.쿼리 준비
		Statement statement = connection.createStatement(); //->쿼리를 작성하기 위한 공간
		
		//3.쿼리 작성
		String sql = "SELECT MEM_ID,MEM_NAME,MEM_HP,MEM_MAIL FROM MEMBER";
		
		//4.쿼리 전송
		ResultSet resultSet = statement.executeQuery(sql);
		
		//5.결과 처리
		System.out.println("아이디\t 이름\t 휴대전화번호\t 이메일");
		while(resultSet.next()) {
			String memId = resultSet.getString("MEM_ID"); 
			String memName = resultSet.getString("MEM_NAME"); 
			String memHp = resultSet.getString("MEM_HP"); 
			String memMail = resultSet.getString("MEM_MAIL");
			System.out.printf("%s \t %s \t %s \t %s\n",memId,memName,memHp,memMail);
		}
		
		//6.자원 반납
		resultSet.close();
		statement.close();
		connection.close();
	}
}
