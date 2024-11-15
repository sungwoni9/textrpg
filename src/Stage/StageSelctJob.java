package Stage;

import Unit.Player;
import Unit.Unit;
import textrptg.GameManager;

public class StageSelctJob extends Stage {
	private final int WARRIOR = 1;
	private final int WIZZARD = 2;
	private final int ARCHER = 3;
	private final int THIEF = 4;

	@Override
	public boolean updateScreen() {
		buffer.append(String.format("\t\t|직업을 선택하세요|"));
		System.out.println(buffer.toString());
		buffer.setLength(0);

		buffer.append("-------------------------------------------------------------");
		buffer.append("\n1.전사) [HP 200] [MP  50] [ATX 15] [DEF 30] [DEX 10] [LUCK  3]");
		buffer.append("\n2.법사) [HP 150] [MP 100] [ATX 30] [DEF  5] [DEX  5] [LUCK  3]");
		buffer.append("\n3.궁수) [HP 150] [MP  80] [ATX 25] [DEF 10] [DEX 10] [LUCK  3]");
		buffer.append("\n4.도적) [HP 150] [MP  60] [ATX 15] [DEF 10] [DEX 20] [LUCK 10]");
		System.out.println(buffer.toString());
		buffer.setLength(0);

		try {
			String input = buffer.toString();
			int sel = Integer.parseInt(input);

			Player player;
			switch (sel) {
			case WARRIOR -> player = new Player(200, 50, 15, 30, 10, 3);
			case WIZZARD -> player = new Player(150, 100, 30, 5, 5, 3);
			case ARCHER -> player = new Player(150, 80, 25, 10, 10, 3);
			case THIEF -> player = new Player(150, 60, 15, 10, 20, 10);
			default -> {
				buffer.append("다시 입력하세요");
				buffer.setLength(0);
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
