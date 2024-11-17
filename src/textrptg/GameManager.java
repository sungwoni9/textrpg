package textrptg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;

import Stage.Stage;
import Stage.StageBattle;
import Stage.StageLobby;
import Stage.StageSetJob;
import Stage.StageTitle;
import Unit.Player;

public class GameManager {

	public static BufferedReader reader;
	public static BufferedWriter writer;

	public static Player player;

	public static String nextStage = "";
	public static String currentStage = "";

	static GameManager instance = new GameManager();
	Map<String, Stage> stageList = new HashMap<String, Stage>();
	private StringBuilder buffer = new StringBuilder();

	private GameManager() {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in)); 
			writer = new BufferedWriter(new OutputStreamWriter(System.out));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static GameManager instance() {
		return instance;
	}

	public static BufferedReader getReader() {
		return reader;
	}

	public static BufferedWriter getWriter() {
		return writer;
	}

	void init() {
		stageList.put("TITLE", new StageTitle());
		stageList.put("SETJOB", new StageSetJob());
		stageList.put("LOBBY", new StageLobby());
		stageList.put("BATTLE", new StageBattle());
		currentStage = "START";
		nextStage = "TITLE";
	}

	public boolean update() {
		Stage currentStage = stageList.get(nextStage);
		if (currentStage != null) {
			return currentStage.update();
		}
		return false;
	}

	boolean changeStage() {
		buffer.setLength(0);
		buffer.append("currentStage : " + currentStage);
		buffer.append("nextStage : " + nextStage);

		if (currentStage.equals(nextStage))
			return true;

		currentStage = nextStage;
		Stage stage = stageList.get(currentStage);

		if (stage == null) {
			buffer.setLength(0);
			buffer.append("잘못된 스테이지입니다: " + currentStage);
			return false;
		}

		stage.init();

		boolean run = true;
		while (run) {
			run = stage.update();
			if (run == false)
				break;
		}
		if (nextStage.equals(""))
			return false;
		else
			return true;
	}

}
