package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class ExaminateControlPanel15 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("The Panel Is saying that the blast doors are closed...",1,1);
		terminal.write("There is a 4 key passcode to open it...",1,2);
		terminal.write("There is three numbers writen in the control panel: '587_'",1,3);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new Cafeteria15ComeBack() : this;
	}
}