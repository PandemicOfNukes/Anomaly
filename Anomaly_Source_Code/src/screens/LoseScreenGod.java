package testeGUi.screens;

import java.awt.event.KeyEvent;

import testeGUi.Creature;

import asciiPanel.AsciiPanel;

public class LoseScreenGod implements Screen {
	private Creature player;
	
	public LoseScreenGod(Creature player){
		this.player = player;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("R.I.P. - Even in God mode you die?", 3);
		terminal.writeCenter(player.causeOfDeath(), 5);
		terminal.writeCenter("You Lost " + PlayScreenGod.death + " Times", 7);
		terminal.writeCenter("-- press [enter] to restart --", 17);
		terminal.writeCenter("-- press [b] to go back --",19);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_ENTER:
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreenGod() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_B ? new StartScreen() : this;
	}
}