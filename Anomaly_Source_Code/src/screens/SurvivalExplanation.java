package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class SurvivalExplanation implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println("this");
		terminal.write("This the survival mode.",1,1);
		terminal.write("This is a mode that is only the roguelike!",1,3);
		terminal.write("I recommend that you first play the story mode!",1,5);
		terminal.write("Do you want to proceed with Survival Mode?(This is your last warning)",1,7);
		terminal.write("-- Press [n] to go back --",1,10);
		terminal.write("-- Press [y] to proceed --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_N:
			return key.getKeyCode() == KeyEvent.VK_N ? new StartScreen() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_Y ? new SurvivalDifficulty() : this;
	}
}