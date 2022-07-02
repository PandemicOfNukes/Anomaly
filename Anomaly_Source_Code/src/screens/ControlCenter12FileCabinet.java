package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter12FileCabinet implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Weird... Its unlocked...",1,1);
		terminal.write("There is only one file named:",1,2);
		terminal.write("Abandoned Laboratory to be reopened,1950",1,3);
		terminal.write("-- Press [q] to read 'Dream Game Labs [REDACTED] Building' --",1,10);
		terminal.write("-- Press [w] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new DreamGameLabsBuilding() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new ControlCenter12ComeBack() : this;
	}
}
