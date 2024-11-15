package Stage;

import java.io.IOException;

import Unit.Player;
import Unit.Unit;
import textrptg.GameManager;

public class StageSelctJob extends Stage {
	private final int WARRIOR = 1;
	private final int WIZZARD = 2;
	private final int ARCHER = 3;
	private final int THIEF = 4;

	@Override
	public boolean update() {
		buffer.setLength(0);
		buffer.append("\t\t|직업을 선택하세요|\n");

		buffer.append("-------------------------------------------------------------\n");
		buffer.append("1.전사) [HP 200] [MP  50] [ATX 15] [DEF 30] [DEX 10] [LUCK  3]\n");
		buffer.append("2.법사) [HP 150] [MP 100] [ATX 30] [DEF  5] [DEX  5] [LUCK  3]\n");
		buffer.append("3.궁수) [HP 150] [MP  80] [ATX 25] [DEF 10] [DEX 10] [LUCK  3]\n");
		buffer.append("4.도적) [HP 150] [MP  60] [ATX 15] [DEF 10] [DEX 20] [LUCK 10]\n");

		try {
			GameManager.writer.write(buffer.toString());
			GameManager.writer.flush();
		} catch (IOException e) {
			System.out.println("출력 오류가 발생했습니다.");
		}

		try {
			String input = GameManager.reader.readLine();
			int sel = Integer.parseInt(input);

			Player player;
			switch (sel) {
			case WARRIOR:
				player = new Player(200, 50, 15, 30, 10, 3);
				break;
			case WIZZARD:
				player = new Player(150, 100, 30, 5, 5, 3);
				break;
			case ARCHER:
				player = new Player(150, 80, 25, 10, 10, 3);
				break;
			case THIEF:
				player = new Player(150, 60, 15, 10, 20, 10);
				break;
			default:
				buffer.setLength(0);
				buffer.append("잘못된 입력입니다. 다시 시도해 주세요.\n");
				try {
					GameManager.writer.write(buffer.toString());
					GameManager.writer.flush();
				} catch (IOException e) {
					System.out.println("출력 오류가 발생했습니다.");
				}
				return true;
			}
			
			buffer.append("플레이어의 직업을 %s로 설정합니다.", );

			Unit.player = player;
			GameManager.nextStage = "LOBBY";
			return false;
		} catch (Exception e) {
			buffer.setLength(0);
			buffer.append("잘못된 입력입니다. 다시 선택하세요.");
			try {
				GameManager.writer.write(buffer.toString());
				GameManager.writer.flush();
			} catch (IOException e1) {
				System.out.println("출력 오류가 발생했습니다.");
			}
			return true;
		}
	}

	@Override
	public void init() {

	}

}
