package Stage;

import java.io.IOException;

import Unit.Player;
import Unit.Unit;
import textrptg.GameManager;

public class StageSelctJob extends StageSetting {
	private final int WARRIOR = 1;
	private final int WIZZARD = 2;
	private final int ARCHER = 3;
	private final int THIEF = 4;

	@Override
	public boolean updateScreen() {
		buffer.append("\t\t|직업을 선택하세요|");
		buffer.setLength(0);

		buffer.append("-------------------------------------------------------------");
		buffer.append("\n1.전사) [HP 200] [MP  50] [ATX 15] [DEF 30] [DEX 10] [LUCK  3]");
		buffer.append("\n2.법사) [HP 150] [MP 100] [ATX 30] [DEF  5] [DEX  5] [LUCK  3]");
		buffer.append("\n3.궁수) [HP 150] [MP  80] [ATX 25] [DEF 10] [DEX 10] [LUCK  3]");
		buffer.append("\n4.도적) [HP 150] [MP  60] [ATX 15] [DEF 10] [DEX 20] [LUCK 10]");
		try {
			writer.write(buffer.toString());
			writer.flush();
		} catch (IOException e) {
			System.out.println("출력 오류가 발생했습니다.");
		}

		try {
			String input = reader.readLine();
			int sel = Integer.parseInt(input);

			Player player;
			switch (sel) {
			case WARRIOR -> player = new Player(200, 50, 15, 30, 10, 3);
			case WIZZARD -> player = new Player(150, 100, 30, 5, 5, 3);
			case ARCHER -> player = new Player(150, 80, 25, 10, 10, 3);
			case THIEF -> player = new Player(150, 60, 15, 10, 20, 10);
			default -> {
				buffer.setLength(0);
				buffer.append("잘못된 입력입니다. 다시 시도해 주세요.\n");
				writer.write(buffer.toString());
				writer.flush();
				return true;
			}
			}
			Unit.player = player;
			GameManager.nextStage = "LOBBY";
			return false;
		} catch (Exception e) {
		}
		return false;
	}

	public static StageSelctJob getInstance() {
		return new StageSelctJob();
	}

}
