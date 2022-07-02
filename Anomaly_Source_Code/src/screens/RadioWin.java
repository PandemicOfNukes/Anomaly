package testeGUi.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class RadioWin implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("A voice coming out of the radio says a number: 8",1,1);
		terminal.write("Before you realise the door closes and locks you in...",1,3);
		terminal.write("A voice in the intercom says: 'Intruder Detected Realising Gas'",1,4);
		terminal.write("-- Press [space] to continue --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new GasRelease() : this;
	}
}