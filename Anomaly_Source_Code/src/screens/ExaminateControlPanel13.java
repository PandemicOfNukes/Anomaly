package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateControlPanel13 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("The Panel Is saying that the blast doors are closed...",1,1);
		terminal.write("There is a 4 key passcode to open it...",1,2);
		terminal.write("There is a number writen in the control panel: '5___'",1,3);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Cafeteria13ComeBack() : this;
	}
}