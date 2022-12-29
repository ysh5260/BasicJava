package memo;

import java.util.List;

public class MemoController {
	MemoService service = MemoService.getInstance();

	public List<MemoVO> getMemoList() throws Exception{
		return service.getMemoList();
	}
	public MemoVO getMemo(int searchNo) throws Exception{
		return service.getMemo(searchNo);
	}
	
	public int insertMemo(MemoVO vo) throws Exception{
		return service.insertMemo(vo);
	}
	public int updateMemo(MemoVO vo) throws Exception {
		return service.updateMemo(vo);
	}

}
