package testeGUi.screens;

import java.awt.event.KeyEvent;

import testeGUi.Creature;

import asciiPanel.AsciiPanel;

public class LoseScreenSurvival implements Screen {
	private Creature player;
	
	public LoseScreenSurvival(Creature player){
		this.player = player;
	}
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("R.I.P.", 3);
		terminal.writeCenter(player.causeOfDeath(), 5);
		terminal.writeCenter("You Lost " + PlayScreenSurvival.death + " Times", 7);
		terminal.writeCenter("-- press [enter] to restart --", 17);
		terminal.writeCenter("-- press [b] to go back --",19);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_ENTER:
			return key.getKeyCode() == KeyEvent.VK_ENTER ? new PlayScreenSurvival() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_B ? new StartScreen() : this;
	}
}