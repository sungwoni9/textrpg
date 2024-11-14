package Stage;

public class StageSelctJob extends Stage {
	private final int WARRIOR = 1;
	private final int WIZZARD = 2;
	private final int ARCHER = 3;
	private final int THIEF = 4;

	@Override
	public boolean updateScreen() {
		buffer.append(String.format("\t|직업을 선택하세요|"));
		System.out.println(buffer.toString());
		buffer.setLength(0);

		buffer.append("--------------------------------------");
		buffer.append("\n1.전사) [공격력 15] [방어력 30] [회피 10]");
		buffer.append("\n2.법사) [공격력 30] [방어력  5] [회피  5]");
		buffer.append("\n3.궁수) [공격력 25] [방어력 10] [회피 10]");
		buffer.append("\n4.도적) [공격력 15] [방어력 10] [회피 20]");
		System.out.println(buffer.toString());
		buffer.setLength(0);

		try {
			String input = buffer.toString();
			int sel = Integer.parseInt(input);
			
			switch (sel) {
			case WARRIOR -> 
			case ARCHER -> 
			case WIZZARD -> 
			case THIEF ->
			}

		} catch (Exception e) {
		}
		return false;
	}

	public static StageSelctJob getInstance() {
		return new StageSelctJob();
	}
}
