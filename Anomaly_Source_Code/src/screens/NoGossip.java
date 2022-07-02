package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class NoGossip implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("EZ SM-SOD Reader",1);
		terminal.write("No Gossip!",1,3);
		terminal.write("I want to remind to all operators, soldiers and scientists",1,5);
		terminal.write("that you are being recorded so NO GOSSIP of confidential matters!",1,6);
		terminal.write("-- Press [q] to go back --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new ControlCenter14Computer() : this;
	}

}
