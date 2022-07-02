package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateTables14 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("The tables are dirty and with nothing interesting in them.",1,1);
		terminal.write("There is something writen in the tables: 'We are going...'",1,2);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Cafeteria14ComeBack() : this;
	}
}