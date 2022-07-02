package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateToiletRoom1 implements Screen {
	
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("Its a normal toilet... surprisingly clean.",1, 1);
		terminal.write("-- Press [q] to go back --",1,8);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Room1ComeBack() : this;
	}
}
