package Stage;

import textrptg.GameManager;

public class InitStage extends Stage {

	private static String input = "";

	@Override
	public boolean updateScreen() {
		buffer.setLength(0);
		buffer.append("==== TEXT RPG ====\n");
		buffer.append("[시작] 을 입력하세요\n");

		System.out.println(buffer.toString());

		try {

			input = buffer.toString();
			if (input.equals("시작")) {
				GameManager.nextStage = "LOBBY";
				return false;
			}
		} catch (Exception e) {
			System.out.println();
		}
		return true;
	}

	public static InitStage getInstance() {
		return new InitStage();
	}
}
