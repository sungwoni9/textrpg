package textrptg;

import Stage.InitStage;
import Stage.SelectJobStage;

public class Main {

	public static void main(String[] args) {
		SelectJobStage init = SelectJobStage.getInstance();
		init.updateScreen();

	
		System.out.println("게임 종료");
	}
}