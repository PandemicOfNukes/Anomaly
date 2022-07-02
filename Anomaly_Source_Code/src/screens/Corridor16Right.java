package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Corridor16Right implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You go through the right...",1,1);
		terminal.write("There is a broken window poiting to your room",1,2);
		terminal.write("You see your filthy room...",1,3);
		terminal.write("You also see a map...",1,5);
		terminal.write("-- Press [q] to investigate the map --",1,10);
		terminal.write("-- Press [e] to go back --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Corridor16Map6() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new Corridor16ComeBack() : this;
	}
}