package Stage;

public class StageLoby extends Stage {
	private StringBuffer buffer = new StringBuffer();

	@Override
	public boolean updateScreen() {
		buffer.setLength(0);
		buffer.append("=====[LOBBY]=====");

		return true;

	}

}
