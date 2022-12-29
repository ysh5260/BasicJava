package memo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MemoTest {

	@Test
	void test() throws Exception {
//		MemoService Service = new MemoService();
//		List<MemoVO> list = Service.getMemoList();
//		Assert.assertEquals(0, list.size()); //(예측값, 실제값)
		MemoDAO dao = MemoDAO.getInstance();
		dao.insertMemo(new MemoVO("배고파","점심 시간이다","김은대"));
		List<MemoVO> list = dao.getMemoList();
		Assert.assertEquals(4,list.size());
	}

}
