package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room12ComeBack implements Screen {
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in your room...",1, 1);
		terminal.write("You see the reflection of your image in the window",1,3);
		terminal.write("There is a toilet in your room and a strange device attached to your bed.",1,5);
		terminal.write("In front of you there is a open door...",1,7);
		terminal.write("-- Press [q] to investigate the toilet --",1,9);
		terminal.write("-- Press [w] to investigate the strange device --",1,10);
		terminal.write("-- Press [e] to go to the door --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
			case KeyEvent.VK_Q:
				return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateToiletRoom12() : this;
			case KeyEvent.VK_W:
				return key.getKeyCode() == KeyEvent.VK_W ? new StrangeDeviceRoom12() : this;
		}
			return key.getKeyCode() == KeyEvent.VK_E ? new ControlCenter12() : this;
	}
}
