package textrptg;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;

import Stage.Stage;
import Stage.StageBattle;
import Stage.StageLobby;
import Stage.StageSelctJob;
import Stage.StageSetting;
import Stage.StageTitle;
import Unit.Player;

public class GameManager {

	public static BufferedReader reader;
	public static Player player;

	public static String nextStage = "";
	String curStage = "";

	static GameManager instance = new GameManager();
	Map<String, Stage> stageList = new HashMap<String, Stage>();
	private StringBuilder buffer = new StringBuilder();

	private GameManager() {

	}

	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}

	void init() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("SELECTJOB", new StageSelctJob());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("BATTLE", new StageBattle());
		nextStage = "TITLE";
	}

	public boolean update() {
		Stage currentStage = stageList.get(nextStage);
		if (currentStage != null) {
			return currentStage.update();
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
