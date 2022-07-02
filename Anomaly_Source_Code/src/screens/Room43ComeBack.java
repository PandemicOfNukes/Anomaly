package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room43ComeBack implements Screen {
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in the lab rat 4 room.",1, 1);
		terminal.write("There is a toilet in the room and a strange device attached to the bed.",1,3);
		terminal.write("In the bed there is a body...",1,5);
		terminal.write("-- Press [q] to investigate the toilet --",1,7);
		terminal.write("-- Press [w] to investigate the strange device and the body --",1,8);
		terminal.write("-- Press [e] to go to the door --",1,9);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
			case KeyEvent.VK_Q:
				return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateToiletRoom43() : this;
			case KeyEvent.VK_W:
				return key.getKeyCode() == KeyEvent.VK_W ? new StrangeDeviceRoom43() : this;
		}
			return key.getKeyCode() == KeyEvent.VK_E ? new ControlCenter23ComeBack() : this;
	}
}