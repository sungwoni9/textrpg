package textrptg;

import Stage.StageInit;
import Stage.StageSelctJob;

public class Main {

	public static void main(String[] args) {
		StageSelctJob init = StageSelctJob.getInstance();
		init.updateScreen();

	
		System.out.println("게임 종료");
	}
}