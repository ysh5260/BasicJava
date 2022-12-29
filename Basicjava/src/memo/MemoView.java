package memo;

import java.util.List;
import java.util.Scanner;

public class MemoView {
	// 처음 시작할 때 호출 할 예정
	// 시작시 로고를 보여주거나
	// 처음 메뉴를 보여주도록 할 예정
	MemoController controller = new MemoController();
	public void init() throws Exception {
		System.out.println("메모");
		boolean running = true;
		while (running) {
			System.out.println("---------------------------------");
			System.out.println("1.목록|2.새메모|3.수정|4.삭제|5.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");
			Scanner scanner = new Scanner(System.in);
			int menu = Integer.parseInt(scanner.nextLine());
			switch (menu) {
			case 1:
				System.out.println("메모 목록");
				List<MemoVO> list = controller.getMemoList(); //서비스에 있는 데이터를 다시 반환해줌
				for (MemoVO memo : list) {
					System.out.println(memo);
				}
				break;
			case 2:
				System.out.println("제목> ");
				String title = scanner.nextLine();
				System.out.println("내용> ");
				String content = scanner.nextLine();
				System.out.println("작성자> "); // 로그인 한다면 로그인 정보를 받아주는게 좋음
				String writer = scanner.nextLine();
				int insertMemo = controller.insertMemo(new MemoVO(title,content,writer)); //insert 내용 호출할 때 들어감
				if(insertMemo>0) {
					System.out.println("메모등록 완료!");
				}else {
					System.out.println("메모 등록 실패");
				}
				break;
			case 3:
				System.out.println("수정할 글 번호 입력> ");
				int searchNo = Integer.parseInt(scanner.nextLine());
				MemoVO memo = controller.getMemo(searchNo);
				System.out.println(memo);
				System.out.println("제목> ");
				String updateTitle = scanner.nextLine();
				if(updateTitle.length()>0) {
					memo.setTitle(updateTitle);
				}
				System.out.println("내용> ");
				String updateContent = scanner.nextLine();
				if(updateContent.length()>0) {
					memo.setContent(updateContent);
				}
				System.out.println("작성자> "); // 로그인 한다면 로그인 정보를 받아주는게 좋음
				String updateWriter = scanner.nextLine();
				if(updateWriter.length()>0) {
					memo.setWriter(updateWriter);
				}
				int updateMemo = controller.updateMemo(memo);
				if(updateMemo>0) {
					System.out.println("수정 성공");
				}else {
					System.out.println("수정실패");
				}
				break;
			case 4:
				
				break;
			case 5:
				running = false; //5번을 넣으면 while문을 빠져나옴, 종료됨
				break;
			}
		}
	}
}
