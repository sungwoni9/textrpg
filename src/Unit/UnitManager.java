package Unit;

import java.util.Random;
import java.util.Vector;

import Monsters.Monster;

public class UnitManager {
	public static UnitManager instance = new UnitManager();

	Random r = new Random();
	Player player = new Player();

	Vector<Player> player_list = new Vector<Player>();
	Vector<Monster> mon_list = new Vector<>();
	String pate = ""; 
	String mons[] = { "MonsterWolf", "MonsterBat", "MonsterOrc" };

	void init() {
		player.init();
	}

}
