package Stage;

import java.util.Random;
import java.util.Vector;

import Monsters.Monster;
import Unit.UnitManager;

public class StageBattle extends Stage {
	
	UnitManager unit = null;
	Vector<Monster> monsterList = null;
	Random random;
	int monsterDead = 0;
	int playerDead = 0;
	
	public StageBattle() {
		unit = UnitManager.instance;
		random = new Random();
	}

	@Override
	public boolean update() {
		return false;
	}

	@Override
	public void init() {
		
	}

}
