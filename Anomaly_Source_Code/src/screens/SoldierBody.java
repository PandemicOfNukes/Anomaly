package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class SoldierBody implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("You aproach the body, it has a bullet on its head...",1,1);
		terminal.write("The body is not old but not fresh...",1,3);
		terminal.write("The soldier is holding a old notebook...",1,5);
		terminal.write("-- Press [q] to read the old notebook --",1,10);
		terminal.write("-- Press [w] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}