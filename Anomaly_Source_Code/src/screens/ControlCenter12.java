package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter12 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("After passing the door you see the control room.",1,1);
		terminal.write("Its quite a simple room for the room who controlled you...",1,3);
		terminal.write("In the desk you see a turned off computer",1,5);
		terminal.write("You also see a file cabinet",1,7);
		terminal.write("There is a locked door with a sign saying: 'Lab Rat Room 2'",1,9);
		terminal.write("there is no way to open it...",1,10);
		terminal.write("There is a open door leading to the corridor...",1,12);
		terminal.write("-- Press [q] to investigate the computer --",1,14);
		terminal.write("-- Press [w] to investigate the file cabinet --",1,15);
		terminal.write("-- Press [e] to go to the corridor --",1,16);
		terminal.write("-- Press [r] to go to your room --",1,17);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter12Computer() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new ControlCenter12FileCabinet() : this;	
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new Corridor12() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Room12ComeBack() : this;
	}

}
