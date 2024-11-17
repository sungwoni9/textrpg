package Stage;

import textrpg.GameManager;

public class StageTitle extends Stage {

	@Override
	public boolean update() {
		try {
			buffer.setLength(0);
			buffer.append("==== TEXT RPG ====\n");
			buffer.append("[시작] 을 입력하세요\n☞");
			writer.write(buffer.toString());
			writer.flush();

			String input = reader.readLine();
			if (input != null && input.equals("시작")) {
				GameManager.nextStage = "SETJOB";
				return false;
			}
		} catch (Exception e) {
			System.out.println("다시 입력해주세요");

		}
		return false;
	}

	@Override
	public void init() {

	}
}
