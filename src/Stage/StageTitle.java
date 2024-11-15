package Stage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import textrptg.GameManager;

public class StageTitle extends Stage {

	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	private static String input = "";

	@Override
	public boolean updateScreen() {
		buffer.setLength(0);
		buffer.append("==== TEXT RPG ====\n");
		buffer.append("[시작] 을 입력하세요\n");

		try {
			writer.write(buffer.toString());
			writer.flush();
		} catch (Exception e) {
			System.out.println("출력 오류가 발생했습니다.");
		}

		try {
			String input = reader.readLine();

			if (input.equals("시작")) {
				GameManager.nextStage = "SELECTJAB";
				return false;
			}
		} catch (Exception e) {
			System.out.println("다시 입력해주세요");

		}
		return true;
	}

	public static StageTitle getInstance() {
		return new StageTitle();
	}
}
