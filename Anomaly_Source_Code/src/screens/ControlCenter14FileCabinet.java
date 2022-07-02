package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter14FileCabinet implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Weird... Its unlocked...",1,1);
		terminal.write("There is two files named:",1,2);
		terminal.write("Abandoned Laboratory to be reopened,1950",1,3);
		terminal.write("Memo: Strange Architeture,1968",1,4);
		terminal.write("Memo: Gossip,1979",1,5);
		terminal.write("-- Press [q] to read 'Dream Game Labs [REDACTED] Building' --",1,10);
		terminal.write("-- Press [w] to read 'Memo: Strange Architeture' --",1,11);
		terminal.write("-- Press [e] to read 'Memo: Gossip' --",1,12);
		terminal.write("-- Press [r] to go back --",1,13);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new DreamGameLabsBuilding3() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new StrangeArchiteture2() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new MemoGossip() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new ControlCenter14ComeBack() : this;
	}
}
