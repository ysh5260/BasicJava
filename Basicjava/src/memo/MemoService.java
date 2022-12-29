package memo;

import java.util.List;

//서비스: 트랜잭션 단위, Business Logic Layer
//대부분 일대일 대칭임
public class MemoService {
	MemoDAO dao = MemoDAO.getInstance();
	
	//Singleton으로 변경
	private static MemoService instance = new MemoService();
	private MemoService() {
	}
	public static MemoService getInstance() {
		return instance;
	}
	
	public List<MemoVO>getMemoList() throws Exception{
		return dao.getMemoList();
	}
	public MemoVO getMemo(int searchNo) throws Exception{
		return dao.getMemo(searchNo);
	}
	public int insertMemo(MemoVO vo) throws Exception{
		return dao.insertMemo(vo);
	}
	public int updateMemo(MemoVO vo) throws Exception {
		return dao.updateMemo(vo);
	}

}
