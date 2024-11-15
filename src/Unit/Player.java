package Unit;

import java.util.ArrayList;
import java.util.Vector;

import Item.Inventory;

public class Player extends Unit {

	int money;

	static Guild guild = new Guild();
	static Inventory inven = new Inventory();

	public Player(int hp, int mp, int atx, int def, int dex, int luck) {
		super(hp, mp, atx, def, dex, luck);
		this.money = 10000;
		this.guild = new Guild();
		this.inven = new Inventory();
		init();
	}

	Player() {
		this.money = 100000;
		this.guild = new Guild();
		this.inven = new Inventory();
		init();

	}

	void init() {
		guild.setGuild();
	}

	void skill() {

	}

	int getMoney() {
		return money;
	}

	void setMoney(int money) {
		this.money = money;
	}

	Inventory getInventory() {
		return inven;
	}

}
