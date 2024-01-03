import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
	private Scanner sc;
	
	public App(Scanner sc) {
	
		this.sc = sc;
		
	}
	
	List<WiseSaying> wiseSayings = new ArrayList<>();
	
	public void run() {
		System.out.println("==명언 앱 실행==");
		int lastId = 0;
		
		while (true) {
			System.out.print("명령어 )");
			sc.nextLine().trim();
			
			int id = lastId + 1;
			System.out.print("명언 :");
			String content = sc.nextLine().trim();
			System.out.print("작가 :");
			String author = sc.nextLine().trim();
			System.out.printf("%d번 명언이 등록되었습니다.\n", id);
			lastId++;
			

			WiseSaying wiseSaying = new WiseSaying(id, content, author);
			wiseSaying.add(wiseSaying);
		}
	}
}
