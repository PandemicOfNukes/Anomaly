package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room15Writting implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Everyone I love is dead... and they came back to kill us...",1,1);
		terminal.write("The stone as consumed them...",1,2);
		terminal.write("-- Press [q] to go back --",1,10);		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Room15ComeBack() : this;
	}

}
