package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class MandatoryEvacuation implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Mandatory Evacuation",1);
		terminal.write("To all employees,",1,2);
		terminal.write("Mandatory Evacuation is in effect.",1,4);
		terminal.write("Please proceed to [REDACTED].",1,5);
		terminal.write("'Scribled by a pencil is writen:'",1,6);
		terminal.write("Who the hell redacted the evacuation site?",1,8);
		terminal.write("And when the world is going to hell!",1,9);
		terminal.write("-- Press [q] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter15FileCabinet() : this;
	}
}