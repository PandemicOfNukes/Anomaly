package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class PermissionDenied implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("Permission Denied",1,3);
		terminal.write("We are sorry to say but we cant move the Lab Rats to a more 'secure' location.",1,5);
		terminal.write("Dream Games Lab Building [REDACTED] is already secure enough.",1,6);
		terminal.write("So Permission Denied, Thank You.",1,7);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter23Computer() : this;
	}
}