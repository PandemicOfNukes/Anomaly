package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StrangeDeviceRoom13 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("In the bed there is a device and several syringes...",1,1);
		terminal.write("You can attach yourself to the device...",1,3);
		terminal.write("-- Press [q] to go back --",1,7);
		terminal.write("-- Press [r] to attach yourself --",1,8);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_R:
			PlayScreen3.death = 0;
			return key.getKeyCode() == KeyEvent.VK_R ? new PlayScreen3() : this;
	}
		return key.getKeyCode() == KeyEvent.VK_Q ? new Room13ComeBack() : this;	
	}
}
