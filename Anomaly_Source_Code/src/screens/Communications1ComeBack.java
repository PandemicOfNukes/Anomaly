package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class Communications1ComeBack implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You are in the communications room.",1,1);
		terminal.write("The room is filled with broken equipment but not naturally... Intentional",1,3);
		terminal.write("There is only one radio that is not broken with a note written beside it.",1,5);
		terminal.write("-- Press [q] to go to the radio --",1,10);
		terminal.write("-- Press [w] to read the note --",1,11);
		terminal.write("-- Press [e] to go back --",1,12);
		
}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		switch(key.getKeyCode()) {
		case KeyEvent.VK_Q:
			return key.getKeyCode() == KeyEvent.VK_Q ? new ExaminateRadio() : this;
		case KeyEvent.VK_W:
			return key.getKeyCode() == KeyEvent.VK_W ? new Note1() : this;
		}
		return key.getKeyCode() == KeyEvent.VK_E ? new Cafeteria1ComeBack() : this;
	}

}
