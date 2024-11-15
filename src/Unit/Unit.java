package Unit;

abstract public class Unit {
	private int hp;
	private int mp;
	private int atx;
	private int def;
	private int dex;
	private int luck;
	public static Player player;

	public Unit(int hp, int mp, int atx, int def, int dex, int luck) {
		this.hp = hp;
		this.mp = mp;
		this.atx = atx;
		this.def = def;
		this.dex = dex;
		this.luck = luck;

	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtx() {
		return atx;
	}

	public void setAtx(int atx) {
		this.atx = atx;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getDex() {
		return dex;
	}

	public void setDex(int dex) {
		this.dex = dex;
	}

	public int getLuck() {
		return luck;
	}

	public void setLuck(int luck) {
		this.luck = luck;
	}

}
