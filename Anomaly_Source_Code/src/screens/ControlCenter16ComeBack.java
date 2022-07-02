package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter16ComeBack implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in the Control Center.",1,1);
		terminal.write("The room is trashed with papers scatered in the floor...",1,3);
		terminal.write("The File Cabinet is opened and empty...",1,5);
		terminal.write("The computer is broken with the monitor on the floor...",1,7);
		terminal.write("In the walls are panflets and posters saying:",1,9);
		terminal.write("'QUARANTINE UNDER EFFECT' and 'MANDATORY EVACUATION'",1,10);
		terminal.write("There is a open door leading to the corridor...",1,12);
		terminal.write("Theres is nothing much here...",1,14);
		terminal.write("-- Press [q] to read the poster 'QUARANTINE UNDER EFFECT' --",1,16);
		terminal.write("-- Press [w] to read the poster 'MANDATORY EVACUATION' --",1,17);
		terminal.write("-- Press [e] to go to the corridor --",1,18);
		terminal.write("-- Press [r] to go back --",1,19);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new PosterQuarantine() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new PosterEvacuation() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new Room16ComeBack(): this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new Corridor16() : this;
	}
}