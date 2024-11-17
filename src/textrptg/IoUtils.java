package textrptg;

import java.io.BufferedWriter;
import java.io.IOException;

public class IoUtils {

	private static BufferedWriter writer = GameManager.writer;

	public static void writeToClient(String message) {
		try {
			writer.write(message);
			writer.flush();
		} catch (IOException e) {
			System.out.println("출력 오류가 발생했습니다.");
		}
	}

}
