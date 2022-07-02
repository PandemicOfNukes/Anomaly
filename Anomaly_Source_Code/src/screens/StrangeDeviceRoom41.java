package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class StrangeDeviceRoom41 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("In the bed there is a device and several syringes...",1,1);
		terminal.write("In the bed there is a body with black eyes and several eruptions on the skin.",1,3);
		terminal.write("You can attach yourself to the device...",1,5);
		terminal.write("-- Press [q] to go back --",1,10);
		terminal.write("-- Press [r] to attach yourself --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_R:
			PlayScreen2.death = 0;
			return key.getKeyCode() == KeyEvent.VK_R ? new PlayscreenAnomaly() : this;
	}
		    return key.getKeyCode() == KeyEvent.VK_Q ? new Room41ComeBack() : this;	
	}
}