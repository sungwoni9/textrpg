package textrptg;

import java.util.HashMap;
import java.util.Map;

import Unit.Player;

public class GameManager {

	public static String nextStage;
	public static Object reader;
	public static Player player;
	public static Object instance;
	Map<String, Stage> stageList = new HashMap<String, Stage>();

	public abstract class Stage {
		protected StringBuffer buffer = new StringBuffer();

		public abstract boolean updateScreen();
	}

	void init() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("SELECTJAB", new StageSelctJob());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("SETTING", new StageSetting());
		nextStage = "TITLE";
	}

	public boolean updateScreen() {
		Stage currentStage = stageList.get(nextStage);
		if (currentStage != null) {
			return currentStage.updateScreen(); 
		}
		return false; 
	}

}
