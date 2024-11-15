package Stage;

import java.io.IOException;

import textrptg.GameManager;

public class StageLobby extends Stage {

	public boolean update() {
		System.out.println("=====[LOBBY]=====");
		System.out.println("[1. 전투] [2. 설정] [3. 종료]");

		try {
			String input = GameManager.reader.readLine();
			int sel = Integer.parseInt(input);

			if (sel == 1) {
				GameManager.nextStage = "BATTLE";
			} else if (sel == 2) {
				GameManager.nextStage = "SETTING";
			} else if (sel == 3) {
				GameManager.nextStage = "";
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				return true;
			}
		} catch (IOException e) {
			System.out.println("입력 오류가 발생했습니다.");
			return true;
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
			return true;
		}

		return false;
	}

	@Override
	public void init() {
	}

}
