package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room13 implements Screen {
	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You wake up in a white room, there is a a window reflecting your image.",1, 1);
		terminal.write("There is something writen in the window... But you can't understand...",1,3);
		terminal.write("There is a toilet in your room and a strange device attached to your bed.",1,5);
		terminal.write("In front of you there is a open door...",1,7);
		terminal.write("-- Press [q] to investigate the writting --",1,10);
		terminal.write("-- Press [w] to investigate the toilet --",1,11);
		terminal.write("-- Press [e] to investigate the strange device --",1,12);
		terminal.write("-- Press [r] to go to the door --",1,13);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
			case KeyEvent.VK_Q:
				return key.getKeyCode() == KeyEvent.VK_Q ? new Room13Writting() : this;
			case KeyEvent.VK_W:
				return key.getKeyCode() == KeyEvent.VK_W ? new ExaminateToiletRoom13() : this;
			case KeyEvent.VK_E:
				return key.getKeyCode() == KeyEvent.VK_E ? new StrangeDeviceRoom13() : this;
		}
			return key.getKeyCode() == KeyEvent.VK_R ? new ControlCenter13() : this;
	}
}
		
