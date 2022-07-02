package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class SurvivalDifficulty implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println("this");
		terminal.write("Choose one of the difficulties.",1,1);
		terminal.write("Normal Mode: How Survival was meant to be played",1,3);
		terminal.write("God Mode: Health is not a problem",1,5);
		terminal.write("-- Press [n] to choose Normal Mode --",1,10);
		terminal.write("-- Press [g] to choose God Mode --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_N:
			return key.getKeyCode() == KeyEvent.VK_N ? new PlayScreenSurvival() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_G ? new PlayScreenGod() : this;
	}
}