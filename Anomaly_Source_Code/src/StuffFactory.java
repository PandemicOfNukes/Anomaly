package testeGUi;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import asciiPanel.AsciiPanel;

public class StuffFactory {
	private World world;
	private Map<String, Color> potionColors;
	private List<String> potionAppearances;
	
	public StuffFactory(World world){
		this.world = world;
		
		setUpPotionAppearances();
	}
	
	private void setUpPotionAppearances(){
		potionColors = new HashMap<String, Color>();
		potionColors.put("red potion", AsciiPanel.brightRed);
		potionColors.put("yellow potion", AsciiPanel.brightYellow);
		potionColors.put("green potion", AsciiPanel.brightGreen);
		potionColors.put("cyan potion", AsciiPanel.brightCyan);
		potionColors.put("blue potion", AsciiPanel.brightBlue);
		potionColors.put("magenta potion", AsciiPanel.brightMagenta);
		potionColors.put("dark potion", AsciiPanel.brightBlack);
		potionColors.put("grey potion", AsciiPanel.white);
		potionColors.put("light potion", AsciiPanel.brightWhite);

		potionAppearances = new ArrayList<String>(potionColors.keySet());
		Collections.shuffle(potionAppearances);
	}
	
	public Creature newPlayer(List<String> messages, FieldOfView fov){
		Creature player = new Creature(world, '@', AsciiPanel.brightWhite, "player", 100, 20, 5);
		world.addAtEmptyLocation(player, 0);
		new PlayerAi(player, messages, fov);
		return player;
	}
	
	public Creature newGodPlayer(List<String> messages, FieldOfView fov){
		Creature player = new Creature(world, '@', AsciiPanel.brightWhite, "player", 10000, 20, 5);
		world.addAtEmptyLocation(player, 0);
		new PlayerAi(player, messages, fov);
		return player;
	}
	
	public Creature newFungus(int depth){
		Creature fungus = new Creature(world, 'f', AsciiPanel.green, "fungus", 10, 0, 0);
		world.addAtEmptyLocation(fungus, depth);
		new FungusAi(fungus, this);
		return fungus;
	}
	
	public Creature newBat(int depth){
		Creature bat = new Creature(world, 'b', AsciiPanel.brightYellow, "bat", 15, 5, 0);
		world.addAtEmptyLocation(bat, depth);
		new BatAi(bat);
		return bat;
	}
	
	public Creature newSpider(int depth){
		Creature spider = new Creature(world, 'x', AsciiPanel.brightBlack, "spider", 10, 7, 0);
		world.addAtEmptyLocation(spider, depth);
		new BatAi(spider);
		return spider;
	}
	
	public Creature newZombie(int depth, Creature player){
		Creature zombie = new Creature(world, 'z', AsciiPanel.white, "zombie", 50, 10, 10);
		world.addAtEmptyLocation(zombie, depth);
		new ZombieAi(zombie, player);
		return zombie;
	}
	
	public Creature newVampire(int depth, Creature player){
		Creature vampire = new Creature(world, 'v', AsciiPanel.brightMagenta, "vampire", 60, 20, 10);
		world.addAtEmptyLocation(vampire, depth);
		new ZombieAi(vampire, player);
		return vampire;
	}
	
	public Creature newAnomaly(int depth, Creature player){
		Creature anomaly= new Creature(world, '@', AsciiPanel.red, "Anomaly", 50, 50, 50);
		world.addAtEmptyLocation(anomaly, depth);
		new ZombieAi(anomaly, player);
		return anomaly;
	}

	public Creature newGoblin(int depth, Creature player){
		Creature goblin = new Creature(world, 'g', AsciiPanel.brightGreen, "goblin", 66, 15, 5);
		new GoblinAi(goblin, player);
		goblin.equip(randomWeapon(depth));
		goblin.equip(randomArmor(depth));
		world.addAtEmptyLocation(goblin, depth);
		return goblin;
	}
	
	public Creature newSkinCrawler(int depth, Creature player){
		Creature SkinCrawler = new Creature(world, 'S', AsciiPanel.green, "SkinCrawler", 70, 17, 10);
		new GoblinAi(SkinCrawler, player);
		SkinCrawler.equip(randomWeapon(depth));
		SkinCrawler.equip(randomArmor(depth));
		world.addAtEmptyLocation(SkinCrawler, depth);
		return SkinCrawler;
	}
	
	public Item newRock(int depth){
		Item rock = new Item(',', AsciiPanel.yellow, "rock", null);
		rock.modifyThrownAttackValue(5);
		world.addAtEmptyLocation(rock, depth);
		return rock;
	}
	
