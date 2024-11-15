package textrptg;

import Stage.StageTitle;
import Stage.StageSelctJob;

public class Main {

	public static void main(String[] args) {
		boolean run = true;
		GameManager.instance.init();
		while (true) {
			run = GameManager.instance.updateScreen();
			if (run == false) {
				break;
			}
		}
		System.out.println("게임 종료");
	}
	
	
}
