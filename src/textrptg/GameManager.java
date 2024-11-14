package textrptg;


public class GameManager {

	public static String nextStage;
	public static Object reader;

	public abstract class Stage {
		protected StringBuffer buffer = new StringBuffer(); 

		public abstract boolean updateScreen();
	}

}
