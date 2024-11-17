package Monsters;

abstract public class Monster {

	int curhp;
	int maxhp;
	int power;
	String name;

	public Monster(String name, int maxhp, int power) {
		this.name = name;
		this.maxhp = maxhp;
		this.curhp = maxhp;
		this.power = power;
	}

	public void takeDamage(int damage) {
		this.curhp -= damage;
		if (this.curhp < 0) {
			this.curhp = 0; 
		}
	}

	public static Monster createMonster(String monsterName) {
		switch (monsterName) {
		case "MonsterGolam":
			return new MonsterGolam();
		case "MonsterMush":
			return new MonsterMush();
		case "MonsterSnail":
			return new MonsterSnail();
		case "MonsterWolf":
			return new MonsterWolf();
		default:
			return null;
		}
	}

	public void showStatus() {
		System.out.println(name + " - HP: " + curhp + "/" + maxhp + " Power: " + power);
	}

}
