package testeGUi.screens;

import java.awt.event.KeyEvent;
import asciiPanel.AsciiPanel;

public class HelpScreenError implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.clear();
		terminal.write("Is someone there?", 1,1);

		
		terminal.writeCenter("-- press any key to continue --", 22);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return null;
	}
}
