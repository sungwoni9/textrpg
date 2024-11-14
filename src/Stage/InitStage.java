package Stage;

import java.io.IOException;
import textrptg.GameManager;

public class InitStage extends Stage {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public boolean startScreen() {
		buffer.setLength(0);
		buffer.append("==== TEXT RPG ====\n");
		buffer.append("[시작] 을 입력하세요\n");

		System.out.println(buffer.toString());

		try {

			String start = GameManager.reader.readLine();
			if (start.equals("시작")) {
				GameManager.nextStage = "LOBBY";
				return false;
			}
		} catch (IOException e) {
			System.out.println("입력 오류가 발생했습니다.");
		}
		return true;
	}

	public static InitStage getInstance() {
		return new InitStage();
	}
}
