package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StrangeDevice16 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("In the bed there is a device and several syringes...",1,1);
		terminal.write("The syringes are empty and the device itself is broken...",1,3);
		terminal.write("You cant do anything with this...",1,5);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Room16ComeBack() : this;	
	}
}