package memo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.driver.OracleDriver;

//Data Access Object => 데이터베이스 시스템에 직접 접근 객체
public class MemoDAO {
	public static MemoDAO instance  = new MemoDAO();
	private MemoDAO() {		
	}
	public static MemoDAO getInstance() {
			return instance;
	}
//	main은 지워야됨 => 테스트하기 위해서만 사용해야함
//	public static void main(String[] args) throws Exception {
//		MemoDAO dao = new MemoDAO();
//		List<MemoVO> list = dao.getMemoList();
//		System.out.println(list.size());
//	}
	// 단위테스트(Unit Test)
	//Flux
	public List<MemoVO> getMemoList() throws Exception{ //DB 조회해서 불러옴
//		Class.forName("oracle.jdbc.driver.OracleDriver");
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","YSH98","java"); 
		Statement statement = connection.createStatement();
		String sql = "";
		sql += "SELECT";
		sql += "    no,";
		sql += "    title,";
		sql += "    content,";
		sql += "    writer,";
		sql += "    create_date,";
		sql += "    modify_date ";
		sql += "FROM";
		sql += "    memo";
		
		ResultSet resultSet = statement.executeQuery(sql);
		
		List<MemoVO>list = new ArrayList<>(); //MemoVO 객체를 추가하는 것
		while(resultSet.next()) {// 데이터가 존재하면
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Date createDate = resultSet.getDate("create_date");
			Date modifyDate = resultSet.getDate("modify_date");
			list.add(new MemoVO(no, title, content, writer, createDate, modifyDate));
		}
		
		resultSet.close();
		statement.close();
		connection.close();
		
		return list;
	}
	
	// mono
	// 메모 수정
	public MemoVO getMemo(int searchNo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","YSH98","java"); 
		Statement statement = connection.createStatement();
		StringBuilder builder = new StringBuilder();
	
		builder.append("SELECT");
		builder.append("    no,");
		builder.append("    title,");
		builder.append("    content,");
		builder.append("    writer,");
		builder.append("    create_date,");
		builder.append("    modify_date ");
		builder.append("FROM");
		builder.append("    memo ");
		builder.append("WHERE");
		builder.append("    no = " + searchNo);
		String sql = builder.toString();
		ResultSet resultSet = statement.executeQuery(sql);
		
		MemoVO vo = null;
		if(resultSet.next()) {// 데이터가 존재하면
			int no = resultSet.getInt("no");
			String title = resultSet.getString("title");
			String content = resultSet.getString("content");
			String writer = resultSet.getString("writer");
			Date createDate = resultSet.getDate("create_date");
			Date modifyDate = resultSet.getDate("modify_date");
			vo = new MemoVO(no, title, content, writer, createDate, modifyDate);
		}
		
		resultSet.close();
		statement.close();
		connection.close();

		return vo;
	}
	
	//메모 추가
	public int insertMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","YSH98","java");
		Statement statement = connection.createStatement();
//		String sql = "";
		//문자열을 연결하고 싶을 때 사용
		//StringBuilder와 StringBuffer를 지원함
		//Non Thread safe vs Thread safe
		StringBuilder builder = new StringBuilder();
		builder.append("INSERT INTO memo (");
		builder.append("    no,");
		builder.append("    title,");
		builder.append("    content,");
		builder.append("    writer");
		builder.append(") VALUES (");
		builder.append("    memo_seq.NEXTVAL,");
		builder.append("    '"+vo.getTitle()+"',"); //vo.getTitle()이 '' 안에 들어가야됨
		builder.append("    '"+vo.getContent()+"',");
		builder.append("    '"+vo.getWriter()+"'");
		builder.append(")");
		String sql = builder.toString();
		
		//insert, update,delete 다 가능
		int update = statement.executeUpdate(sql); //update가 되면 1을 컨트롤러와 서비스에서 반환함
		statement.close();
		connection.close();
		return update;
	}
	public int updateMemo(MemoVO vo) throws Exception {
		DriverManager.registerDriver(new OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","YSH98","java");
//		connection.prepareStatement(sql); //쿼리를 먼저 작성한 이후에 prepare 하는 것
		
		StringBuilder builder = new StringBuilder();
		builder.append("UPDATE memo");
		builder.append("    SET");
		builder.append("        title = ?,");
		builder.append("        content = ?,");
		builder.append("        writer = ?,");
		builder.append("        modify_date = SYSDATE ");
		builder.append("WHERE");
		builder.append("    no = ?");
		
		String sql = builder.toString();
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, vo.getTitle());
		statement.setString(2, vo.getContent());
		statement.setString(3, vo.getWriter());
		statement.setInt(4, vo.getNo());
		
		int executeUpdate = statement.executeUpdate();
		statement.close();
		connection.close();
		return executeUpdate;
		
	}
	public int deleteMemo(int deleteNo) {
		return 0;
	}
}
