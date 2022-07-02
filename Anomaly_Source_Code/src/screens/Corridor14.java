package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Corridor14 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You pass the door you see that there are three ways you can go...",1,1);
		terminal.write("To the left, the right and forward leads to the cafeteria...",1,3);
		terminal.write("-- Press [q] to go to the left --",1,10);
		terminal.write("-- Press [w] to go to the right --",1,11);
		terminal.write("-- Press [e] to go to the cafeteria --",1,12);
		terminal.write("-- Press [r] to go back --",1,13);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Corridor14Left() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new Corridor14Right() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new ControlCenter14ComeBack() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new Cafeteria14() : this;
	}
}
