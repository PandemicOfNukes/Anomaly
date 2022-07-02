package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StrangeArchiteture3 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Memo: Strange Architeture",1);
		terminal.write("To all employees,",1,2);
		terminal.write("All the higher ups know about the strange architeture of the building.",1,4);
		terminal.write("Please understand that this building is old and it was made quickly.",1,5);
		terminal.write("Thank You for your understanding",1,7);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter15FileCabinet() : this;
		}
}
