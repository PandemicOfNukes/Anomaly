package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Corridor1Map1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("The map in the wall is stuck and it looks like its burnt...",1,1);
		terminal.write("You can only see the names of the rooms:",1,2);
		terminal.write("Room 1, Control Center 1, Room 2, Cafeteria, Blast Doors,",1,3);
		terminal.write("Control Center 2, Room 3, Room 4...",1,4);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Corridor1Right() : this;
	}

}