	public Item newVictoryItem(int depth){
		Item item = new Item('*', AsciiPanel.brightWhite, "teddy bear", null);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newBread(int depth){
		Item item = new Item('%', AsciiPanel.yellow, "bread", null);
		item.modifyFoodValue(400);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newFruit(int depth){
		Item item = new Item('%', AsciiPanel.brightRed, "apple", null);
		item.modifyFoodValue(100);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newDagger(int depth){
		Item item = new Item(')', AsciiPanel.white, "dagger", null);
		item.modifyAttackValue(5);
		item.modifyThrownAttackValue(5);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newSword(int depth){
		Item item = new Item(')', AsciiPanel.brightWhite, "sword", null);
		item.modifyAttackValue(10);
		item.modifyThrownAttackValue(3);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newStaff(int depth){
		Item item = new Item(')', AsciiPanel.yellow, "staff", null);
		item.modifyAttackValue(5);
		item.modifyDefenseValue(3);
		item.modifyThrownAttackValue(3);
		world.addAtEmptyLocation(item, depth);
		return item;
	}

	public Item newBow(int depth){
		Item item = new Item(')', AsciiPanel.yellow, "bow", null);
		item.modifyAttackValue(1);
		item.modifyRangedAttackValue(5);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newEdibleWeapon(int depth){
		Item item = new Item(')', AsciiPanel.yellow, "baguette", null);
		item.modifyAttackValue(3);
		item.modifyFoodValue(100);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newLightArmor(int depth){
		Item item = new Item('[', AsciiPanel.green, "tunic", null);
		item.modifyDefenseValue(2);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newMediumArmor(int depth){
		Item item = new Item('[', AsciiPanel.white, "chainmail", null);
		item.modifyDefenseValue(4);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newHeavyArmor(int depth){
		Item item = new Item('[', AsciiPanel.brightWhite, "platemail", null);
		item.modifyDefenseValue(6);
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item randomWeapon(int depth){
		switch ((int)(Math.random() * 3)){
		case 0: return newDagger(depth);
		case 1: return newSword(depth);
		case 2: return newBow(depth);
		default: return newStaff(depth);
		}
	}

	public Item randomArmor(int depth){
		switch ((int)(Math.random() * 3)){
		case 0: return newLightArmor(depth);
		case 1: return newMediumArmor(depth);
		default: return newHeavyArmor(depth);
		}
	}
	
	public Item newPotionOfHealth(int depth){
		String appearance = potionAppearances.get(0);
		final Item item = new Item('!', potionColors.get(appearance), "health potion", appearance);
		item.setQuaffEffect(new Effect(1){
			public void start(Creature creature){
				if (creature.hp() == creature.maxHp())
					return;
				
				creature.modifyHp(15, "Killed by a health potion?");
				creature.doAction(item, "look healthier");
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newPotionOfSlowHealth(int depth){
		String appearance = potionAppearances.get(2);
		final Item item = new Item('!', potionColors.get(appearance), "slow health potion", appearance);
		item.setQuaffEffect(new Effect(100){
			public void start(Creature creature){
				creature.doAction(item, "look a little better");
			}
			
			public void update(Creature creature){
				super.update(creature);
				creature.modifyHp(1, "Killed by a slow health potion?");
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newPotionOfPoison(int depth){
		String appearance = potionAppearances.get(3);
		final Item item = new Item('!', potionColors.get(appearance), "poison potion", appearance);
		item.setQuaffEffect(new Effect(20){
			public void start(Creature creature){
				creature.doAction(item, "look sick");
			}
			
			public void update(Creature creature){
				super.update(creature);
				creature.modifyHp(-1, "Died of poison.");
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item newPotionOfWarrior(int depth){
		String appearance = potionAppearances.get(4);
		final Item item = new Item('!', potionColors.get(appearance), "warrior's potion", appearance);
		item.setQuaffEffect(new Effect(20){
			public void start(Creature creature){
				creature.modifyAttackValue(5);
				creature.modifyDefenseValue(5);
				creature.doAction(item, "look stronger");
			}
			public void end(Creature creature){
				creature.modifyAttackValue(-5);
				creature.modifyDefenseValue(-5);
				creature.doAction("look less strong");
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}

	public Item newPotionOfArcher(int depth){
		String appearance = potionAppearances.get(5);
		final Item item = new Item('!', potionColors.get(appearance), "archers potion", appearance);
		item.setQuaffEffect(new Effect(20){
			public void start(Creature creature){
				creature.modifyVisionRadius(3);
				creature.doAction(item, "look more alert");
			}
			public void end(Creature creature){
				creature.modifyVisionRadius(-3);
				creature.doAction("look less alert");
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}

	public Item newPotionOfExperience(int depth){
		String appearance = potionAppearances.get(6);
		final Item item = new Item('!', potionColors.get(appearance), "experience potion", appearance);
		item.setQuaffEffect(new Effect(20){
			public void start(Creature creature){
				creature.doAction(item, "look more experienced");
				creature.modifyXp(creature.level() * 5);
			}
		});
		
		world.addAtEmptyLocation(item, depth);
		return item;
	}
	
	public Item randomPotion(int depth){
		switch ((int)(Math.random() * 9)){
		case 0: return newPotionOfHealth(depth);
		case 1: return newPotionOfHealth(depth);
		case 2: return newPotionOfSlowHealth(depth);
		case 3: return newPotionOfPoison(depth);
		case 4: return newPotionOfWarrior(depth);
		case 5: return newPotionOfWarrior(depth);
		case 6: return newPotionOfArcher(depth);
		default: return newPotionOfExperience(depth);
		}
	}	
}
