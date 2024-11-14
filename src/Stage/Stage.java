package Stage;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

abstract public class Stage {

	protected StringBuffer buffer = new StringBuffer();
	private BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	public abstract boolean updateScreen();
}
