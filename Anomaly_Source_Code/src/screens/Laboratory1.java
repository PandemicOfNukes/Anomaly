package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Laboratory1 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You enter in the Laboratory...",1,1);
		terminal.write("Most of the equipment has been destroyed or taken...",1,3);
		terminal.write("You see a table with vials and a note...",1,5);
		terminal.write("There is also a poster of some chemicals near the sink...",1,7);
		terminal.write("-- Press [q] to read the note --",1,10);
		terminal.write("-- Press [w] to read the poster --",1,11);
		terminal.write("-- Press [e] to go to the sink --",1,12);
		terminal.write("-- Press [r] to go the vials --",1,13);
		terminal.write("-- Press [t] to go back --",1,14);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new Note2() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new LabPoster() : this;
		case KeyEvent.VK_E:
			return key.getKeyCode() == KeyEvent.VK_E ? new ExaminateSink() : this;
		case KeyEvent.VK_R:
			return key.getKeyCode() == KeyEvent.VK_R ? new ExaminateVials() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_T ? new Cafeteria14ComeBack() : this;
	}
}