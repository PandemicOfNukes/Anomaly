package testeGUi.screens;

import java.awt.event.KeyEvent;

import testeGUi.Creature;

import asciiPanel.AsciiPanel;

public class LoseScreen2 implements Screen {
	private Creature player;
	
	public LoseScreen2(Creature player){
		this.player = player;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("R.I.P.", 3);
		terminal.writeCenter(player.causeOfDeath(), 5);
		//terminal.writeCenter("You Lost " + PlayScreen2.death + " Times", 7);
		terminal.writeCenter("-- press [enter] to restart --", 17);
		if (PlayScreen2.death >= 3) 
			terminal.writeCenter("'You start to feel the sedatives wearing out...'", 18);
	    if(PlayScreen2.death >= 4)
			terminal.writeCenter("'You are half awake...'", 19);
	    if(PlayScreen2.death >= 5)
			terminal.writeCenter("'You are awake...'", 20);
		if(PlayScreen2.death >= 6) {
			terminal.writeCenter("Stone Link Fully Lost", 21);
			terminal.writeCenter("-- press [enter] to get up --", 22);
		}
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		if(PlayScreen2.death == 6) {
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new Room12() : this;
		} else
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreen2() : this;
	}
}

