package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ControlCenter24 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You see the second Control Center.",1,1);
		terminal.write("Its a even simpler room compared to the other Control Center",1,3);
		terminal.write("In the desk you see a computer",1,5);
		terminal.write("There is a open door with a sign saying: 'Lab Rat Room 4'",1,7);
		terminal.write("There is a open door with a sign saying: 'Lab Rat Room 3'",1,9);
		terminal.write("-- Press [q] to investigate the computer --",1,14);
		terminal.write("-- Press [w] to go to the Lab Rat Room 4 --",1,15);
		terminal.write("-- Press [e] to go to the Lab Rat Room 3 --",1,16);
		terminal.write("-- Press [r] to go back --",1,17);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter24Computer() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new Room44() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new Room31() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_R ? new Cafeteria15ComeBack() : this;
	}
}
