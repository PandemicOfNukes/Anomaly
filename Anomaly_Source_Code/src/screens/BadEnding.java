package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class BadEnding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Bad Ending - One of them",1);
		terminal.write("Your eyes turn black, Your skin starts to calcify...",1,2);
		terminal.write("You lose consciousness and you faint your own pool of black blood...",1,3);
		terminal.write("You wake up furious and start searching for a prey...",1,5);
		terminal.write("You turned one of them...",1,7);
		terminal.write("-- Press [q] to give up --",1,10);
}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_Q ? new StartScreenBadEnding() : this; 
	}
}