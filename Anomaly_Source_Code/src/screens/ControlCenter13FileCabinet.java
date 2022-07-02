package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter13FileCabinet implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Weird... Its unlocked...",1,1);
		terminal.write("There is two files named:",1,2);
		terminal.write("Abandoned Laboratory to be reopened,1950",1,3);
		terminal.write("Memo: Strange Architeture,1968",1,4);
		terminal.write("-- Press [q] to read 'Dream Game Labs [REDACTED] Building' --",1,10);
		terminal.write("-- Press [w] to read 'Memo: Strange Architeture' --",1,11);
		terminal.write("-- Press [e] to go back --",1,12);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new DreamGameLabsBuilding2() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new StrangeArchiteture() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new ControlCenter13ComeBack() : this;
	}
}
