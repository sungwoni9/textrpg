package Unit;

import java.util.Random;
import java.util.Vector;

import Monsters.Monster;

public class UnitManager {
	public static UnitManager instance = new UnitManager();

	Random r = new Random();
	Player player = new Player(0, 0, 0, 0, 0, 0);

	Vector<Player> player_list = new Vector<Player>();
	Vector<Monster> mon_list = new Vector<>();
	String pate = "";
	String mons[] = { "MonsterWolf", "MonsterBat", "MonsterOrc" };

	void init() {
		player.init();
		player_list.add(player);
		generateMonsters();
	}

	void addPlayer(Player newPlayer) {
		player_list.add(newPlayer);
	}

	void removePlayer(Player playerToRemove) {
		player_list.remove(playerToRemove);
	}

	void generateMonsters() {
		for (String monsterName : mons) {
			Monster monster = Monster.createMonster(monsterName);
			if (monster != null) {
				mon_list.add(monster); 
			}
		}
	}

}
