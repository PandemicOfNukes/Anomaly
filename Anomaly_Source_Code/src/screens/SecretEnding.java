package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class SecretEnding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);

		terminal.writeCenter("Secret Ending - Ignorance is Bliss",1);
		terminal.write("Maybe ignorance is for the best",1,3);
		terminal.write("This universe is pretty screwed up if you think about it...",1,5);
		terminal.write("People dying and killing each other is sad really...",1,7);
		terminal.write("So close the game... maybe is for the best...",1,9);
		terminal.write("-- Press the [X] in the bar to close the universe --",1,11);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return null;
	}

}
