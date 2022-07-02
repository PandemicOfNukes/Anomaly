package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Notebook3 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		
		terminal.write("DAY 3",1,1);
		terminal.write("We finished our fortifications today.",1,3);
		terminal.write("Theres not much to do so we sit and listen to the radio...",1,5);
		terminal.write("Several countries are saying that they come from the water",1,7);
		terminal.write("as more bases are overrun by Anomalies...",1,8);
		terminal.write("We are losing... maybe this is the DoomsDay Event we are all dreading about.",1,10);
		terminal.write("-- Press [q] to continue reading --",1,20);
		terminal.write("-- Press [w] to stop reading --",1,21);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Notebook4() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_W ? new Cafeteria16ComeBack() : this;
	}
}