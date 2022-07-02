package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class GettingCrazy2 implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("They are getting crazy",1,3);
		terminal.write("The lab rats are getting crazy,Everyone is getting crazy, I am getting crazy!",1,5);
		terminal.write("The lab rats are attacking and harming themselves.",1,6);
		terminal.write("This is not good.",1,7);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter23Computer() : this;
	}
}