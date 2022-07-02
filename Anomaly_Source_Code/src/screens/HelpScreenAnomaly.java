package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class HelpScreenAnomaly implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.write("RUN",1,1);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return null;
	}
}