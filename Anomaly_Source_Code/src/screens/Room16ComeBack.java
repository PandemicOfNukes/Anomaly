package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Room16ComeBack implements Screen{

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in your room.",1,1);
		terminal.write("The room is filthy the white in the room is turning dark...",1,2);
		terminal.write("The window in your room broken you can clearly see the other side...",1,4);
		terminal.write("You see a bed with a strange device...",1,6);
		terminal.write("You also see a toilet...",1,8);
		terminal.write("There is a open door in front of you...",1,10);
		terminal.write("-- Press [q] to investigate the toilet --",1,12);
		terminal.write("-- Press [w] to investigate the strange device --",1,13);
		terminal.write("-- Press [e] to go to the door --",1,14);		
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateToiletRoom16() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new StrangeDevice16() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new ControlCenter16() : this;
	}
}