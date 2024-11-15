package textrptg;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

import Stage.StageBattle;
import Stage.StageLobby;
import Stage.StageSelctJob;
import Stage.StageSetting;
import Stage.StageTitle;
import Unit.Player;

public class GameManager {

	public static String nextStage;
	public static BufferedReader reader;
	public static Player player;
	public static GameManager instance;
	Map<String, StageSetting> stageList = new HashMap<String, StageSetting>();
	private StringBuilder buffer = new StringBuilder(); // buffer 선언

	private GameManager() {

	}

	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}

	public void init() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("SELECTJOB", new StageSelctJob());
		stageList.put("BATTLE", new StageBattle());
		stageList.put("LOBBY", new StageLobby());
		nextStage = "TITLE";
	}

	public boolean updateScreen() {
		StageSetting currentStage = stageList.get(nextStage);
		if (currentStage != null) {
			return currentStage.updateScreen();
		}
		return false;
	}

	public void changeStage(String stageName) {
		if (stageList.containsKey(stageName)) {
			nextStage = stageName;
		} else {
			buffer.setLength(0);
			buffer.append("잘못된 스테이지 이름입니다.");
		}
	}

	public static BufferedReader getReader() {
		return reader;
	}

}
