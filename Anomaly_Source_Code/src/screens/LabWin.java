package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class LabWin implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("You try the mix in the note and success!",1,1);
		terminal.write("The note reads: 7",1,2);
		terminal.write("Before you realise the door closes and locks you in the laboratory",1,4);
		terminal.write("-- Press [space] to continue --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new LabDeath() : this;
	}

}
