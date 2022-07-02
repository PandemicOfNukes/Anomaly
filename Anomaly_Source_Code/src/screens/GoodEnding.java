package testeGUi.screens;

import java.awt.event.KeyEvent;

import asciiPanel.AsciiPanel;

public class GoodEnding implements Screen {

	@Override
	public void displayOutput(AsciiPanel terminal) {
		System.out.println(this);
		terminal.writeCenter("Good Ending - Lost In The New World",1);
		terminal.write("Walking between the corpses of dead Anomalies you hear a voice saying:",1,3);
		terminal.write("'You are free now... welcome to a new world created by your species...'",1,4);
		terminal.write("In the distance you see a mushroom cloud... the rest of the way is desert...",1,6);
		terminal.write("You are free now... not owned by anybody...",1,8);
		terminal.write("-- Press [space] to continue --",1,10);
	}

	@Override
	public Screen respondToUserInput(KeyEvent key) {
		return key.getKeyCode() == KeyEvent.VK_SPACE ? new StartScreenGoodEnding() : this;
	}
}